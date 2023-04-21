/*
多次元配列を活用して
入力した場所の値を表示してください

[実行結果]
足立さん
黒沢さん


*/


class Sample09_1b{
	public static void main(String[] args){
		// 宣言 (多次元配列を作成したパターン)
		String names[][] = {{ "足立","岩中","上田","江頭","奥村"},	// Aクラスの名簿
						    { "神田","木下","黒沢","剱持","古賀"}};	// Bクラスの名簿
		
		// Aクラスの足立さんを表示してください
		System.out.println(names[0][0] + "さん");
		
		// Bクラスの木下さんを表示してください
		System.out.println(names[1][2] + "さん");
	}
}