package com.example.trytouchevent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener{
    private float downX;
    private float downY;
    private float upX;
    private float upY;

    private  final int CPU_IMAGES[] =
            {
                    R.drawable.point_up,
                    R.drawable.point_right,
                    R.drawable.point_down,
                    R.drawable.point_left
            };
    private ImageView ivCpu;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout view = findViewById(R.id.view);
        ivCpu = findViewById(R.id.ivCpu);
        tvResult = findViewById(R.id.tvResult);
        view.setOnTouchListener(this);
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
                Log.d("debug","Flick = " + getFlickVector());
                gudge();
        }
        return true;
    }

    private int getFlickVector(){
        float buffer = 200;
        int flickVector = -1;
        if ( ( downX < upX ) && Math.abs( downY - upY ) < buffer){
            int RIGHT_FLICK = 1;
            flickVector = RIGHT_FLICK;
        }else if( upX < downX && Math.abs( downY - upY ) < buffer){
            int LEFT_FLICK = 3;
            flickVector = LEFT_FLICK;
        }else if ( downY < upY ){
            int DOWN_FLICK = 2;
            flickVector = DOWN_FLICK;
        }else if ( upY < downY ){
            int UP_FLICK = 0;
            flickVector = UP_FLICK;
        }
        return flickVector;
    }

    public void gudge(){
        int myFlick = getFlickVector();
        int cpuSelect = (int)(Math.random()*CPU_IMAGES.length);
        ivCpu.setImageResource(CPU_IMAGES[cpuSelect]);

        boolean result = (myFlick == cpuSelect);
        tvResult.setText(result?"あなたの勝ち":"引き分け");
    }
}