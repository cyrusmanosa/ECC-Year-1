class TryModoriti01{
	public static void main(String[] args){
		show();//showメソッドを呼び出し
		pw();//pwメソッドを呼び出すだけ
		System.out.println("攻撃力は" + pw());//pwメソッドの結果を表示
		int x = pw();//pwメソッドの結果を代入
		System.out.println("攻撃力" + x + "(2回目)");
	}
	
	public static void show(){
		System.out.println("player");
		//戻り値voidなのでreturn;を省略
	}
	
	public static int pw(){
		int power = 10;
		return power;//int型データで戻す
	}
}