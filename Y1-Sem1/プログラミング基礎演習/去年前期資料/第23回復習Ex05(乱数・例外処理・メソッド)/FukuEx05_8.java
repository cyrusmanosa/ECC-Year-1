import java.util.Scanner;

class FukuEx05_8{
	
	/*	2つの引数を足した計算結果を返すメソッド
		引数 int型	num1 : 1つ目の数値	
		引数 int型	num2 : 2つ目の数値
		戻り値 int型 2つの引数を足した計算結果
	 */
	
	
	
	/* メインメソッド */
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int inNum1;	// 整数入力用1
		int inNum2;	// 整数入力用2
		int result;	// 結果格納用
		
		System.out.print("計算する値を入力 整数1:");
		inNum1 = Integer.parseInt(sc.next());
		
		System.out.print("計算する値を入力 整数2:");
		inNum2 = Integer.parseInt(sc.next());
		
		// 入力した値２つを引数としてメソッドに渡し、受け取った値を変数resultへ代入
		
		System.out.println("計算結果:" + result);
	}
}
