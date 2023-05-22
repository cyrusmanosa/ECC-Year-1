import java.util.Scanner;
class JKad04C1{
	public static void main(String[] args){
		String name;
		
		Scanner in = new Scanner(System.in);
		System.out.println("あなたのお名前は？＞");
		
		name = in.next();
		
		System.out.println("ecc さん、こんにちは！");
		
		int age;
		System.out.println("年齢はいくつ？＞");
		age = in.nextInt();
		System.out.println(age + "歳なのね！");
	}
}
		