// Scanner��import��
import java.util.Scanner;
// InputMismatchException��import��
import java.util.InputMismatchException;

class Sample13_2a{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int inNum1;	// ����1���͗p
		int inNum2;	// ����2���͗p
		
		try{
		// �G���[���m�͈� ��������
			System.out.println("����Z�����܂��A���l����͂��Ă�������");
			System.out.print("num1:");
			inNum1 = sc.nextInt();
			
			System.out.print("num2:");
			inNum2 = sc.nextInt();
			
			System.out.println("����:" +(inNum1/inNum2) );
			
		// �G���[���m�͈� �����܂�
		}catch(InputMismatchException e){
			// ���̓G���[�����m�����ۂ̏���
			System.out.println("�G���[���e:" + e);
			System.out.println("���l����͂��Ă�������");
		}catch(ArithmeticException e){
			// ���Z�G���[�����m�����ۂ̏���
			System.out.println("�G���[���e:" + e);
			System.out.println("0�Ŋ��邱�Ƃ͏o���܂���");
		}
	}
}
