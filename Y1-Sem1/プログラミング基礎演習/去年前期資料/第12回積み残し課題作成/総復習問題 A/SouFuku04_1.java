/*
変数を活用し
以下のように表示されるPGを作成せよ

-----------------------------------

<実行結果>100を入力したパターン
点数を入力してください:100
素晴らしい！優秀ですね!


<実行結果>90を入力したパターン
点数を入力してください:90
頑張っています！その調子!


<実行結果>40を入力したパターン
点数を入力してください:40
赤点は回避！頑張りましょう！

<実行結果>3を入力したパターン
点数を入力してください:3
日々頑張りましょう！

<実行結果>-10を入力したパターン
点数を入力してください:-10
0未満が入力されました
------------------------------
*/

// Scannerのimport文
import java.util.Scanner;

class SouFuku04_1{
	public static void main(String[] args){
		/*******
		* 宣言 *
		********/
		
		int tensu;// 入力した点数を格納する変数
		Scanner sc = new Scanner(System.in);// Scanner
		
		/***********
		* 実行処理 *
		************/
		System.out.print("点数を入力してください:");
		// 数値をキーボードから入力
		tensu = sc.nextInt();
		
		// もし90点より点数が高いなら
		if(tensu > 90){
			System.out.println("素晴らしい！優秀ですね!");
		// もし70点より点数が高いなら
		}else if(tensu > 70){
			System.out.println("頑張っています！その調子!");
		// もし60点より点数が高いなら
		}else if(tensu > 60){
			System.out.println("普通です！");
		// もし30点より点数が高いなら
		}else if(tensu > 30){
			System.out.println("赤点は回避！頑張りましょう！");
		// もし0点以上なら
		}else if(tensu > -1){
			System.out.println("日々頑張りましょう！");
		// それ以外(入力エラー)なら
		}else{
			System.out.println("0未満が入力されました");
		}
	}
}