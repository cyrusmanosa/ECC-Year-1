/*
	���͂����N�����邤�N�����肵
	���邤�N�Ȃ�ture���Ⴄ�Ȃ�false��߂�l�Ƃ���
	���\�b�h���쐬���Ȃ���
	
	
	[���s����]2000����͂����p�^�[��
	���邤�N�����肵�����N����͂��Ă�������
	���2000
	���͂����������邤�N���̔��茋�ʂ�true�ł��I
	
	
	[���s����]2100����͂����p�^�[��
	���邤�N�����肵�����N����͂��Ă�������
	���2100
	���͂����������邤�N���̔��茋�ʂ�false�ł��I
	
	
	[���s����]a����͂����p�^�[��
	���邤�N�����肵�����N����͂��Ă�������
	���a
	���͒l���s���ł��B
	
*/

import java.util.Scanner;

class FukuEx05_13{
	 
	/*	
		���\�b�h���FisLeapYear
		���\�b�h(��������A�߂�l����)
		���� :int year	���肷��Ώۂ̔N
		�߂�l :boolean�^	���邤�N�Ȃ�true �Ⴄ�Ȃ�false
	 */
	 public static �߂�l�̌^ ���\�b�h��(�����̌^ ������){
	 	// ����(�N��4�Ŋ���؂�� ���� �N��100�Ŋ���؂�Ȃ�) �܂��� (�N��400�Ŋ���؂��) �ꍇ
	 		
			// true��Ԃ�
			
		
		// false��Ԃ�
		
	 }
	 
	
	 
	/* ���C�����\�b�h */
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int inYear;	// �N�̓��͗p
		
		try{
			System.out.println("���邤�N�����肵�����N����͂��Ă�������");
			System.out.print("���");
			inYear = Integer.parseInt(sc.next());
			
			// isLeapYear���\�b�h�����p���A���邤�N�����茋�ʂ�\��
			System.out.println("���͂����������邤�N���̔��茋�ʂ�"+   + "�ł��I");
			
		}catch(NumberFormatException e){
			System.out.println("���͒l���s���ł��B");
		}
	}
}
