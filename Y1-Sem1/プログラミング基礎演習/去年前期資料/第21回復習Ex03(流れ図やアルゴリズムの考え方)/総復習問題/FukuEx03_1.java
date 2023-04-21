import java.util.Scanner;

class FukuEx03_1{
	public static void main(String[] args){
		/* 宣言 */
		Scanner sc = new Scanner(System.in);
		int inNum;
		
		System.out.println("点数を入力してください:");
		// 数値を入力
		inNum = sc.nextInt();
		
		// 点数により分岐
		if(inNum >= 60){
			System.out.println("合格です");
		}else{
			System.out.println("不合格です");
		}
	}
}
