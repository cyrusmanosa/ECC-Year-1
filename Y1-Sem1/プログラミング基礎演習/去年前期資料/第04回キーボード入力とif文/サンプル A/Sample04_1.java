import java.util.Scanner;
class Sample04_1{
	public static void main(String[] args){
		// �ϐ��̐錾
		String inStr;
		
		// Scanner�̏���
		Scanner sc = new Scanner(System.in);
		System.out.print("��������͂��Ă�������:");
		
		// Scanner���g�p��������̓��͂��󂯕t����
		inStr = sc.next();
		System.out.println("���͂���������:" + inStr);
		
		// �ϐ��̐錾
		int inNum;
		System.out.print("2�{�ɂ��������l����͂��Ă�������:");
		
		// Scanner���g�p�����l�̓��͂��󂯕t����
		inNum = sc.nextInt();
		System.out.println("�v�Z����:" + (inNum * 2));
	}
}
