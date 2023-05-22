import java.util.Scanner;
class JKad04X1{
	public static void main(String[] args){
		int Num;
		
		Scanner in = new Scanner(System.in);
		System.out.print("0 ‚©‚ç255 ‚Ü‚Å‚Ì®”‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢„");
		Num = in.nextInt();
		
		while(Num>0){
			Num/=2;
		
		}
		if(Num == 0){
			
		System.out.print(Num%2);
		
	}
}