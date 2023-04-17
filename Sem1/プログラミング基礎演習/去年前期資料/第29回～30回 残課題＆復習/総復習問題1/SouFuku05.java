
/*
	switch文を活用し入力した月の季節を表示しなさい
	ただし、[System.out.printlnは現状あるものだけ]で
	[追加は禁止]とする。
	
	春: 3, 4, 5
	夏: 6, 7, 8
	秋: 9,10,11
	冬:12, 1, 2
	エラー:上記以外
	----------------------------------------
	
	[実行結果]2を入力したパターン
	○月を入力してください:2
	冬です

	
	[実行結果]8を入力したパターン
	○月を入力してください:8
	夏です
	
	[実行結果]13を入力したパターン
	○月を入力してください:13
	入力エラー
	
*/

// Scannerのimport文


class SouFuku05{
	public static void main(String[] args){
		/*******
		* 宣言 *
		********/
		// 月の入力用
		int inMonth;
		// Scanner
		Scanner sc = new Scanner(System.in);
		
		/***********
		* 実行処理 *
		************/
		System.out.print("○月を入力してください:");
		// キーボードから月を入力
		inMonth = sc.nextInt();
		
		// 入力した値によって分岐(switch文)
		
			// 3月～5月の場合
			
			
			
				System.out.println("春です");
				
			// 6月～8月の場合
			
			
			
				System.out.println("夏です");
				
			// 9月～11月の場合
			
			
			
				System.out.println("秋です");
				
			// 12月～2月の場合
			
			
			
				System.out.println("冬です");
			
			// それ以外(範囲外)
			
				System.out.println("入力エラー");
		}
	}
}