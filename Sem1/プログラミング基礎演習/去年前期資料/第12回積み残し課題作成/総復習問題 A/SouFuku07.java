
/*
	九九表で
	入力した段を表示し
	さらに九九表全ても表示するプログラムを作成しなさい
	
	
	[実行結果例]
	入力した値の1～9を掛けた値を表示します:3
	  3   6   9  12  15  18  21  24  27
	
	九九表を表示します
	  1   2   3   4   5   6   7   8   9
	  2   4   6   8  10  12  14  16  18
	  3   6   9  12  15  18  21  24  27
	  4   8  12  16  20  24  28  32  36
	  5  10  15  20  25  30  35  40  45
	  6  12  18  24  30  36  42  48  54
	  7  14  21  28  35  42  49  56  63
	  8  16  24  32  40  48  56  64  72
	  9  18  27  36  45  54  63  72  81
*/

// Scannerのimport文
import java.util.Scanner;

class SouFuku07{
	public static void main(String[] args){
		/** 宣言 **/
		Scanner sc  = new Scanner(System.in);
		int inNum;
		
		/** 実行処理 **/
		System.out.print("九九表で入力した段を表示します:");
		inNum = sc.nextInt();
		
		for(int i=1; i<=9; i++){
			System.out.printf("%3d ",inNum * i);
		}
		// 1行のおわりに改行
		System.out.println();
		
		System.out.println();
		System.out.println("九九表を表示します");
		// 1の段～9段まで処理を実行するための繰り返し
		for(int i=1; i<=9; i++){
			// 段の値ｘ1～9値を表示する為の繰り返し
			for(int j=1; j<=9; j++){
				System.out.printf( "%3d ",i*j);
			}
			// 1行のおわりに改行
			System.out.println();
		}
	}
}