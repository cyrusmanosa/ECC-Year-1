/**
 * プログラムが【どう動くかの確認】です
 * 実行する前に
 * どのような実行結果になるか予想を立ててから
 * 実行してみましょう！
 * 
 */


import java.util.Scanner;

class FukuEx02_3{
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
		System.out.println("\n inNum == target の結果は" + (inNum == target));
		if(inNum == target){
			System.out.println("入力値と"+target+"は等しい");
		}
		
		// もし入力値が10と等しくないなら
		System.out.println("\n inNum != target の結果は" + (inNum != target));
		if(inNum != target){
			System.out.println("入力値と"+target+"は等しくない");
		}
		
		// もし入力値が10より小さいなら
		System.out.println("\n inNum < target の結果は" + (inNum < target));
		if(inNum < target){
			System.out.println("入力値は"+target+"より小さい");
		}
		
		// もし入力値が10以下なら
		System.out.println("\n inNum <= target の結果は" + (inNum <= target));
		if(inNum <= target){
			System.out.println("入力値は"+target+"以下");
		}
		
		// もし入力値が10より大きいなら
		System.out.println("\n inNum > target の結果は" + (inNum > target));
		if(inNum > target){
			System.out.println("入力値は"+target+"より大きい");
		}
		
		// もし入力値が10以上なら
		System.out.println("\n inNum >= target の結果は" + (inNum >= target));
		if(inNum >= target){
			System.out.println("入力値は"+target+"以上");
		}
		
	}
}