// Scanner��import��
import java.util.Scanner;

class Sample13_2b{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int inNum1;	// ����1���͗p
		
		try{
		// �G���[���m�͈� ��������
			System.out.println("���l����͂��Ă�������");
			System.out.print("num1:");
			inNum1 = Integer.parseInt(sc.next());
				
			System.out.println("����:" + inNum1);
			
		// �G���[���m�͈� �����܂�
		}catch(NumberFormatException e){
			// ���̓G���[�����m�����ۂ̏���
			System.out.println("�G���[���e:" + e);
			System.out.println("���͒l�𐮐��ɕϊ��ł��܂���");
		}
	}
}
