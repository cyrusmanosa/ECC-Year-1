package J1Kadai06;

import java.util.Scanner;
class JKad06S1{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		System.out.print("�ЂƂ߂̐�������͂��Ă���������");
		int n1 = in.nextInt();
		
		System.out.print("�ӂ��߂̐�������͂��Ă���������");
		int n2 = in.nextInt();
		
		System.out.println("�̂ё����v�Z���܂��I");
		int a1 = n1 / n2;
		System.out.println("�u" + n1 + "��" + n2 + "��" + a1 + "�ł��I�v");
		
		System.out.println("�o�ؐ����񂪌v�Z���܂��I");
		double a2 = (double)n1 / (double)n2;
		System.out.println("�u" + n1 + "��" + n2 + "��" + a2 + "�ł��I�v");
		
		in.close();
	}
}