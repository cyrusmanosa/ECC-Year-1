/*
	課題名：JKad12A2
	作成日：2022/05/23
	作成者：田中太郎
*/
import java.util.Scanner;

public class JKad12A2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("ひとつめの整数を入力してください＞");
		int n1 = in.nextInt();
		System.out.print("ふたつめの整数を入力してください＞");
		int n2 = in.nextInt();
		
		int mul1 = n1;
		int mul2 = n2;
		
		while(mul1 != mul2) {
			if (mul1 < mul2) {
				mul1 += n1;
			} else {
				mul2 += n2;
			}
		}
		
		System.out.println("最小公倍数は" + mul1 + "です！");
		in.close();
	}
}
