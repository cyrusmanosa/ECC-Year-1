class Sample08_1b{
	public static void main(String[] args){
		// 宣言
		String names[] = {"A","B","C"};	// キャラ名
		int damage[] = {10,20,30};		// キャラ毎の攻撃力
		int totalDamage = 0;			// ダメージ合計
		
		// 繰り返し処理
		for(int i=0; i<names.length; i++){
			// キャラの攻撃
			System.out.print(names[i]+"の攻撃:");
			System.out.println(damage[i]+"ダメージ");
			// // 合計に加算
			totalDamage += damage[i];
		}
		System.out.println("合計："+totalDamage+"ダメージ");
	}
}
