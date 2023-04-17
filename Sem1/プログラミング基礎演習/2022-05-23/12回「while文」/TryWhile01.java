import java.util.Scanner;
class TryWhile01{
	public static void main(String[] args){
		/* 宣言部 */
		Scanner in = new Scanner(System.in);
		int count = 1;	// カウント用
		int inNum;		// 入力用
		
		System.out.print("繰り返したい回数を入力>");
		inNum = in.nextInt();
		
		/* ここを繰り返し処理で実行出来るように */
		while ( count <= inNum ){
		System.out.println("攻撃" + count + "回目");
		count++;
		}
	}
}

