package J1Kadai10;

import java.util.Scanner;

class JKad10C1{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		final int IE = 1;
		final int SK = 2;
		final int SE = 3;

		System.out.println("����ɂ��́I");
		System.out.println("�킽���̓X�[�p�[�e�B�[�`���[�AECC �G�N�Z�����g��I");
		System.out.print("���Ȃ��̃R�[�X�������ĂˁI�i1�FIE�A2�FSK�A3�FSE�j��");
		int a = in.nextInt();
		if (a <= 3 ) {
			System.out.println("IT �J���b�W�̊w���ˁI");
		} else {
			System.out.println("�����Ɠ����ĂˁI");
		}
	}
}