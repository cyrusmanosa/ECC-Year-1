/*
実行結果
□□□□■■□□□□

*/

class Sample09_3a{
	public static void main(String[] args){
		final int LEN = 5;	//一辺の長さ
		char[][] triangle = {{'■','□','□','□','□'},
							 {'■','■','□','□','□'},
							 {'■','■','■','□','□'},
							 {'■','■','■','■','□'},
							 {'■','■','■','■','■'}};
		

		// 0行目の左部分を表示
		for(int retu=LEN-1; retu>=0; retu--){
			System.out.print(triangle[0][retu]);
		}
		// 0行目の右部分を表示
		for(int retu=0; retu<LEN; retu++){
			System.out.print(triangle[0][retu]);
		}
		System.out.println();	// 改行処理
		
		
	}
}