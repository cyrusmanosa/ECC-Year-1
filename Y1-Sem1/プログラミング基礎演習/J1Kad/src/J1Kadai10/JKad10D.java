package J1Kadai10;

import java.util.Scanner;

class JKad10D{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("�������I�������֍s�����I�I");
		System.out.print("���Ȃ��̔N�����͂��Ă���������");
		int a = in.nextInt();
		if (a < 6) {
			System.out.println("�����ł��I");
		}
		if (a >= 6 && a < 15){
			System.out.println("�q�������F200 �~�ɂȂ�܂��I");
		}
		if (a >= 15){
			System.out.println("��l�����F500 �~�ɂȂ�܂��I");
		}
	}
}