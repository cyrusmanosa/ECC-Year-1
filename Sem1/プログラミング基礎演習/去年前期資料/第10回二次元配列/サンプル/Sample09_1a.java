/*
前回の配列を活用して
足立さんと木下さんを表示してください。

[実行結果]
足立さん
黒沢さん


*/

class Sample09_1a{
	public static void main(String[] args){
		// 宣言 (配列を複数作成したパターン)
		// Aクラスの名簿
		String names01[] = { "足立","岩中","上田","江頭","奥村"};
		// Bクラスの名簿
		String names02[] = { "神田","木下","黒沢","剱持","古賀"};
		
		// Aクラスの足立さんを表示してください
		System.out.println( + "さん");
		
		// Bクラスの黒沢さんを表示してください
		System.out.println( + "さん");
	}
}