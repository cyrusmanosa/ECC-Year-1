class Sample03_3{
	public static void main(String args[]){
		// 変数の宣言
		final double sale = 0.7;
		int itemA = 1500;
		final String STR1 = "ただいまセール中!";
		final String STR2 = "saleの倍率は";
		final String STR3 = "itemAの定価は";
		final String STR4 = "です";
		
		//意図しない変更
	//	sale = 0.1;
		
		// 表示
		System.out.println(STR1 + STR2 + sale + STR4);
		System.out.println(STR3 + itemA + STR4);
	}
}