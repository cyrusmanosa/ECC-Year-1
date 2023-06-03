package J1Kadai09;

import java.util.Scanner;
class JKad09C{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("�ЂƂ��������S��H�ׂ܂��I");
		System.out.print("�����S�̐�����͂��Ă���������");
		int a = in.nextInt();
		System.out.print("�H�ׂ�l�̐�����͂��Ă���������");
		int p = in.nextInt();
		int an = a / p;
		int h = a % p;
		
		if (an ==1){
			System.out.println("�ЂƂ��������S��H�ׂ��I");
			System.out.println("�c���������S��" + h + "�ł��I");
		}else if (an == 0){
			System.out.println("�����S�̐�������܂���I");
		}
	}
}
			