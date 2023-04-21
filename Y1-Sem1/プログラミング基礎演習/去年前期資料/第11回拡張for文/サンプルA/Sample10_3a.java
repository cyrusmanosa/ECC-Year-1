class Sample10_3a{
	public static void main(String[] args){
		/** 宣言 **/
		int[][] table = {{50, 70, 30},
						 {80, 60, 10},
				 	 	 {40, 20, 90}};
		
		//先頭要素を最小値の初期値にする
		int min = table[0][0];	//最小値
		
		
		/** 実行処理 **/
		//tableの行数分繰り返すループ
		for(int[] row : table){
			//rowの列数分繰り返すループ
			for(int col : row){
				//カンマ区切りで値表示
				System.out.print(col + ",");
				//もし表示した値が現在の最小値より小さい場合
				if(col < min){
					//最小値を現在参照している値で更新
					min = col;	
				}
			}
			//1行の終わりに改行
			System.out.println("");	
		}
		System.out.println("\n最小値は" + min +  "です。");
	}
}