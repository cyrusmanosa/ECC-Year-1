
/*
	switch�������p�����͂������̋G�߂�\�����Ȃ���
	�������A[System.out.println�͌��󂠂���̂���]��
	[�ǉ��͋֎~]�Ƃ���B
	
	�t: 3, 4, 5
	��: 6, 7, 8
	�H: 9,10,11
	�~:12, 1, 2
	�G���[:��L�ȊO
	----------------------------------------
	
	[���s����]2����͂����p�^�[��
	��������͂��Ă�������:2
	�~�ł�

	
	[���s����]8����͂����p�^�[��
	��������͂��Ă�������:8
	�Ăł�
	
	[���s����]13����͂����p�^�[��
	��������͂��Ă�������:13
	���̓G���[
	
*/

// Scanner��import��
import java.util.Scanner;

class SouFuku05{
	public static void main(String[] args){
		/*******
		* �錾 *
		********/
		// ���̓��͗p
		int inMonth;
		// Scanner
		Scanner sc = new Scanner(System.in);
		
		/***********
		* ���s���� *
		************/
		System.out.print("��������͂��Ă�������:");
		inMonth = sc.nextInt();
		
		// ���͂����l�ɂ���ĕ���(switch��)
		switch(inMonth){
			// 3���`5���̏ꍇ
			case 3:
			case 4:
			case 5:
				System.out.println("�t�ł�");
				break;
			// 6���`8���̏ꍇ
			case 6:
			case 7:
			case 8:
				System.out.println("�Ăł�");
				break;
			// 9���`11���̏ꍇ
			case 9:
			case 10:
			case 11:
				System.out.println("�H�ł�");
				break;
			// 12���`2���̏ꍇ
			case 12:
			case 1:
			case 2:
				System.out.println("�~�ł�");
				break;
			// ����ȊO(�͈͊O)
			default:
				System.out.println("���̓G���[");
		}
	}
}