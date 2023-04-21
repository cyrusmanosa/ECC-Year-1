/*

指定された数だけ「■」を横に並べる処理を作成せよ。

（実行画面）
■を並べます！
横にいくつ並べますか？＞20
■■■■■■■■■■■■■■■■■■■■

*/

// Scannerのimport文
import java.util.Scanner;

public class Sample07_2B {
	public static void main(String[] args) {
		/** 宣言 **/
		
		// 横に並べる数用
		int col;
		// Scanner
		Scanner sc = new Scanner(System.in);
		
		
		/** 実行処理 **/
		System.out.println("■を並べます！");
		System.out.print("横にいくつ並べますか？＞");
		
		// 数値を入力し横に並べる用の変数に代入
		col = sc.nextInt();
		
		// 入力した値だけ■を横に並べるループ
		// (iを1から始めて入力した行数以下の間繰り返し、繰り返す毎にiを1ずつ増やす) ここから)
		for (int i = 0; i < col; i++) {
			// ["■"]を表示
			System.out.print("■");
		
		// 入力した値だけ■を横に並べるループ
		// (iを1から始めて入力した行数以下の間繰り返し、繰り返す毎にiを1ずつ増やす) ここまで)
		}
		//入力した値だけ■を横に表示した後に改行処理
		System.out.println();
	}
}
