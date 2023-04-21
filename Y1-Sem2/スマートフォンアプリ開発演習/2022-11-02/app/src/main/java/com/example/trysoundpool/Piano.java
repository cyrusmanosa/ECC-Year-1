package com.example.trysoundpool;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;

public class Piano {
    private SoundPool soundPool;

    private int soundFiles[] = {
            R.raw.do5,R.raw.do5s,R.raw.re5,
            R.raw.re5s,R.raw.mi5,R.raw.fa5,
            R.raw.fa5s,R.raw.so5,R.raw.so5s,
            R.raw.ra5,R.raw.ra5s,R.raw.si5,
            R.raw.do6
    };

    public Piano(Context context){
        soundPool = new SoundPool(soundFiles.length, AudioManager.STREAM_MUSIC,0);
        for ( int i = 0 ; i < soundFiles.length; i++){
            soundPool.load(context,soundFiles[i],1);
        }
    }

    public void play(int soundI){
        soundPool.play(soundI+1,1.0f,1.0f,0,0,1.0f);
    }

    public void playMelogy(){
        int melody[] = {5,5,5,5,3,7,5};
        try{
            for (int i = 0 ; i < melody.length; i++){
                play(melody[i]);
                Thread.sleep(100);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
