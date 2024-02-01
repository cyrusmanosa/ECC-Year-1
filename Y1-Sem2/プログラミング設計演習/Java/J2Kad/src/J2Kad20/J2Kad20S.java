package J2Kad20;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
/*
	課題名：J2Kad20S「ライフゲーム?@（初期データの表示）」
	作成日：2022/12/08
	作成者：田中太郎
*/
public class J2Kad20S {
    public static final int WIDTH = 40;
    public static final int HEIGHT = 24;
    public static void main(String[] args) {
        Canvas c = new Canvas(WIDTH, HEIGHT);
        initCanvas(c);
        c.show();
    }
    public static void initCanvas(Canvas c) {
        Scanner in = new Scanner(System.in);
        System.out.print("読み込むデータファイル名＞ ");
        String filename = in.next();
        System.out.print("X座標＞ ");
        int Xset = Integer.parseInt(in.next());
        System.out.print("Y座標＞ ");
        int Yset = Integer.parseInt(in.next());
        try {
                BufferedReader br = new BufferedReader(new FileReader("./data/" + filename + ".txt"));
                int y = 0;
                String line = null;
                for ( int i = 0 ; i < line.length(); i++ ){
                    c.setPoint(Xset + i, Yset + 0, line.charAt(i) == '*');
                }
        } catch (IOException e){
            System.out.println(e);
        }
    }
}