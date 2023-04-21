class Sample03_2{
	public static void main(String args[]){
		/* 変数の宣言 */
		// 商品Aの単価
		int priceA = 2000;
		// 商品Aの個数
		int numA = 11;
		// 消費税
		double tax;
		// 小計
		int subtotal;
		// 合計
		double total;
		
		// 小計の計算(商品Aの単価 x 商品Aの個数)
		subtotal = priceA * numA;
		// 消費税の計算(小計 x 0.1)
		tax = subtotal * 0.1;
		// 合計金額の計算(小計 + 消費税)
		total = subtotal +  tax;
		
		// 画面に表示
		System.out.println("商品A " + priceA + " * " + numA + " = " + priceA * numA);
		System.out.println("--------------------------");
		System.out.println("小計             " + subtotal);
		System.out.println("消費税           " + (int)tax);
		System.out.println("合計             " + (int)total);
	}
}
