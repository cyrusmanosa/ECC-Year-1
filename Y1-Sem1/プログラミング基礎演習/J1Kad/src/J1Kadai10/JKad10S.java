package J1Kadai10;

import java.util.Scanner;

class JKad10S{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		final int IE = 1;
		final int SK = 2;
		final int SE = 3;

		System.out.println("����ɂ��́I");
		System.out.println("�킽���̓X�[�p�[�e�B�[�`���[�AECC �G�N�Z�����g��I");
		System.out.print("���Ȃ��̃R�[�X�������ĂˁI�i1�FIE�A2�FSK�A3�FSE�j��");
		int a = in.nextInt();
		if (a > 3) {
			System.out.println("�����Ɠ����ĂˁI");
		}else{
			System.out.print("�����N���H");
			int b = in.nextInt();
			if (a <= 3 && b <= 4 && b > 0){
				System.out.println("IT �J���b�W�̊w������A��낵���ˁI");
				}else if (a == 1 && (b <= 0 || b > 4)) {
						System.out.println("IE ��4 �N���R�[�X��I");
					} 
					else if (a == 2 && (b <= 0 || b > 3)) {
						System.out.println("SK ��3 �N���R�[�X��I");
					} 
					else if (a == 3 && (b <= 0 || b > 2)) {
						System.out.println("SE ��2 �N���R�[�X��I");
					} 
				}
		}
	}

			