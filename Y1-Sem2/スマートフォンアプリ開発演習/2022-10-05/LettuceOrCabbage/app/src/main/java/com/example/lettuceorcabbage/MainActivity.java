package com.example.lettuceorcabbage;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvTop;
    Button btCabbage;
    Button btLettuce;
    ImageView ivQ;
    int ans1;
    int ans2;
    final int CABBAGE = 0;
    final int LETTUCE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maingame);

        // ウィジェットの変数とレイアウトのウィジェットを関連付ける
        tvTop = findViewById(R.id.tvTop);
        btCabbage = findViewById(R.id.btCabbage);
        btLettuce = findViewById(R.id.btLettuce);
        ivQ = findViewById(R.id.ivQ);

        //　特定のボタンに対しての検知登録
        SelectListerner selectListerner = new SelectListerner();
        ivQ.setOnClickListener(selectListerner);
        btCabbage.setOnClickListener(selectListerner);
        btLettuce.setOnClickListener(selectListerner);

        // 1問目の正解を格納
        ans1 = CABBAGE;
        ans2 = LETTUCE;
    }

    /*
    ボタンをクリックした時に呼ばれるクラス
     */
    private void judge1 (int selectBt){
        // 正解と回答が一致している場合
        if(ans1 == selectBt){
            tvTop.setText(R.string.judge_success);
        }else{
            tvTop.setText(R.string.judge_failure);
        }
    }

    private class SelectListerner implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            // GONE kieru
            btLettuce.setVisibility(View.GONE);
            // deru
            btLettuce.setVisibility(View.VISIBLE);


            switch (view.getId()) {
                case R.id.btCabbage:
                    judge1(CABBAGE);
                    // レタスボタンをグレーアウト
                    btCabbage.setEnabled(false);
                    btLettuce.setEnabled(false);
                    break;

                case R.id.btLettuce:
                    judge1(LETTUCE);
                    // キャベツボタンをグレーアウト
                    btCabbage.setEnabled(false);
                    btLettuce.setEnabled(false);
                    break;
            }
            ivQ.setImageResource(R.drawable.fin);
        }
    }
}