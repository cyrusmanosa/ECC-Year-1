import java.util.Scanner;
class Sample07_1{
	public static void main(String[] args){
		// éŒ¾
		Scanner sc = new Scanner(System.in);
		int inNum;
		System.out.print("ŒJ‚è•Ô‚µ‚½‚¢‰ñ”‚ğ“ü—ÍF");
		inNum = sc.nextInt();	// ŒJ‚è•Ô‚µ‰ñ”‚ğ“ü—Í
		
		// ŒJ‚è•Ô‚µˆ—
		for(int count=1; count<=inNum; count++){
			System.out.println("UŒ‚" + count + "‰ñ–Ú!");
		}
		System.out.println("UŒ‚I—¹");
	}
}
