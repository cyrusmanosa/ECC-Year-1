/*
変数を活用し
以下のように表示されるPGを作成せよ

<実行結果>
太郎さんは90点です！
ボーナス5%加算で94点です！

*/


class SouFuku03{
	public static void main(String[] args){
		/*******
		* 宣言 *
		********/
		String user = "太郎";
		int point = 90;
		
		/***********
		* 実行処理 *
		************/
		System.out.println(user + "さんは"+point + "点です！");
		
		// 得点に5%を足した値を整数で表示
		System.out.println("ボーナス5%加算で"+      + "点です！");
	}
}