import java.util.Scanner;

class JKad10B{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("�������I�����ق֍s�����I�I");
		System.out.print("���Ȃ��̔N�����͂��Ă���������");
		int a = in.nextInt();
		if (a >= 65) {
			System.out.println("�V�j�A�����F2200 �~�ɂȂ�܂��I");
		}
		
		if (a < 65 && a >= 15 ) {
			System.out.println("��l�����F2400 �~�ɂȂ�܂��I");
		}
		if ( a >= 6 && a < 15 ){
			System.out.println("�q�������F1200 �~�ɂȂ�܂��I");
		}
		
		if (a >= 3 && a < 6) {
			System.out.println("�c�������F600 �~�ɂȂ�܂��I");
		}
		
		if (a < 3) {
			System.out.println("�����ł��I");
		}
	}
}