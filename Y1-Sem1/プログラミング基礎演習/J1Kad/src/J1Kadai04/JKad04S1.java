import java.util.Scanner;
class JKad04S1{
	public static void main(String[] args){
		int Num;
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int g;
		int h;
		
		Scanner in = new Scanner(System.in);
		System.out.print("0 から255 までの整数を入力してください＞");
		
		Num = in.nextInt();
		
		a = (Num/2)%2;
		b = ((Num/2)/2)%2;
		c = (((Num/2)/2)/2)%2;
		d = ((((Num/2)/2)/2)/2)%2;
		e = (((((Num/2)/2)/2)/2)/2)%2;
		f = ((((((Num/2)/2)/2)/2)/2)/2)%2;
		g = (((((((Num/2)/2)/2)/2)/2)/2)/2)%2;
		h = ((((((((Num/2)/2)/2)/2)/2)/2)/2)/2)%2;
		
		System.out.println("最下位ビットから順に表示します！");
		System.out.println(h);
		System.out.println(g);
		System.out.println(f);
		System.out.println(e);
		System.out.println(d);
		System.out.println(c);
		System.out.println(b);
		System.out.println(a);
	}
}