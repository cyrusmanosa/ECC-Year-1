/*
入力した整数を3で割ったときの余りを表示する処理が準備されている。
ただし負の値を入力すると何も表示されずに終了する。
正の値が入力されるまで、入力処理を繰り返すように処理を追加せよ。


（Before）
3で割った余りを計算します！
正の整数を入力してください＞-1

（After）
3で割った余りを計算します！
正の整数を入力してください＞-1
正の整数を入力してください＞-5
正の整数を入力してください＞10
余りは1です！


*/

import java.util.Scanner;

public class Ex06_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("3で割った余りを計算します！");
		System.out.print("整数を入力してください＞");
		int num = sc.nextInt();
		
		switch(num % 3) {
		case 0:
			System.out.println("割り切れました！");
			break;
		case 1:
			System.out.println("余りは1です！");
			break;
		case 2:
			System.out.println("余りは2です！");
			break;
		}
	}
}
