package J1Kadai08;

import java.util.Scanner;
class JKad08S1{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("A ����̑O���Ԃ��ʉ߂��܂��I");
		System.out.print("��Ԃ̑��x�i�����j����͂��Ă���������");
		double v = in.nextDouble();
		v = (double)((v*1000)/(60*60));
		System.out.print("��Ԃ̒����i���[�g���j����͂��Ă���������");
		double s = in.nextDouble();
		double t = (double)(s/v);
		System.out.println(t + "�b������܂��I");
	}
}