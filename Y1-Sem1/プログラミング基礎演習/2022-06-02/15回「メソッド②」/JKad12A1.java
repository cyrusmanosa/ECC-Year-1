/*
	課題名：JKad12A1
	作成日：2022/05/23
	作成者：田中太郎
*/
import java.util.Scanner;

public class JKad12A1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("ひとつめの整数を入力してください＞");
		int n1 = in.nextInt();
		System.out.print("ふたつめの整数を入力してください＞");
		int n2 = in.nextInt();
		
		while(n1 != n2) {
			if (n1 > n2) {
				n1 -= n2;
			} else {
				n2 -= n1;
			}
		}
		
		System.out.println("最大公約数は" + n1 + "です！");
		in.close();
	}
}
