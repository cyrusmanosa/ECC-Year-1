package J1Kadai04;

import java.util.Scanner;
class JKad04S2{
	public static void main(String[] args){
		int Num;
		int x;
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int g;
		int h;
		
		Scanner in = new Scanner(System.in);
		System.out.print("0 ����255 �܂ł̐�������͂��Ă���������");
		
		Num = in.nextInt();
		
		x = Num%2;
		a = (Num/2)%2;
		b = ((Num/2)/2)%2;
		c = (((Num/2)/2)/2)%2;
		d = ((((Num/2)/2)/2)/2)%2;
		e = (((((Num/2)/2)/2)/2)/2)%2;
		f = ((((((Num/2)/2)/2)/2)/2)/2)%2;
		g = (((((((Num/2)/2)/2)/2)/2)/2)/2)%2;
		//h = ((((((((Num/2)/2)/2)/2)/2)/2)/2)/2)%2;
		
		System.out.println("�ŏ�ʃr�b�g���珇�ɕ\�����܂��I");
		//System.out.print(h);
		System.out.print(g);
		System.out.print(f);
		System.out.print(e);
		System.out.print(d);
		System.out.print(c);
		System.out.print(b);
		System.out.print(a);
		System.out.print(x);
	}
}