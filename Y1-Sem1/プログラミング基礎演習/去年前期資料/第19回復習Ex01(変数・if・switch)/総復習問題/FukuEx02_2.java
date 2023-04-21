/**
 * プログラムが未完成です。
 * 正しい比較演算を記入し
 * プログラムを完成させてください！
 * 
 */


import java.util.Scanner;

class FukuEx02_2{
	public static void main(String[] args){
		/* 宣言 */
		Scanner sc = new Scanner(System.in);
		int inNum;
		int target = 10;
		
		/* 実行処理 */
		System.out.println("入力した値と10を比べます");
		System.out.print("整数を入力：");
		inNum = sc.nextInt();
		
		// もし入力値が10と等しいなら
		if(inNum  target){
			System.out.println("入力値と"+target+"は等しい");
		}
		
		// もし入力値が10と等しくないなら
		if(inNum  target){
			System.out.println("入力値と"+target+"は等しくない");
		}
		
		// もし入力値が10より小さいなら
		if(inNum  target){
			System.out.println("入力値は"+target+"より小さい");
		}
		
		// もし入力値が10以下なら
		if(inNum  target){
			System.out.println("入力値は"+target+"以下");
		}
		
		// もし入力値が10より大きいなら
		if(inNum  target){
			System.out.println("入力値は"+target+"より大きい");
		}
		
		// もし入力値が10以上なら
		if(inNum  target){
			System.out.println("入力値は"+target+"以上");
		}
		
	}
}