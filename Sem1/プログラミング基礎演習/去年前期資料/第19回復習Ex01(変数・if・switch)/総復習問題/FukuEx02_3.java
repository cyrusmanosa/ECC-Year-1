/**
 * �v���O�������y�ǂ��������̊m�F�z�ł�
 * ���s����O��
 * �ǂ̂悤�Ȏ��s���ʂɂȂ邩�\�z�𗧂ĂĂ���
 * ���s���Ă݂܂��傤�I
 * 
 */


import java.util.Scanner;

class FukuEx02_3{
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
		System.out.println("\n inNum == target �̌��ʂ�" + (inNum == target));
		if(inNum == target){
			System.out.println("���͒l��"+target+"�͓�����");
		}
		
		// �������͒l��10�Ɠ������Ȃ��Ȃ�
		System.out.println("\n inNum != target �̌��ʂ�" + (inNum != target));
		if(inNum != target){
			System.out.println("���͒l��"+target+"�͓������Ȃ�");
		}
		
		// �������͒l��10��菬�����Ȃ�
		System.out.println("\n inNum < target �̌��ʂ�" + (inNum < target));
		if(inNum < target){
			System.out.println("���͒l��"+target+"��菬����");
		}
		
		// �������͒l��10�ȉ��Ȃ�
		System.out.println("\n inNum <= target �̌��ʂ�" + (inNum <= target));
		if(inNum <= target){
			System.out.println("���͒l��"+target+"�ȉ�");
		}
		
		// �������͒l��10���傫���Ȃ�
		System.out.println("\n inNum > target �̌��ʂ�" + (inNum > target));
		if(inNum > target){
			System.out.println("���͒l��"+target+"���傫��");
		}
		
		// �������͒l��10�ȏ�Ȃ�
		System.out.println("\n inNum >= target �̌��ʂ�" + (inNum >= target));
		if(inNum >= target){
			System.out.println("���͒l��"+target+"�ȏ�");
		}
		
	}
}