import java.util.Scanner;
class JKad04C2{
	public static void main(String[] args){
		String name;
		
		Scanner in = new Scanner(System.in);
		System.out.print("あなたのお名前は？＞");
		
		name = in.next();
		
		System.out.println("ecc さん、こんにちは！");
		
		int age;
		System.out.print("年齢はいくつ？＞");
		age = in.nextInt();
		System.out.print(age + "歳なのね！");
	}
}
		