package J1Kadai10;

import java.util.Scanner;

class JKad10C2{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		final int IE = 1;
		final int SK = 2;
		final int SE = 3;

		System.out.println("こんにちは！");
		System.out.println("わたしはスーパーティーチャー、ECC エクセレントよ！");
		System.out.print("あなたのコースを教えてね！（1：IE、2：SK、3：SE）＞");
		int a = in.nextInt();
		if (a >= 3 ) {
			System.out.println("ちゃんと答えてね！");			
		} else {
			System.out.println("IT カレッジの学生ね！");

		}
	}
}