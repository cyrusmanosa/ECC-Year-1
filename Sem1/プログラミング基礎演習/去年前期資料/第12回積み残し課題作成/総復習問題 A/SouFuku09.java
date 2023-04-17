
/*
	2つの配列を活用して下記の図形を表示するプログラムを作成しなさい
	bluePrint配列の中身の数値は変更してよい。
	
	[実行結果]
	□■■■■□
	○△■■△○
	○△■■△○
	□△■■△□
*/

// Scannerのimport文
import java.util.Scanner;

class SouFuku09{
	public static void main(String[] args){
		/*******
		* 宣言 *
		********/
		
		// 0番目は○,1番目は■,2番目は△,3番目は□の配列
		final String shape[] = {"○","■","△","□"};
		
		// 使用する図形の設計図
		int bluePrint[][] = {	{3,1,1,1,1,3},
								{0,2,1,1,2,0},
								{0,2,1,1,2,0},
								{3,2,1,1,2,3}};
		
		/***********
		* 実行処理 *
		************/
		
		// 行数分繰り返す
		for(int i=0; i<bluePrint.length; i++){
			// 列数分繰り返す
			for(int j=0; j<bluePrint[i].length; j++){
				// bluePrint配列を元にshape配列の図形を1つ表示
				System.out.print(shape[bluePrint[i][j]]);
			}
			// 1行のおわりに改行
			System.out.println();
		}
	}
}