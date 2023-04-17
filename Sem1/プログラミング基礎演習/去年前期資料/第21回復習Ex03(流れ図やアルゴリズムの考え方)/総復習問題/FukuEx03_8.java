/*

指定された数だけ「■」を横に並べる処理を作成せよ。

（実行画面）
■を並べます！
横にいくつ並べますか？＞20
■■■■■■■■■■■■■■■■■■■■

*/

// Scannerのimport文
import java.util.Scanner;

public class FukuEx03_8 {
	public static void main(String[] args) {
		/** 宣言 **/
		Scanner sc = new Scanner(System.in);// Scanner		
		int col;// 横に並べる数用

		/** 実行処理 **/
		System.out.println("■を並べます！");
		System.out.print("横にいくつ並べますか？＞");
		
		// 数値を入力し横に並べる用の変数に代入
		
		
		// 入力した値だけ■を横に並べるループ
			
			// ["■"]を表示
			System.out.print("■");
		
		//入力した値だけ■を横に表示した後に改行処理
		System.out.println();
	}
}
