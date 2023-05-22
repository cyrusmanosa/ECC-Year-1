import java.util.Scanner;

class JKad09D1{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("‚Ğ‚Æ‚Â‚ß‚Ì®”‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢„");
		int o = in.nextInt();
		System.out.print("‚Ó‚½‚Â‚ß‚Ì®”‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢„");
		int t = in.nextInt();
		if (o > t) {
			System.out.print("‚Ó‚½‚Â‚Ì”š‚Å‘å‚«‚¢•û‚Í" + o + "‚Å‚·I");
		}else{
			System.out.print("‚Ó‚½‚Â‚Ì”š‚Å‘å‚«‚¢•û‚Í" + t + "‚Å‚·I");
		}
	}
}