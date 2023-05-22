import java.util.Scanner;

class TryMethod03{
	public static void show(int count){
		int i = 0;
		while (i < count){
			System.out.println("Hello");
			i++;
		}
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int inNum;
		System.out.print("•\Ž¦‚µ‚½‚¢‰ñ”‚ð“ü—ÍF");
		inNum = in.nextInt();
		show(inNum);
	}
}