import java.util.Scanner;
class JKad06S1{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		System.out.print("ひとつめの整数を入力してください＞");
		int n1 = in.nextInt();
		
		System.out.print("ふたつめの整数を入力してください＞");
		int n2 = in.nextInt();
		
		System.out.println("のび太が計算します！");
		int a1 = n1 / n2;
		System.out.println("「" + n1 + "÷" + n2 + "は" + a1 + "です！」");
		
		System.out.println("出木杉くんが計算します！");
		double a2 = (double)n1 / (double)n2;
		System.out.println("「" + n1 + "÷" + n2 + "は" + a2 + "です！」");
		
		in.close();
	}
}