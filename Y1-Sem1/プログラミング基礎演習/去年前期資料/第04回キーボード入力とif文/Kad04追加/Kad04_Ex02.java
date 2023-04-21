import java.util.Scanner;
import java.util.Random;

public class Kad04_Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("こんにちは！");
		System.out.println("わたしは占いマシーンよ！");
		System.out.println("あなたのことを占ってあげるわ！よろしくね！");
		System.out.println();
		
		System.out.print("名前は何ていうの？");
		String name = sc.next();
		System.out.print("年齢はいくつ？");
		int age = sc.nextInt();
		System.out.println();
		
		System.out.println(name + "さん、こんにちは！");
		System.out.println("あなたは" + age + "歳なんですね！");
		System.out.println();
		
		final int MAXROLL = 101;
		int love = rand.nextInt(MAXROLL);
		int gold = rand.nextInt(MAXROLL);
		int total = rand.nextInt(MAXROLL);
		
		System.out.println(name + "さんの今日の運勢は");
		System.out.println("ラブ運：" + love);
		System.out.println("金　運：" + gold);
		System.out.println("全体運：" + total);
		System.out.println();
		
		if ((love > gold)&&(love > total)) {
			System.out.println("ラブ運が最高ね！");
		}
		else if (gold >total) {
			System.out.println("金運がいいみたいね！");
		}
		else {
			System.out.println("何かいいことがあるかもね！");
		}
	}
}
