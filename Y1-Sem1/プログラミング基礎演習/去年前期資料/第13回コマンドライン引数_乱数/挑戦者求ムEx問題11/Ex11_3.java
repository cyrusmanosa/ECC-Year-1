/*
トランプをシャッフルして表示する処理を作成せよ。
なお、それぞれの表示は以下のようにする。

数字
・1　→　A
・2～10　→　2～10
・11　→　J
・12　→　Q
・13　→　K
スート
・スペード　→　S
・クラブ　→　C
・ダイア　→　D
・ハート　→　H

（実行結果）
*** トランプをシャッフルして並べます！ ***
S-A  S-2  S-3  S-4  S-5  S-6  S-7  S-8  S-9  S-10 S-J  S-Q  S-K
C-A  C-2  C-3  C-4  C-5  C-6  C-7  C-8  C-9  C-10 C-J  C-Q  C-K
D-A  D-2  D-3  D-4  D-5  D-6  D-7  D-8  D-9  D-10 D-J  D-Q  D-K
H-A  H-2  H-3  H-4  H-5  H-6  H-7  H-8  H-9  H-10 H-J  H-Q  H-K

シャッフルします！
C-A  C-7  H-7  H-2  H-A  S-4  H-K  S-3  D-J  H-5  H-8  C-K  S-10
D-4  D-7  S-K  C-6  S-9  D-2  S-8  S-J  D-A  S-Q  D-5  S-A  C-5
C-2  C-3  D-8  D-K  H-10 H-4  D-9  C-J  C-8  H-J  H-3  H-6  S-5
S-2  H-Q  D-Q  H-9  D-3  C-10 C-Q  S-6  C-4  D-6  C-9  D-10 S-7

*/


public class Ex11_3 {
	public static void main(String[] args) {
		Random rand = new Random();
		
		System.out.println("*** トランプをシャッフルして並べます！ ***");
		
		String[] numbers = {"A ", "2 ", "3 ", "4 ", "5 ", "6 ", "7 ", "8 ", "9 ", "10", "J ", "Q ", "K "};
		String[] suits = {"S", "C", "D", "H"};
		
		// 初期化(トランプの準備)
		int[] cards = new int[numbers.length * suits.length];
		
		// 表示①

		

		// シャッフル
		System.out.println("シャッフルします！");

		
		// 表示②

	}
}
