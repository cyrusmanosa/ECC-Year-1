import java.util.Scanner;
class Sample04_1{
	public static void main(String[] args){
		// 変数の宣言
		String inStr;
		
		// Scannerの準備
		Scanner sc = new Scanner(System.in);
		System.out.print("文字を入力してください:");
		
		// Scannerを使用し文字列の入力を受け付ける
		inStr = sc.next();
		System.out.println("入力した文字は:" + inStr);
		
		// 変数の宣言
		int inNum;
		System.out.print("2倍にしたい数値を入力してください:");
		
		// Scannerを使用し数値の入力を受け付ける
		inNum = sc.nextInt();
		System.out.println("計算結果:" + (inNum * 2));
	}
}
