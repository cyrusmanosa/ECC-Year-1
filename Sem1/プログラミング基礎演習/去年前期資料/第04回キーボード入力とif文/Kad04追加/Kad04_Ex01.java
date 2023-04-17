import java.util.Scanner;

public class Kad04_Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("‚Ğ‚Æ‚Â‚ß‚Ì®”‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢„");	int num1 = sc.nextInt();
		System.out.print("‚Ó‚½‚Â‚ß‚Ì®”‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢„");	int num2 = sc.nextInt();
		System.out.print("‚İ‚Á‚Â‚ß‚Ì®”‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢„");	int num3 = sc.nextInt();
		System.out.print("‚æ‚Á‚Â‚ß‚Ì®”‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢„");	int num4 = sc.nextInt();
		
		int max = num1;
		if (max < num2) {
			max = num2;
		}
		if (max < num3) {
			max = num3;
		}
		if (max < num4) {
			max = num4;
		}
		System.out.println("‚¢‚¿‚Î‚ñ‘å‚«‚¢’l‚Í" + max + "‚Å‚·I");
	}
}
