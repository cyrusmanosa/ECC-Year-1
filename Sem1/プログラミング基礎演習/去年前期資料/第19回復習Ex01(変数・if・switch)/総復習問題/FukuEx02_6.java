/**
 * プログラムが未完成です
 * 条件分岐を完成させて
 * 二十歳以上かつ所持金がビールの値段以上の時のみ
 * ビールが返るようなプログラムを完成させてください
 * 
 */

import java.util.Scanner;
class FukuEx02_6{
	public static void main(String[] args){
		// 変数の宣言
		int age;		// 年齢
		int money;		// 所持金
		int beer = 200;	// ビールの値段
		Scanner sc = new Scanner(System.in);
		
		System.out.print("年齢を入力して下さい:");
		age = sc.nextInt();
		
		System.out.print("所持金を入力して下さい:");
		money = sc.nextInt();
		
		// もし20歳未満なら
		
			System.out.println("未成年の為、ビールは買えません。");
		// それ以外なら
		
			// もし所持金がビールの値段未満なら
			
				System.out.println("所持金が足りない為、ビールは買えません。");
			// それ以外なら
			
				System.out.println("ビール購入可能です。");
			
		
	}
}