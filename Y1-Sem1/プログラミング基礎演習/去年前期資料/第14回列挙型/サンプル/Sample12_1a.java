class Sample12_1a{
	
	// enumで定義
	enum AgeType{
		子供,
		大人,
		シニア
	}
	
	// mainメソッド
	public static void main(String args[]){
		// AgeTypeの大人オブジェクトを代入
		
		
		// もしtypeがAgeType.子供と同じなら
		
			System.out.println("いつまでも"+     +"です");
			
		// もしtypeがAgeType.大人と同じなら
		
			System.out.println("いつかは"+     +"です");
			
		// もしtypeがAgeType.シニアと同じなら
		
			System.out.println("もう"+     +"です");
		
	}
}
