package com.example.checkkadai;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener{
    private ConstraintLayout view;
    Button start;
    private float downX;
    private float downY;
    private float upX;
    private float upY;
    private final int CPU_IMAGES[] =
            {
                    R.drawable.a1,
                    R.drawable.a2,
                    R.drawable.a3,
                    R.drawable.a4,
                    R.drawable.a5
            };
    private final String Warukuchi[] =
            {
                    "呆れるわ！","生きてる価値なし","嘘つき！","えんどう豆みたいだな！","オタクが",
                    "閑古鳥もなくわ！","金魚の糞","くそやろう！","刑務所帰れよ","腰抜け！",
                    "ささくれ野郎が！","しれっとすんなよ","少ない頭で考えろよ","施工してもらうか？","そそられないな",
                    "宝物壊すぞ？","力尽きろよ","釣り合ってないよ","デブが！！！","トイレの匂いする"

            };
    private ImageView ivCpu;
    private TextView tvResult;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view = findViewById(R.id.view);
        ivCpu = findViewById(R.id.ivCpu);
        start = findViewById(R.id.start);
        tvResult = findViewById(R.id.tvResult);
        start.setOnTouchListener(this);
    }


    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case MotionEvent.ACTION_DOWN:
                downX = motionEvent.getX();
                downY = motionEvent.getY();
                Log.d("debug", "onTouch() call");
                Log.d("debug","downX = " + downX);
                Log.d("debug","downX = " + downY);
                break;
            case MotionEvent.ACTION_UP:
                upX = motionEvent.getX();
                upY = motionEvent.getY();
                Log.d("debug","onTouch() ACTION_UP");
                Log.d("debuy","upX = "+upX);
                Log.d("debuy","upX = "+upY);
                gudge();
        }
        return true;
    }

    public void gudge(){
        start.setVisibility(View.GONE);
        int cpuSelect = (int)(Math.random()*CPU_IMAGES.length);
        int textlect = (int)(Math.random()*Warukuchi.length);
        ivCpu.setImageResource(CPU_IMAGES[cpuSelect]);
        tvResult.setText(Warukuchi[textlect]);
        view.setOnTouchListener(this);
    }
}