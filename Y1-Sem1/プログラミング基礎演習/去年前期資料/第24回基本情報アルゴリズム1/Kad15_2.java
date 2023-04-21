import java.util.Scanner;


public class Kad15_2{
	
	// エラトステネスの篩に基づき、素数を求める
	public static 戻り値の型 メソッド名(引数の型 変数名){
		
		// 素数フラグ宣言:配列(true:素数, false:非素数)
		
		
		// 素数フラグの初期化(2からnまでを素数候補としてtrueを代入する)
		
		
		/** 素数の倍数を素数候補から除外(非素数をfalseにする) **/
		// 2から[√入力値]まで繰り返す
		
			// 倍数を参照する為に[値]x[2]から[入力値]まで繰り返す
			
				// 対象の値を素数でないと設定[false]
				
			
		
		// 設定が完了したので素数フラグの配列を返す
		
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int inNum;	// 数値入力用
		boolean[] primeNumFlag;	//素数表示用の素数か判定用の配列(true:素数 , false:非素数)
		
		 
		
		try{
			System.out.print("いくつまでの素数を求めますか？＞");
			
			
			
			// エラトステネスメソッドを呼びだし素数を求め、
			// 戻り値のboolean型配列(true:素数, false:非素数)を代入する。
			primeNumFlag = エラトステネスメソッドの実行結果
			
			/** 求めた素数を表示 **/
			// 2から入力値まで繰り返す
			
				// もし素数表示用配列の添え字番目がtrueなら
				
					// 添え字番号を表示する
					
				
			
		}catch(NumberFormatException nfe){
			System.out.println("入力値が不正です。");
		}
	}
}