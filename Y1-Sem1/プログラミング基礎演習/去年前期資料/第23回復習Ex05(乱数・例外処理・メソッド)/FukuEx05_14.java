/*
	�N�ƌ�����͂�
	���̌��̍ŏI����\�����郁�\�b�h���쐬��
	�v���O�������������Ȃ���
	
	
	[���s����]2000��2����͂����p�^�[��
	���2000
	����2
	2000�N2���̍ŏI����29���ł��B
	
	[���s����]2100��2����͂����p�^�[��
	���2100
	����2
	2100�N2���̍ŏI����28���ł��B
	
	
	[���s����]2000��13����͂����p�^�[��
	���2000
	����13
	���̌��͑��݂��܂���B
	
*/

import java.util.Scanner;

class FukuEx05_14{
	 
	/*	
		���\�b�h���FgetDayOfMonth
		���\�b�h(��������A�߂�l����)
		����1 :int year	���肷��Ώۂ̔N
		����2 :int month ���肷��Ώۂ̌�
		�߂�l :int�^	���̌��̍ŏI����߂�l�Ƃ��ĕԂ�
	 */
	public static �߂�l�̌^ ���\�b�h��(����1�̌^ ����1�̕ϐ���, ����2�̌^ ����2�̕ϐ���) {
		final int[] LASTDAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};//1~12���̍ŏI��
		boolean isLeapYear; //	���邤�N���̔��茋��	���邤�N�Ȃ�true �Ⴄ�Ȃ�false
		
		// ���邤�N����
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
			isLeapYear = true;
		}else{
			isLeapYear = false;
		}
		
		
		//��������2�� ���� isLeapYear��true�̏ꍇ
		
			// LASTDAYS�z���2���̍ŏI���̒l�Ɂ{�P�������l��Ԃ�
												//28����29��
		
		
		// LASTDAYS�z��̊Y�����̍ŏI����Ԃ�
		
	}
	 
	
	 
	/* ���C�����\�b�h */
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int inYear;	// �N�̓��͗p
		int inMonth;// ���̓��͗p
		
		try{
			System.out.print("���");
			inYear = Integer.parseInt(sc.next());
			System.out.print("����");
			inMonth = Integer.parseInt(sc.next());
			
			// getDayOfMonth���\�b�h�����p�����͂������̍ŏI����\������
			System.out.println(inYear + "�N" + inMonth + "���̍ŏI����" + 		 + "���ł��B");
		}catch(NumberFormatException nfe){
			System.out.println("���͒l���s���ł��B");
		}catch(ArrayIndexOutOfBoundsException aiobe){
			System.out.println("���̌��͑��݂��܂���B");
		}
	}
}
