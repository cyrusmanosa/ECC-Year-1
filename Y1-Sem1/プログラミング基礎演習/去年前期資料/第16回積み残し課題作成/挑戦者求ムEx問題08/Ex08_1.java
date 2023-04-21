/*
int型配列（要素数10）に乱数を使って0～99の値を設定し、
その中で一番大きな値を表示する処理を作成せよ。

①int型配列に乱数で0～99の値を設定する。
②int型配列の各要素を表示する。
③一番大きい値を探して表示する。

（実行結果）
 71 75 30 43 0 29 88 20 0 7
一番大きい数字は88です！

*/

import java.util.Random;

public class Ex08_1 {
	public static void main(String[] args) {
		/** 宣言 **/
		Random rand = new Random();		// 乱数生成用
		
		int[] numbers = new int[10];	// 乱数格納用
		
		
		/** 実行処理 **/
		// ①値の設定

		
		// ②表示

		
		// 一番大きい数字を探す

		
		
		// ③最大値を表示
		System.out.println("一番大きい数字は" + "です！");
	}
}
