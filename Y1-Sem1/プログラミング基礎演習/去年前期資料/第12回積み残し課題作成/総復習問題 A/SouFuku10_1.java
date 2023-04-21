
/*
	拡張for文を活用して
	名簿の全員を表示するプログラムを作成しなさい


	[実行結果]
	足立
	井上
	上杉
*/

// Scannerのimport文
import java.util.Scanner;

class SouFuku10_1{
	public static void main(String[] args){
		
		/*******
		* 宣言 *
		********/
		// 名簿の配列
		String names[] = {"足立","井上","上杉"};


		/***********
		* 実行処理 *
		************/
		
		// namesの要素分繰り返す(拡張for文)
		for(String name : names){
			// 1人の名前を表示
			System.out.println(name);
		}
	}
}