/*
多次元配列と繰り返し文を使用し

[実行結果]
80      50      40      90
30      70      60      50
70      70      70      70
[個人成績]
神田さんの合計値は260
木下さんの合計値は210
黒沢さんの合計値は280
[教科毎の合計]
算数の合計値は180
英語の合計値は190
社会の合計値は170
保健体育の合計値は210

*/

class Sample09_2c{
	public static void main(String[] args){
		/* 宣言 */
		int userTotal[] = new int[3];	// 1人の全教科の合計値配列(3人分)
		int kyokaTotal[] = new int[4]; 	// 教科度ごとの合計値配列(4教科分)
		
		/* 3人の4教科の点数 */
		//				算数,英語,社会,保険体育
		int tensu[][] = {{80,50,40,90},				//	神田さん
						 {30,70,60,50},				//	木下さん
						 {70,70,70,70}};			//	黒沢さん
						 			
		/* 3人の4教科の合計値を表示 */
		// 3人分計算を繰り返すためのループ
		for(int userIndex=0; userIndex<tensu.length; userIndex++){	
			// 4教科分計算を繰り返すためのループ	
			for(int kyokaIndex=0; kyokaIndex<tensu[userIndex].length; kyokaIndex++){
				// 教科の点数を表示
				System.out.print(tensu[userIndex][kyokaIndex] + "\t");
				// 教科の点数を1人の合計値に加算
				userTotal[userIndex] += tensu[userIndex][kyokaIndex];
				// 教科の点数を1教科の合計値に加算
				kyokaTotal[kyokaIndex] += tensu[userIndex][kyokaIndex];
			}
			System.out.println();// 改行処理
		}
		System.out.println("[個人成績]");
		System.out.println("神田さんの合計値は" + userTotal[0] );
		System.out.println("木下さんの合計値は" + userTotal[1] );
		System.out.println("黒沢さんの合計値は" + userTotal[2] );
		System.out.println("[教科毎の合計]");
		System.out.println("算数の合計値は" + kyokaTotal[0]);
		System.out.println("英語の合計値は" + kyokaTotal[1]);
		System.out.println("社会の合計値は" + kyokaTotal[2]);
		System.out.println("保健体育の合計値は" + kyokaTotal[3]);
	}
}