import java.util.Scanner;
class Test06_2{
	public static void main(String[] args){
		// 宣言部
		Scanner sc = new Scanner(System.in);
		int inNum;		// 入力用
		int count = 0;	//カウント用
		
		// 後ろ判定繰り返し処理
		do{
			count++;	// カウントを1進める
			System.out.println("攻撃" + count + "回目!");
			System.out.print("続けて攻撃しますか？ YES:1 / NO:0 = ");
			inNum = sc.nextInt();	// 数値入力
		}while(inNum == 1);
		System.out.println("攻撃終了");
	}
}
