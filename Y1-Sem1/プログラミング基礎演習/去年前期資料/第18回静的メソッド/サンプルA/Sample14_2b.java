import java.util.Scanner;

class Sample14_2b{
	
	/*	2つの引数もとに飲み物の名前を返す自販機のメソッド
		引数 int型	money : 投入する金額
		引数 int型	selectNo : どの飲み物を買うか
		戻り値 String型 買った飲み物の名前
	 */	 
	public static String jihanki(int money,int selectNo){
		String result = "";	// 戻り値用の買った飲み物の名前
		
		switch(selectNo){
			// コーラ 120円 
			case 1:
				if(money >= 120){
					result = "コーラ";
				}else{
					result = "金額が足りません";
				}
				break;
				
			// エナジードリンク 200円
			case 2:
				if(money >= 200){
					result = "エナジードリンク";
				}else{
					result = "金額が足りません";
				}
				break;
				
			// 水 100円
			case 3:
				if(money >= 100){
					result = "水";
				}else{
					result = "金額が足りません";
				}
				break;
			default:
				result = "商品番号を選んでください";
		}
		return result;
	}
	
	/* メインメソッド */
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int inNum1;	// 投入コイン数
		int inNum2;	// 買う飲み物の番号
		String drink; // 買った飲み物の名前
		
		System.out.println("1 : コーラ120円 /  2 : エナジードリンク200円  /  3: 水100円");
		
		System.out.print("投入する金額を決めてください 整数:");
		inNum1 = Integer.parseInt(sc.next());
		
		System.out.print("購入するジュースを選択してください");
		inNum2 = Integer.parseInt(sc.next());
		
		// 入力した値２つを引数としてメソッドに渡し、受け取った値を変数drinkへ代入
		drink = jihanki(inNum1,inNum2);
		System.out.println("買ったものは" + drink);
	}
}
