class Sample08_1a{
	public static void main(String[] args){
		// 宣言
		String names[] = {"A","B","C"};	// キャラ名
		int damage[] = {10,20,30};		// キャラ毎の攻撃力
		int totalDamage = 0;			// ダメージ合計
		
		// Aの攻撃
		System.out.print(names[0] +"の攻撃:"); 
		System.out.println(damage[0] + "ダメージ");
		// 合計に加算
		totalDamage += damage[0];
		
		//Bの攻撃
		System.out.print(names[1] +"の攻撃:"); 
		System.out.println(damage[1] + "ダメージ");
		// 合計に加算
		totalDamage += damage[1];
		
		//Cの攻撃
		System.out.print(names[2] +"の攻撃:"); 
		System.out.println(damage[2] + "ダメージ");
		// 合計に加算
		totalDamage += damage[2];
		
		System.out.println("合計："+totalDamage+"ダメージ");
	}
}
