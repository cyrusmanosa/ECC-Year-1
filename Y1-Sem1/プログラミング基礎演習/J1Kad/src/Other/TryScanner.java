package Other;// Scanner��������悤��

import java.util.Scanner;
class TryScanner{
	public static void main(String[] args){
		//�錾
		String inStr;
		
		//Scanner�̏���
		Scanner in = new Scanner(System.in);
		System.out.println("��������͂��Ă�������:");
		
		
		//�ϐ��ɃL�[�{�[�h����󂯕t�����l����
		inStr = in.next();
		System.out.println("���͂���������" + inStr);
		
		//�ϐ��̐錾
		int inNum;
		System.out.println("2�{�ɂ��������l����͂��Ă��������F");
		
		//Scanner���g�p�����l�̓��͂��󂯕t����
		inNum = in.nextInt();
		System.out.println("�v�Z���ʁF" + (inNum*2));
	}
}