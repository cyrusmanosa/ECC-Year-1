/*
ATM�̓������s����v���O����������������



[���s���ʗ�] a����͂����p�^�[��
ATM���N�����܂�
���݂̒����z:10000�~
�����璙�����܂����H
�����z:a
�G���[���e:java.util.InputMismatchException
���l����͂��Ă�������
���݂̒����z:10000�~
�����p���肪�Ƃ��������܂���



[���s���ʗ�] 5000����͂����p�^�[��
ATM���N�����܂�
���݂̒����z:10000�~
�����璙�����܂����H
�����z:5000
������������
���݂̒����z:15000�~
�����p���肪�Ƃ��������܂���
*/

// Scanner��import��
import java.util.Scanner;
// InputMismatchException��import��
import java.util.InputMismatchException;

class FukuEx05_6{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int savingMoney = 10000;	// �����z
		int inMoney;				// �����p
		
		
		// �G���[���m�͈� ��������
			System.out.println("ATM���N�����܂�");
			System.out.println("���݂̒����z:" + savingMoney + "�~");
			
			
			System.out.println("�����璙�����܂����H");
			System.out.print("�����z:");
			inMoney = sc.nextInt();
			
			// �����z�ɓ����z�����Z����
			
			
			System.out.println("������������");
			
		// �G���[���m�͈� �����܂�
		
			// ���̓G���[�����m�����ۂ̏���
			System.out.println("�G���[���e:" + e);
			System.out.println("���l����͂��Ă�������");
		
		
		System.out.println("���݂̒����z:" + savingMoney + "�~");
		System.out.println("�����p���肪�Ƃ��������܂���");
	}
}
