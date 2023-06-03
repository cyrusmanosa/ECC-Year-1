package J1Kadai10;

import java.util.Scanner;

class JKad10S{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		final int IE = 1;
		final int SK = 2;
		final int SE = 3;

		System.out.println("こんにちは！");
		System.out.println("わたしはスーパーティーチャー、ECC エクセレントよ！");
		System.out.print("あなたのコースを教えてね！（1：IE、2：SK、3：SE）＞");
		int a = in.nextInt();
		if (a > 3) {
			System.out.println("ちゃんと答えてね！");
		}else{
			System.out.print("今何年生？");
			int b = in.nextInt();
			if (a <= 3 && b <= 4 && b > 0){
				System.out.println("IT カレッジの学生さん、よろしくね！");
				}else if (a == 1 && (b <= 0 || b > 4)) {
						System.out.println("IE は4 年制コースよ！");
					} 
					else if (a == 2 && (b <= 0 || b > 3)) {
						System.out.println("SK は3 年制コースよ！");
					} 
					else if (a == 3 && (b <= 0 || b > 2)) {
						System.out.println("SE は2 年制コースよ！");
					} 
				}
		}
	}

			