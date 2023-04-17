/*
実行結果が以下のようになるよう
流れ図を作成し
完成した上で
流れ図を元にプログラムを作成しなさい

******** 要件 ****************************
「繰り返し処理を実行しますか？」ではいを選んだ場合のみ
何回表示させるかを入力し、その回数分Hello!を表示する

最後は終了を表示
******************************************

[実行結果]繰り返し処理を実行するかで1を入力したパターン
はい:0  /  いいえ:1 >1
終了


[実行結果]繰り返し処理を実行するかで0:表示回数で3を入力したパターン
繰り返し処理を実行しますか？
はい:0  /  いいえ:1 >0
Hello!を何回表示しますか？:3
Hello!
Hello!
Hello!
終了

*/

import java.util.Scanner;
 
class FukuEx03_5{
	public static void main(String[] args){
		/* 宣言 */
		Scanner sc = new Scanner(System.in);
		int inNum;
		int inCount;
		
		System.out.println("繰り返し処理を実行しますか？");
		System.out.print("はい:0  /  いいえ:1 >");
		// 繰り返し処理を実行するかの入力
		
		
		// もし繰り返し処理を実行する場合
		
			System.out.print("Hello!を何回表示しますか？:");
			// 繰り返し回数入力
			
			// 入力した値分繰り返す
			
				System.out.println("Hello!");
		
		System.out.println("終了");
	}
}
