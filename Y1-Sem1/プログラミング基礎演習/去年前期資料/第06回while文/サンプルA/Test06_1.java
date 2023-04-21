import java.util.Scanner;
class Test06_1{
	public static void main(String[] args){
		// 宣言部
		Scanner sc = new Scanner(System.in);
		int count = 1;	// カウント用
		int inNum;		// 入力用
		System.out.print("繰り返したい回数を入力：");
		inNum = sc.nextInt();	// 数値を入力

		// 繰り返し処理
		while(count <= inNum){
			System.out.println("攻撃" + count + "回目!");
			count++;	// カウントを1進める
		}
	}
}
