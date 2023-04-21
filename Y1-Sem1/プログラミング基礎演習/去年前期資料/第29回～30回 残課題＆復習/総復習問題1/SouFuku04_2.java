
/*
	学生限定キャンペーンで
	18～24歳の判別プログラムを作成してください！
	-----------------------------------
	[実行結果]18を入力したパターン
	あなたの年齢:18
	キャンペーン対象です！
	
	
	[実行結果]25を入力したパターン
	あなたの年齢:25
	申し訳ありませんが適用外の年齢です
*/

// Scannerのimport文


class SouFuku04_2{
	public static void main(String[] args){
		/*******
		* 宣言 *
		********/
		// キャンペーン最小年齢
		final int MIN_AGE =    ;
		// キャンペーン最大年齢
		final int MAX_AGE =    ;
		
		// 年齢入力用
		int age;
		// Scanner
		Scanner sc = new Scanner(System.in);
		
		/***********
		* 実行処理 *
		************/
		System.out.print("あなたの年齢:");
		// キーボードから年齢を入力
		age = sc.nextInt();
		
		// もし範囲内の年齢の場合(変数、定数を活用)
		
			System.out.println("キャンペーン対象です！");
			
		// それ以外(範囲外の年齢の場合)
		
			System.out.println("申し訳ありませんが適用外の年齢です");
		}
	}
}