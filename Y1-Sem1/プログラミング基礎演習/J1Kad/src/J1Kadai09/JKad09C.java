import java.util.Scanner;
class JKad09C{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("ひとり一つずつリンゴを食べます！");
		System.out.print("リンゴの数を入力してください＞");
		int a = in.nextInt();
		System.out.print("食べる人の数を入力してください＞");
		int p = in.nextInt();
		int an = a / p;
		int h = a % p;
		
		if (an ==1){
			System.out.println("ひとり一つずつリンゴを食べた！");
			System.out.println("残ったリンゴは" + h + "個です！");
		}else if (an == 0){
			System.out.println("リンゴの数が足りません！");
		}
	}
}
			