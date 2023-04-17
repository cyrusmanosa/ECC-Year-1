/*
多次元配列と繰り返し文を使用し


[実行結果]
80      50      40      90
神田さんの合計値は260


*/


class Sample09_2a{
	public static void main(String[] args){
		// 宣言 (多次元配列を作成したパターン)
		int userTotal[] = new int[3];	// 1人の全教科の合計値(3人分)
		int kyokaTotal[] = new int[4]; 	// 教科度ごとの合計値(4教科分)
		
		/* 3人の4教科の点数 */
		//				算数,英語,社会,保険体育
		int tensu[][] = {{80,50,40,90},				//	神田さん
						 {30,70,60,50},				//	木下さん
						 {70,70,70,70}};			//	黒沢さん
						 			
		/* 神田さんの4教科の合計値を表示 */
		for(int kyokaIndex=0; kyokaIndex<tensu[0].length; kyokaIndex++){
			// 教科の点数を表示
			System.out.print(tensu[0][kyokaIndex] + "\t");
			// 教科の点数を1人の合計値に加算
			userTotal[0] += tensu[0][kyokaIndex];
		}
		System.out.println();// 改行処理
		System.out.println("神田さんの合計値は" + userTotal[0] );
	}
}