import java.util.Scanner;

class FukuEx05_8{
	
	/*	2�̈����𑫂����v�Z���ʂ�Ԃ����\�b�h
		���� int�^	num1 : 1�ڂ̐��l	
		���� int�^	num2 : 2�ڂ̐��l
		�߂�l int�^ 2�̈����𑫂����v�Z����
	 */
	
	
	
	/* ���C�����\�b�h */
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int inNum1;	// �������͗p1
		int inNum2;	// �������͗p2
		int result;	// ���ʊi�[�p
		
		System.out.print("�v�Z����l����� ����1:");
		inNum1 = Integer.parseInt(sc.next());
		
		System.out.print("�v�Z����l����� ����2:");
		inNum2 = Integer.parseInt(sc.next());
		
		// ���͂����l�Q�������Ƃ��ă��\�b�h�ɓn���A�󂯎�����l��ϐ�result�֑��
		
		System.out.println("�v�Z����:" + result);
	}
}
