class Sample07_2{
	public static void main(String[] args){
		System.out.println("くらえ！2段切り2連続剣！");
		// 連続剣スキル(外側の繰り返し処理)
		for(int count=1; count<=2; count++){
			// 2段切りスキル(内側の繰り返し処理)
			for(int attack=1; attack<=2; attack++){
				System.out.print(attack + "段切り!");
			}
			System.out.println("連続剣"+count+"回目終了だ");
		}
		System.out.println("どうだ！やったか・・？");
	}
}
