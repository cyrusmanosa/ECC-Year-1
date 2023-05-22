import java.util.Scanner;

class JKad06X1{
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		System.out.println("こんにちは！");
		System.out.println("わたしは占いマシーンのECC1000 よ！");
		System.out.println("あなたのことを占ってあげるわ！よろしくね");
		System.out.println(" ");
		
		System.out.print("名前は何ていうの？＞");
		String name = in.next();
		
		System.out.println("年齢はいくつ？＞");
		int age = in.nextInt();
		
		System.out.println(name + "さん、こんにちは！");
		System.out.println("あなたは" + age + "歳なんですね！");
		System.out.println(" ");
		
		System.out.println(name + "さんの今日の運勢は");
		int c = (int)(Math.random()*99) + 1;
		int d = (int)(Math.random()*99) + 1;
		int e = (int)(Math.random()*99) + 1;
		System.out.println("ラブ運" + c);
		System.out.println("金銭運" + d);
		System.out.println("全体運" + e);
		System.out.println(" ");
		
		System.out.println("また来てね！");
	}
}