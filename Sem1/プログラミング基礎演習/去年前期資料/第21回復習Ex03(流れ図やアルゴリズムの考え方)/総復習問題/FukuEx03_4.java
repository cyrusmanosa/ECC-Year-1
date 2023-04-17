/*
実行結果が以下のようになるよう
流れ図を作成し
完成した上で
流れ図を元にプログラムを作成しなさい

******** 要件 ****************************
繰り返し回数を入力し
入力された値分、Hello!と表示
最後に終了を表示
******************************************

[実行結果]3を入力したパターン
Hello!を何回表示しますか？:3
Hello!
Hello!
Hello!
終了


[実行結果]0を入力したパターン
Hello!を何回表示しますか？:0
終了

*/

import java.util.Scanner;
 
class FukuEx03_4{
	public static void main(String[] args){
		/* 宣言 */
		Scanner sc = new Scanner(System.in);
		int inCount;
		
		System.out.print("Hello!を何回表示しますか？:");
		// 繰り返し回数入力
		
		
		// 入力した値分繰り返す
		
			System.out.println("Hello!");

		System.out.println("終了");
	}
}
