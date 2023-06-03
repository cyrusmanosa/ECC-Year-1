package J1Kadai10;

import java.util.Scanner;

class JKad10B{
	public static void main(String[] var0) {
		Scanner var1 = new Scanner(System.in);
		System.out.println("そうだ！水族館へ行こう！！");
		System.out.print("あなたの年齢を入力してください＞");
		int var2 = var1.nextInt();
		if (var2 >= 65) {
			System.out.println("シニア料金：2200 円になります！");
		} else if (var2 < 65 && var2 >= 15) {
			System.out.println("大人料金：2400 円になります！");
		} else if (var2 >= 6 && var2 < 15) {
			System.out.println("子供料金：1200 円になります！");
		} else if (var2 >= 3 && var2 < 6) {
			System.out.println("幼児料金：600 円になります！");
		} else {
			System.out.println("無料です！");
		}

	}
}