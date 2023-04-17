
// 拡張forを活用して全要素を使う場合
class Sample12_2a{
	
	// enumで定義
	enum Dog{
		チワワ,
		柴犬,
		ゴールデンレトリバー
	}
	
	public static void main(String args[]){
		System.out.println("犬種の特徴");
		
		// 定義した犬種全てで繰り返す
		
		// 条件分岐(switch文)
			
				// 変数の値がチワワなら
				
					System.out.println("小っちゃくてかわいい");
					
				// 変数の値が柴犬なら
				
					System.out.println("豆しばが特にかわいい");
					
				// 変数の値がゴールデンレトリバーなら
				
					System.out.println("もう全てがかわいい");
					
			
		
	}
}
