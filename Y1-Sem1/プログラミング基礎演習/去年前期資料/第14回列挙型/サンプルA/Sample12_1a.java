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
		AgeType type = AgeType.大人;
		
		// もしtypeがAgeType.子供と同じなら
		if(type == AgeType.子供){
			System.out.println("いつまでも"+ type +"です");
			
		// もしtypeがAgeType.大人と同じなら
		}else if(type == AgeType.大人){
			System.out.println("いつかは"+ type +"です");
			
		// もしtypeがAgeType.シニアと同じなら
		}else if(type == AgeType.シニア){
			System.out.println("もう"+ type +"です");
		}
	}
}
