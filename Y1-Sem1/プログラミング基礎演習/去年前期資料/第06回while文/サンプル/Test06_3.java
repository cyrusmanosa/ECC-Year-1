class Test06_3{
	public static void main(String[] args){
		// 宣言部
		int enmHp = 10;	//敵のHP
		int ap = 3;		//自分の攻撃力
		
		// 無限ループ
		while(true){
			System.out.println("攻撃:" + ap + "ダメージ");
			System.out.println("スライム：いたい！");
			
			if(enmHp <= 0){
				break;
			}
			
		}
	}
}
