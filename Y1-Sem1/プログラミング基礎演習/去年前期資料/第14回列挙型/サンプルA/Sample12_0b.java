class Sample12_0b{
	// enumで定義
	enum AgeType{
		子供,
		大人,
		シニア
	}
	
	// mainメソッド
	public static void main(String args[]){
		// AgeType型の箱を作成し、AgeTypeの「子供」要素を代入
		AgeType type = AgeType.子供;
		// AgeType型の変数の値を表示
		System.out.println(type + "です");
	}
}

