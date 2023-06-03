package J1Kadai09;

import java.util.Scanner;

class JKad09D1{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("�ЂƂ߂̐�������͂��Ă���������");
		int o = in.nextInt();
		System.out.print("�ӂ��߂̐�������͂��Ă���������");
		int t = in.nextInt();
		if (o > t) {
			System.out.print("�ӂ��̐����ő傫������" + o + "�ł��I");
		}else{
			System.out.print("�ӂ��̐����ő傫������" + t + "�ł��I");
		}
	}
}