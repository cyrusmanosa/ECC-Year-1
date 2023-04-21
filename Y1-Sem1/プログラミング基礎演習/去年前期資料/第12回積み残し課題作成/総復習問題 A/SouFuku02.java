/*
変数を活用し
以下のように表示されるPGを作成せよ

<実行結果>
太郎さんは100点です！

*/


class SouFuku02{
	public static void main(String[] args){
		/*******
		* 宣言 *
		********/
		
		// 文字列の変数
		String user = "太郎";
		// 得点の変数
		int point = 90;
		
		/***********
		* 実行処理 *
		************/
		// 変数を活用したprint文
		System.out.println(user + "さんは"+point + "点です！");
	}
}