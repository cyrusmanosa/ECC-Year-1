package J1Kadai04;

import java.util.Scanner;

class JKad04A{
	public static void main(String[] args){
		int Num;
		int A;
		int B;
		int C;
		int D;
		
		Scanner in = new Scanner(System.in);
		System.out.print("�����ԍ�����͂��Ă���������");
		
		Num = in.nextInt();
		//��
		A = (Num / 1000);
		//�S
		B = (Num % 1000)/100; 
		//�\
		C = (Num % 1000)%100/10; 
		//�P
		D = (Num % 1000)%100%10;
		System.out.println("��̈�" + D);
		System.out.println("�\�̈�" + C);
		System.out.println("�S�̈�" + B);
		System.out.println("��̈�" + A);
	}
}