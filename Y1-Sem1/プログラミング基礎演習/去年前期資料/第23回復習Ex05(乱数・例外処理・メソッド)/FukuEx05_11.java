/*
	引数なし、戻り値あり(型は自由)のメソッドを好きに実装し
	mainメソッドで自作したメソッドを活用するプログラムを作成しなさい
*/


class FukuEx05_11{
	 
	/*	
		メソッド(引数なし、戻り値あり)
		引数 :なし
		戻り値 :
	 */
	 public static int getCoin(){
	 	return 1;
	 }

	/* メインメソッド */
	public static void main(String args[]){
		int coin = 0;
		coin += getCoin();
		coin += getCoin();
		coin += getCoin();
		coin += getCoin();
		coin += getCoin();
		coin += getCoin();
		coin += getCoin();
		coin += getCoin();
		coin += getCoin();
		coin += getCoin();
		System.out.println("所持コインは" +coin );
	}
}
