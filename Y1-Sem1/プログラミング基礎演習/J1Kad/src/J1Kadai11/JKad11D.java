import java.util.Scanner;
class JKad11D{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("ひとつめの整数を入力してください＞");
		int a = in.nextInt();
		System.out.print("ふたつめの整数を入力してください＞");
		int b = in.nextInt();
		System.out.print(a + "+" + b + "の答えを入力してください＞");
		int c = in.nextInt();
		boolean correct = ((a + b) == c);
		correct = true;
		System.out.println("判定は・・・" + ((a + b) == c));
		if ((a + b) == c) {
			System.out.println("正解です！");
		}else{
			System.out.println("不正解です！");
		}
	}
}