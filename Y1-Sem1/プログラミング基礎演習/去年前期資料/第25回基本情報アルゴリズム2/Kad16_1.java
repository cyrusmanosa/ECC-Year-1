import java.util.Scanner;

public class Kad16_1{
	
	//ランレングス法
	public static 戻り値の型 メソッド名(引数の型 引数名){
		
		int i = 0; 				// 文字列の添え字
		int count = 1;			// 文字数カウンタ
		String outStr = "";		// 出力文字
		String subStr;			// 比較用文字
		
		//比較用文字に先頭文字を抜き出し代入(文字列.substring(開始位置,終了位置)を活用)
		
		
		//入力文字列(data)の文字数分繰り返す（先頭を除く）
		
			
			//次の文字を抜き出し、比較用文字と比較する
			
				//同じ文字が続く場合はcountを+1する
				
			
			// 不一致の場合
			
				//繰り返し文字と回数を出力文字変数に連結する
				
				//次の文字を抜き出し、比較用文字を更新する
				
				//文字数カウンタを初期化する
				
			
		
		
		//最後の文字と回数を出力文字格納変数に連結する
		
		//出力文字を返す
		
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("文字列＞");
		String inStr = sc.next();	// 入力文字格納変数
		
		System.out.println(ランレングスメソッド呼び出す);	//ランレングスメソッド呼び出し
	}
}