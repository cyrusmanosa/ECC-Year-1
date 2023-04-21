
// 拡張forを活用して全要素を使う場合
class Sample12_1b{
	
	// enumで定義
	enum AgeType{
		子供,
		大人,
		シニア
	}
	// mainメソッド
	public static void main(String args[]){
		// AgeTypeの要素分繰り返す
		for(AgeType type: AgeType.values()){
			System.out.println(type + "です");
		}
	}	
}
