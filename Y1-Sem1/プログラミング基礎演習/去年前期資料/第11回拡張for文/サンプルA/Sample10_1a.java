class Sample10_1a{
	public static void main(String[] args){
		/** 宣言 **/
		int tensu[] = {40,80,55};	// 得点表
		int total = 0;				// 合計値
		
		/** 実行処理 **/
		// 配列の先頭から全要素分繰り返す
		for(int num : tensu){
			//得点を表示
			System.out.println(num + "点");
			// 合計値に得点を加算
			total += num;	
		}
		// 合計値を表示
		System.out.println("合計:" + total +"点");
	}
}
