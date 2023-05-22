import java.util.Scanner;

class JKad04A{
	public static void main(String[] args){
		int Num;
		int A;
		int B;
		int C;
		int D;
		
		Scanner in = new Scanner(System.in);
		System.out.print("‹³º”Ô†‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢„");
		
		Num = in.nextInt();
		//ç
		A = (Num / 1000);
		//•S
		B = (Num % 1000)/100; 
		//\
		C = (Num % 1000)%100/10; 
		//’P
		D = (Num % 1000)%100%10;
		System.out.println("ˆê‚ÌˆÊ" + D);
		System.out.println("\‚ÌˆÊ" + C);
		System.out.println("•S‚ÌˆÊ" + B);
		System.out.println("ç‚ÌˆÊ" + A);
	}
}