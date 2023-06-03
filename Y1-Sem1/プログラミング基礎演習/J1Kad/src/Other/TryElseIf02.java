package Other;

import java.util.*;

class TryElseIf02{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("�_������͂��Ă���������");
		int inScore = in.nextInt();
		
		// ���������������
		if(inScore > 90){
			System.out.println("�����Ƒf���炵��");
		}else if(inScore > 80){
			System.out.println("�悭�������Ă��܂�");
		}else if(inScore > 70){
			System.out.println("������x�����o���Ă��܂�");
		}else if(inScore > 50){
			System.out.println("�����ȏ�͎��Ă܂�");
		}else if(inScore > 30){
			System.out.println("�����Ɗ撣�낤");
		}else{
			System.out.println("�����Ɛ^�ʖڂ�");
		}
		
	}
}