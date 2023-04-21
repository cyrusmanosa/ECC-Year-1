
/*
	拡張for文を活用して
	名簿の全員を表示するプログラムを作成しなさい

	[実行結果]
	足立
	井上
	上杉
	
	神田
	木下
	久保田
*/

// Scannerのimport文
import java.util.Scanner;

class SouFuku10_2{
	public static void main(String[] args){
		/*******
		* 宣言 *
		********/
		
		String namesList[][] = { {"足立","井上","上杉"},// Aクラス
						   		 {"神田","木下","久保田"}};	// Bクラス


		/***********
		* 実行処理 *
		************/
		
		// 全クラス分繰り返す(拡張for文)
		for(String names[] : namesList){
			// クラス内の人数分くりかえす(拡張for文)
			for(String name : names){
				// クラス内の1人の名前を表示
				System.out.println(name);
			}
			// 1クラス表示後に改行
			System.out.println();
		}
	}
}