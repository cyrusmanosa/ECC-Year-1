/*
	引数あり(型や個数は自由)、戻り値なしのメソッドを好きに実装し
	mainメソッドで自作したメソッドを活用するプログラムを作成しなさい
*/


class FukuEx05_10{
	 
	/*	
		メソッド(引数あり、戻り値なし)
		引数 :
		戻り値 :なし
	 */
	 public static void jikosyoukai(String name){
	 	System.out.println(    name   + "です！よろしくお願いします！");
	 }

	/* メインメソッド */
	public static void main(String args[]){
		jikosyoukai("田中");
	}
}
