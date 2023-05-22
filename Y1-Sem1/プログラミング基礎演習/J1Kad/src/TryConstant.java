class TryConstant{
	public static void main(String[] args){
		int price = 800;      //変数の宣言
		final int NUM = 1;     //定数の宣言
		
		//意図しない変更
		//NUM = 80;  //おばあちゃんの年齢
		
		System.out.println("本の購入：" + price * NUM + "円");
	}
}