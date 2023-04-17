package com.example.trywebapi;

import androidx.annotation.WorkerThread;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.os.HandlerCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainActivity extends AppCompatActivity implements ICallWebAPI{
    private final String WEATHERINFO_URL = "https://api.openweathermap.org/data/2.5/weather?lang=ja";
    private final String APP_ID = "89674f2f546e2798a06a390b464f87bd";
    private RecyclerView recyclerView;

    private String is2String(InputStream stream) throws IOException{
        StringBuilder sb = new StringBuilder();
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream,"UTF-8"));
        String line = reader.readLine();
        while (line != null){
            sb.append(line);
            line = reader.readLine();
        }
        reader.close();
        return sb.toString();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weather);
        recyclerView = findViewById(R.id.rvCityList);
        recyclerView.setAdapter(new RecyclerAdapter());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ViewHolder.listener = this;
    }

    @Override
    public void receiveWeatherInfo(String key){
        String urlFull = WEATHERINFO_URL + "&q=" + key + "&appid=" + APP_ID;
        Handler handler = HandlerCompat.createAsync(getMainLooper());
        Runnable backgroundReceiver = new WeatherInfoBackgroundReceiver(handler,urlFull);
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(backgroundReceiver);
    }

    private class WeatherInfoBackgroundReceiver implements Runnable{
        private final Handler _handler;
        private final String _url;

        public WeatherInfoBackgroundReceiver(Handler handler, String urlFull){
            _handler = handler;
            _url = urlFull;
        }

        @Override
        @WorkerThread
        public void run(){
            try{
                String result = "";
                URL url = new URL(_url);
                HttpURLConnection con = (HttpURLConnection) url.openConnection();
                if(con != null){
                    con.setConnectTimeout(1000);
                    con.setReadTimeout(1000);
                    con.setRequestMethod("GET");
                    con.connect();
                    InputStream stream = con.getInputStream();
                    result = is2String(stream);
                    stream.close();
                    con.disconnect();
                }

                WeatherInfoPostExecutor postExecutor = new WeatherInfoPostExecutor(result);
                _handler.post(postExecutor);

            }catch (IOException e){
                e.printStackTrace();
            }
        }

        private class WeatherInfoPostExecutor implements Runnable{
            private String _result;
            public WeatherInfoPostExecutor(String result){ _result = result;}
            @Override
            public void run(){
                JSONObject rootJSON = null;
                try{
                    rootJSON = new JSONObject(_result);
                    String cityName = rootJSON.getString("name");
                    JSONObject coordJOSN = rootJSON.getJSONObject("coord");
                    String latitude = coordJOSN.getString("lat");
                    String longitude = coordJOSN.getString("lon");
                    JSONArray weatherJSONArray = rootJSON.getJSONArray("weather");
                    JSONObject weatherJSON = weatherJSONArray.getJSONObject(0);
                    String weather = weatherJSON.getString("description");
                    String telop = cityName + "の天気";
                    JSONObject mainJSON = rootJSON.getJSONObject("main");
                    int temp = (int)(Double.parseDouble(mainJSON.getString("feels_like")));
                    String feelslike = "体感温度は" + (temp - 273) + "度です";
                    String desc = "現在は" + weather + "です。\n経度は" + latitude + "度で経度は" + longitude + "度です";
                    TextView tvWeatherTelop = findViewById(R.id.tv_WeatherTelop);
                    TextView tvWeatherDesc = findViewById(R.id.tv_WeatherDesc);
                    TextView tvFeelslike = findViewById(R.id.tv_feelslike);

                    tvWeatherTelop.setText(telop);
                    tvWeatherDesc.setText(desc);
                    tvFeelslike.setText(feelslike);
                }catch (JSONException e){
                    e.printStackTrace();
                }
            }
        }
    }
}