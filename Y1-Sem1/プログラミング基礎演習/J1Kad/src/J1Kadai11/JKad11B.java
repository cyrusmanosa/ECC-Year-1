package J1Kadai11;

import java.util.Scanner;

class JKad11B{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("�������I�����ق֍s�����I�I");
		System.out.print("���Ȃ��̔N�����͂��Ă���������");
		int a = in.nextInt();
		if (a >= 65) {
			System.out.println("�V�j�A�����F2200 �~�ɂȂ�܂��I");
		}else if (a < 65 && a >= 15 ) {
			System.out.println("��l�����F2400 �~�ɂȂ�܂��I");
		}else if ( a >= 6 && a < 15 ){
			System.out.println("�q�������F1200 �~�ɂȂ�܂��I");
		}else if (a >= 3 && a < 6) {
			System.out.println("�c�������F600 �~�ɂȂ�܂��I");
		}else {
			System.out.println("�����ł��I");
		}
	}
}