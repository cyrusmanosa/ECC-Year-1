import java.util.Scanner;
class JKad05A{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("”¼Œa‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		
		double r = in.nextDouble();
		double a = 4 * 3.14 * (r * r);
		double b = (4 * 3.14 * (r * r * r))/3;
		
		System.out.println("”¼Œa" + r + "‚Ì‹…‚Ì•\–ÊÏ‚Í" + a + "A‘ÌÏ‚Í" + b + " ‚Å‚·I");
	}
}