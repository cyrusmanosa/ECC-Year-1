package Other;

import java.util.Scanner;

public class TryIF01{
	public static void main(String[] args){
		//�ϐ���`
		int inNum01;	//���͒l1
		int inNum02;	//���͒l2
		int maxNum;		//�ő�l
		
		Scanner in = new Scanner(System.in);
		
		//��ڂ̐�������͂��Ă��炤�悤�\��
		System.out.print("�ЂƂ߂̐�������͂��Ă���������");
		//���͒l��ϐ�1�ɑ��
		inNum01 = in.nextInt();
		//��ڂ̐�������͂��Ă��炤�悤�\��
		System.out.print("�ӂ��߂̐�������͂��Ă���������");
		//���͒l��ϐ�2�ɑ��
		inNum02 = in.nextInt();
		//�b��ő�l��ϐ�1�Ƃ��đ��
		maxNum = inNum01;
		//�����ő�l���ϐ��Q���傫�����
		if(maxNum < inNum02){
		//�ő�l�̕ϐ��ɕϐ�2����
		maxNum = inNum02;
		//�ő�l�̕ϐ���\��
		System.out.print("�ӂ��̐����ő傫������" + maxNum + "�ł��I");
		}
	}
}