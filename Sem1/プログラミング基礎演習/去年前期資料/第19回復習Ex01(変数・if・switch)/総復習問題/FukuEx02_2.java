/**
 * �v���O�������������ł��B
 * ��������r���Z���L����
 * �v���O���������������Ă��������I
 * 
 */


import java.util.Scanner;

class FukuEx02_2{
	public static void main(String[] args){
		/* �錾 */
		Scanner sc = new Scanner(System.in);
		int inNum;
		int target = 10;
		
		/* ���s���� */
		System.out.println("���͂����l��10���ׂ܂�");
		System.out.print("��������́F");
		inNum = sc.nextInt();
		
		// �������͒l��10�Ɠ������Ȃ�
		if(inNum  target){
			System.out.println("���͒l��"+target+"�͓�����");
		}
		
		// �������͒l��10�Ɠ������Ȃ��Ȃ�
		if(inNum  target){
			System.out.println("���͒l��"+target+"�͓������Ȃ�");
		}
		
		// �������͒l��10��菬�����Ȃ�
		if(inNum  target){
			System.out.println("���͒l��"+target+"��菬����");
		}
		
		// �������͒l��10�ȉ��Ȃ�
		if(inNum  target){
			System.out.println("���͒l��"+target+"�ȉ�");
		}
		
		// �������͒l��10���傫���Ȃ�
		if(inNum  target){
			System.out.println("���͒l��"+target+"���傫��");
		}
		
		// �������͒l��10�ȏ�Ȃ�
		if(inNum  target){
			System.out.println("���͒l��"+target+"�ȏ�");
		}
		
	}
}