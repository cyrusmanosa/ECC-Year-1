/*
���͂���������3�Ŋ������Ƃ��̗]���\�����鏈������������Ă���B
���������̒l����͂���Ɖ����\�����ꂸ�ɏI������B
���̒l�����͂����܂ŁA���͏������J��Ԃ��悤�ɏ�����ǉ�����B


�iBefore�j
3�Ŋ������]����v�Z���܂��I
���̐�������͂��Ă���������-1

�iAfter�j
3�Ŋ������]����v�Z���܂��I
���̐�������͂��Ă���������-1
���̐�������͂��Ă���������-5
���̐�������͂��Ă���������10
�]���1�ł��I


*/

import java.util.Scanner;

public class Ex06_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("3�Ŋ������]����v�Z���܂��I");
		System.out.print("��������͂��Ă���������");
		int num = sc.nextInt();
		
		switch(num % 3) {
		case 0:
			System.out.println("����؂�܂����I");
			break;
		case 1:
			System.out.println("�]���1�ł��I");
			break;
		case 2:
			System.out.println("�]���2�ł��I");
			break;
		}
	}
}
