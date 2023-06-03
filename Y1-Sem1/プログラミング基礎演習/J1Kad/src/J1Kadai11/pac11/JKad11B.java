package J1Kadai11.pac11;

import java.util.Scanner;

class JKad11B{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("そうだ！水族館へ行こう！！");
        System.out.print("あなたの年齢を入力してください＞");
        int a = in.nextInt();
        if (a >= 65) {
            System.out.println("シニア料金：2200 円になります！");
        }else if (a < 65 && a >= 15 ) {
            System.out.println("大人料金：2400 円になります！");
        }else if ( a >= 6 && a < 15 ){
            System.out.println("子供料金：1200 円になります！");
        }else if (a >= 3 && a < 6) {
            System.out.println("幼児料金：600 円になります！");
        }else {
            System.out.println("無料です！");
        }
        in.close();
    }
}