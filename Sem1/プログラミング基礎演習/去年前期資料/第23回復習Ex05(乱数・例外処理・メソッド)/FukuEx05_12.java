/*
	引数あり(型や個数は自由)、戻り値あり(型は自由)のメソッドを好きに実装し
	mainメソッドで自作したメソッドを活用するプログラムを作成しなさい
*/

import java.util.Random;

class FukuEx05_12{
	 
	/*	
		メソッド(引数あり、戻り値あり)
		引数 :
		戻り値 :
	 */
	public static int doubleChance(int money){
		Random rnd = new Random();
		return money * rnd.nextInt(3);
	}
	
	/* メインメソッド */
	public static void main(String args[]){
		int money = 1000;
		
		System.out.println("結果"   + doubleChance(money)  +"円になりました");
	}
}
