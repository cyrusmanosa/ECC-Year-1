
/*
	0が入力されるまで繰り返すPG
	入力した人数と合計値を表示するプログラムを作成しなさい
	(人数は100人以上入力しても問題ないようにすること)
	
	[実行結果例]
	点数を入力:40
	点数を入力:30
	点数を入力:55
	点数を入力:33
	点数を入力:0
	4人の合計は158
*/

// Scannerのimport文
import java.util.Scanner;

class SouFuku06{
	public static void main(String[] args){
		/*******
		* 宣言 *
		********/
		// 入力人数のカウント用
		int count = 0;
		// Scanner
		Scanner sc = new Scanner(System.in);
		// 点数入力用
		int inNum;
		// 点数の合計値用
		int total = 0;
		
		/***********
		* 実行処理 *
		************/
		
		// 無限ループ
		while(   ){
			System.out.print("点数を入力:");
			inNum = sc.nextInt();
			
			// もし0が入力されたら
			
				// ループから抜ける
				
			
			// 合計値に入力値を加算する
			
			
			// 入力人数のカウントに1を加算する
			
			
		}
		// 入力人数と合計値を表示
		System.out.println(    + "人の合計は" +   );
	}
}