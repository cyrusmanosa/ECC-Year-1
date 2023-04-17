/*
	課題名：JKad12X0
	作成日：2022/05/23
	作成者：田中太郎
*/
import java.util.Scanner;

public class JKad12X0 {
	// たし算
	public static int add(int n1, int n2) {
		int ans = n1 + n2;
		return ans;
	}
	// mainメソッド
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("ひとつめの整数を入力してください＞");
		int n1 = in.nextInt();
		System.out.print("ふたつめの整数を入力してください＞");
		int n2 = in.nextInt();
		
		System.out.println("ふたつの数を足すと" + add(n1, n2) + "です！");
		
		in.close();
	}
}
