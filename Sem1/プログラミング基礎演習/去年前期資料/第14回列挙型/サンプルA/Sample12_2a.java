
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
		for(Dog dog : Dog.values()){
			switch(dog){
				// 変数の値がチワワなら
				case チワワ:
					System.out.println("小っちゃくてかわいい");
					break;
				// 変数の値が柴犬なら
				case 柴犬:
					System.out.println("豆しばが特にかわいい");
					break;
				// 変数の値がゴールデンレトリバーなら
				case ゴールデンレトリバー:
					System.out.println("もう全てがかわいい");
					break;
			}
		}
	}
}
