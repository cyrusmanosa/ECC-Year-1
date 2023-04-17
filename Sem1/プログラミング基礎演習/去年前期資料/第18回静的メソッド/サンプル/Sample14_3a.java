/**
 * 2つの関数(メソッド)を作成しプログラムを簡略化しなさい
 * 
 */

import java.util.Scanner;

class Sample14_3a{
	/**
	 * うるう年判定メソッド
	 * 引数: int year
	 * 戻り値 boolean   true:うるう年    false:うるう年ではない
	 */
	 
	 
	 /**
	  * うるう年かのメッセージメソッド
	  * 引数 int year
	  * 引数 int month
	  * 戻り値 String メッセージ
	  */
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int inYear;
		int inMonth;
		boolean isUrudoshi;
		String message;

		
		System.out.println("うるう年かの判定をします。");
		
		try{
			System.out.print("西暦＞");
			inYear = Integer.parseInt(sc.next());
			System.out.print("月＞");
			inMonth = Integer.parseInt(sc.next());
			
			/****  関数化その1 ここから   **/
			// うるう年判定
			if((inYear % 4 == 0 && inYear % 100 != 0) || inYear % 400 == 0){
				isUrudoshi = true;
			}else{
					isUrudoshi = false;
			}
			/****  関数化その1 ここまで   **/
			
			
			/****  関数化その2 ここから   **/
			message = inYear + "年" + inMonth + "月は";
			if(isUrudoshi && inMonth == 2){
				message += "うるう年です。";
			}else{
				message += "うるう年ではありません。";
			}
			/****  関数化その2 ここまで   **/
			
			System.out.println(message);
			
		}catch(NumberFormatException nfe){
			System.out.println("入力値が不正です。");
		}catch(ArrayIndexOutOfBoundsException aiobe){
			System.out.println("その月は存在しません。");
		}
		
	}
}