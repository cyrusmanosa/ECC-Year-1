/*
	年と月を入力し
	その月の最終日を表示するメソッドを作成し
	プログラムを完成しなさい
	
	
	[実行結果]2000と2を入力したパターン
	西暦＞2000
	月＞2
	2000年2月の最終日は29日です。
	
	[実行結果]2100と2を入力したパターン
	西暦＞2100
	月＞2
	2100年2月の最終日は28日です。
	
	
	[実行結果]2000と13を入力したパターン
	西暦＞2000
	月＞13
	その月は存在しません。
	
*/

import java.util.Scanner;

class FukuEx05_14{
	 
	/*	
		メソッド名：getDayOfMonth
		メソッド(引数あり、戻り値あり)
		引数1 :int year	判定する対象の年
		引数2 :int month 判定する対象の月
		戻り値 :int型	その月の最終日を戻り値として返す
	 */
	public static 戻り値の型 メソッド名(引数1の型 引数1の変数名, 引数2の型 引数2の変数名) {
		final int[] LASTDAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};//1~12月の最終日
		boolean isLeapYear; //	うるう年かの判定結果	うるう年ならtrue 違うならfalse
		
		// うるう年判定
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
			isLeapYear = true;
		}else{
			isLeapYear = false;
		}
		
		
		//もし月が2月 かつ isLeapYearがtrueの場合
		
			// LASTDAYS配列の2月の最終日の値に＋１をした値を返す
												//28日→29日
		
		
		// LASTDAYS配列の該当月の最終日を返す
		
	}
	 
	
	 
	/* メインメソッド */
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int inYear;	// 年の入力用
		int inMonth;// 月の入力用
		
		try{
			System.out.print("西暦＞");
			inYear = Integer.parseInt(sc.next());
			System.out.print("月＞");
			inMonth = Integer.parseInt(sc.next());
			
			// getDayOfMonthメソッドを活用し入力した月の最終日を表示する
			System.out.println(inYear + "年" + inMonth + "月の最終日は" + 		 + "日です。");
		}catch(NumberFormatException nfe){
			System.out.println("入力値が不正です。");
		}catch(ArrayIndexOutOfBoundsException aiobe){
			System.out.println("その月は存在しません。");
		}
	}
}
