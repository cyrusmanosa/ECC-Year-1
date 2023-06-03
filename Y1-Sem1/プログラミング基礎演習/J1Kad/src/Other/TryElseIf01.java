package Other;

import java.util.*;

class TryElseIf01{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("�_������͂��Ă�������");
		int inScore = in.nextInt();
		
		// ���������������
		if(inScore <= 30){
			System.out.println("�����Ɛ^�ʖڂ�");
		}
		if(inScore > 30){
			System.out.println("�����Ɗ撣�낤");
		}
		if(inScore > 50){
			System.out.println("�����ȏ�͎��Ă܂�");
		}
		if(inScore > 70){
			System.out.println("������x�����o���Ă��܂�");
		}
		if(inScore > 80){
			System.out.println("�悭�������Ă��܂�");
		}
		if(inScore > 90){
			System.out.println("�����Ƒf���炵��");
		}
		
		
	}
}