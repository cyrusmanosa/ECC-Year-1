// Scannerをつかえるように

import java.util.Scanner;
class TryScanner{
	public static void main(String[] args){
		//宣言
		String inStr;
		
		//Scannerの準備
		Scanner in = new Scanner(System.in);
		System.out.println("文字を入力してください:");
		
		
		//変数にキーボードから受け付けた値を代入
		inStr = in.next();
		System.out.println("入力した文字は" + inStr);
		
		//変数の宣言
		int inNum;
		System.out.println("2倍にしたい数値を入力してください：");
		
		//Scannerを使用し数値の入力を受け付ける
		inNum = in.nextInt();
		System.out.println("計算結果：" + (inNum*2));
	}
}