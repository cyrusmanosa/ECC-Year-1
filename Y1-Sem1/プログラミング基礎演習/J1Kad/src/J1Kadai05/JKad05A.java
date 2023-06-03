package J1Kadai05;

import java.util.Scanner;
class JKad05A{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("���a����͂��Ă�������");
		
		double r = in.nextDouble();
		double a = 4 * 3.14 * (r * r);
		double b = (4 * 3.14 * (r * r * r))/3;
		
		System.out.println("���a" + r + "�̋��̕\�ʐς�" + a + "�A�̐ς�" + b + " �ł��I");
	}
}