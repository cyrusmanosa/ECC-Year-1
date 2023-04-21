/*
実行結果
□□□□■■□□□□
□□□■■■■□□□
□□■■■■■■□□
□■■■■■■■■□
■■■■■■■■■■

*/

class Sample09_3b{
	public static void main(String[] args){
		final int LEN = 5;	//一辺の長さ
		char[][] triangle = {{'■','□','□','□','□'},
							 {'■','■','□','□','□'},
							 {'■','■','■','□','□'},
							 {'■','■','■','■','□'},
							 {'■','■','■','■','■'}};
		
		/* 行数分 繰り返したい処理 ここから */
		for(int gyo=0; gyo<LEN; gyo++){
			
			/* 0行目の左部分を表示 */
			// triangleの0行目の値を末尾から先頭の順番に表示
			for(int retu=LEN-1; retu>=0; retu--){
				System.out.print(triangle[gyo][retu]);
			}
			// 0行目の右部分を表示
			for(int retu=0; retu<LEN; retu++){
				System.out.print(triangle[gyo][retu]);
			}
			System.out.println();	// 改行処理
	
		/* 行数分 繰り返したい処理 ここまで */
		}
	}
}