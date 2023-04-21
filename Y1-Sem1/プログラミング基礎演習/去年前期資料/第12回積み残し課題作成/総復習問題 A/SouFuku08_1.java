
/*
	配列のプログラムに松下さんも追加して
	松下さんも表示してください
	
	[実行結果]
	田中さん
	山中さん
	足立さん
	松下さん
*/

// Scannerのimport文
import java.util.Scanner;

class SouFuku08_1{
	public static void main(String[] args){
		/*******
		* 宣言 *
		********/
		// 名簿の配列
		String names[] = {"田中","山中","足立","松下"};// 配列に要素を追加してください

		/***********
		* 実行処理 *
		************/
		// 名簿の0番目を表示
		System.out.println(names[0] + "さん");
		// 名簿の1番目を表示
		System.out.println(names[1] + "さん");
		// 名簿の2番目を表示
		System.out.println(names[2] + "さん");
		// 追加で名簿の3番目を表示
		System.out.println(names[3] + "さん");
		
	}
}