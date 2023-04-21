
// 拡張forを活用して全要素を使う場合
class Sample12_1c{
	
	// enumで定義
	enum Material{
		にんじん,
		たまねぎ,
		じゃがいも
	}
	
	// mainメソッド
	public static void main(String args[]){
		int count = 1;// 拡張for文ではカウント用の変数が無いので用意
		System.out.println("カレーの材料");
		
		// enumで定義した材料を全要素表示させるためのループ
		for(Material zairyou: Material.values()){
			// カウント数と定義した材料を表示
			System.out.println(count +"つ目は"+zairyou + "です");
			// カウントアップ
			count++;
		}
	}
}
