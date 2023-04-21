/*
	入力した年がうるう年か判定し
	うるう年ならtureを違うならfalseを戻り値とする
	メソッドを作成しなさい
	
	
	[実行結果]2000を入力したパターン
	うるう年か判定したい年を入力してください
	西暦＞2000
	入力した月がうるう年かの判定結果はtrueです！
	
	
	[実行結果]2100を入力したパターン
	うるう年か判定したい年を入力してください
	西暦＞2100
	入力した月がうるう年かの判定結果はfalseです！
	
	
	[実行結果]aを入力したパターン
	うるう年か判定したい年を入力してください
	西暦＞a
	入力値が不正です。
	
*/

import java.util.Scanner;

class FukuEx05_13{
	 
	/*	
		メソッド名：isLeapYear
		メソッド(引数あり、戻り値あり)
		引数 :int year	判定する対象の年
		戻り値 :boolean型	うるう年ならtrue 違うならfalse
	 */
	 public static 戻り値の型 メソッド名(引数の型 引数名){
	 	// もし(年が4で割り切れる かつ 年が100で割り切れない) または (年が400で割り切れる) 場合
	 		
			// trueを返す
			
		
		// falseを返す
		
	 }
	 
	
	 
	/* メインメソッド */
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int inYear;	// 年の入力用
		
		try{
			System.out.println("うるう年か判定したい年を入力してください");
			System.out.print("西暦＞");
			inYear = Integer.parseInt(sc.next());
			
			// isLeapYearメソッドを活用し、うるう年か判定結果を表示
			System.out.println("入力した月がうるう年かの判定結果は"+   + "です！");
			
		}catch(NumberFormatException e){
			System.out.println("入力値が不正です。");
		}
	}
}
