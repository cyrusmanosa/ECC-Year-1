package com.example.trysoundpool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private int btIds[] = {
            R.id.btDo5,R.id.btDo5s,R.id.btRe5,
            R.id.btRa5s,R.id.btMi5,R.id.btFa5,
            R.id.btFa5s,R.id.btSo5,R.id.btSo5s,
            R.id.btRa5,R.id.btRa5s,
            R.id.btSi5,R.id.btDo6
    };

    private Button kenban[] = new Button[btIds.length];

    Piano mPiano;
    private Button btMelody;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.piano);
        for(int i = 0; i < kenban.length; i++){
            kenban[i] = findViewById(btIds[i]);
            kenban[i].setOnClickListener(this);
        }

        mPiano = new Piano(getApplicationContext());

        btMelody = findViewById(R.id.btAutoMusic1);

        btMelody.setOnClickListener(this);
    }
    public void onClick(View view) {
        if (view.getId() == R.id.btAutoMusic1) {
            mPiano.playMelogy();
        } else {
            for (int i = 0; i < btIds.length; i++) {
                if (view.getId() == btIds[i])
                    mPiano.play(i);
            }
        }
    }
}