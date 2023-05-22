import java.util.Scanner;
class quention35{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("‹³º”Ô†‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢„");
		int num = in.nextInt();
		int a = num/1000;
		int b = (num%1000)/100;
		System.out.print(num + "‹³º‚Í" + a + "†ŠÙ‚Ì" + b + "ŠK‚É‚ ‚è‚Ü‚·");
	}
}