package J1Kadai09;

import java.util.Scanner;

class JKad09D2{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("����ɂ��́I");
		System.out.println("�킽���̓X�[�p�[�e�B�[�`���[�AECC �G�N�Z�����g��I");
		System.out.println("���Ȃ��̃N���X�������ĂˁI");
		System.out.print("�i1�FIE�A2�FSK�A3�FSE��");
		int c = in.nextInt();
		
		if (c == 1){
			System.out.println(" 4 �N���R�[�X�Ȃ̂ˁI");
		}else if (c == 2){
			System.out.println(" 3 �N���R�[�X�Ȃ̂ˁI");
		}else{
			System.out.println(" 2 �N���R�[�X�Ȃ̂ˁI");
		}
	}
}
