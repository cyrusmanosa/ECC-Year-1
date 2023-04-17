 package com.example.tryrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

 public class MainActivity extends AppCompatActivity implements ICallWebView{
     private RecyclerView recyclerView;
     private WebView webView;
     private String url = "https://google.com";

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv);
        recyclerView.setAdapter(new RecyclerAdapter());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        webView = findViewById(R.id.wv);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);
        ViewHolder.listener = this;
    }

    @Override
     public void setWebViewURL(String url){
        webView.loadUrl(url);
    }
}