import java.util.Scanner;
class JKad09B{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("ひとつめの整数を入力してください＞");
		int a = in.nextInt();
		System.out.print("ふたつめの整数を入力してください＞");
		int b = in.nextInt();
		System.out.print("誰が計算しますか？（1：のび太、1 以外：出木杉）＞");
		int c = in.nextInt();
		int an = a / b;
		double bn = (double)a / (double)b;
		if (c == 1){
			System.out.println("のび太が計算します！");
			System.out.println("「" + a + "÷" + b + "は" + an + "です！」");
		}else if (c != 1){
			System.out.println("出木杉が計算します！");
			System.out.println("「" + a + "÷" + b + "は" + bn + "です！」");
		}
	}
}