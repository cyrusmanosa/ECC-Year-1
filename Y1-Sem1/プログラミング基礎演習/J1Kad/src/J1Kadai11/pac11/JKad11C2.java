package J1Kadai11.pac11;

import java.util.Scanner;
class JKad11C2{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("そうだ！動物園へ行こう！！");
        System.out.print("あなたの年齢を入力してください＞");
        int a = in.nextInt();
        if (a >= 15){
            System.out.println("大人料金：500 円になります！");
        }else if (a<15 && a>=6){
            System.out.println("子供料金：200 円になります!");
        }else {
            System.out.println("無料です！");
        }
        in.close();
    }
}