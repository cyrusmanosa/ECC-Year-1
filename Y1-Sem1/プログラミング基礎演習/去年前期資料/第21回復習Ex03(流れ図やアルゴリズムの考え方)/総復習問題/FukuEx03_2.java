/*
実行結果が以下のようになるよう
流れ図を作成し
完成した上で
流れ図を元にプログラムを作成しなさい


[実行結果]入力値60のパターン
点数を入力してください:60
次はAクラスです
教室を間違えないように！


[実行結果1]入力値59のパターン
点数を入力してください:59
次はBクラスです
教室を間違えないように！
*/


import java.util.Scanner;
 
class FukuEx03_2{
	public static void main(String[] args){
		/* 宣言 */
		Scanner sc = new Scanner(System.in);
		int inNum;
		
		System.out.print("点数を入力してください:");
		// 数値を入力
		
		
		// 点数により分岐
		
			System.out.println("次はAクラスです");
		
			System.out.println("次はBクラスです");
		
		System.out.println("教室を間違えないように！");
	}
}
