package J1Kadai10;

import java.util.Scanner;

class JKad10D{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("そうだ！動物園へ行こう！！");
		System.out.print("あなたの年齢を入力してください＞");
		int a = in.nextInt();
		if (a < 6) {
			System.out.println("無料です！");
		}
		if (a >= 6 && a < 15){
			System.out.println("子供料金：200 円になります！");
		}
		if (a >= 15){
			System.out.println("大人料金：500 円になります！");
		}
	}
}