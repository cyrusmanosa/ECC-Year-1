// Scanner��import��
import java.util.Scanner;
// InputMismatchException��import��
import java.util.InputMismatchException;

class Sample13_1b{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num;
		
		try{
		// �G���[���m�͈� ��������
			System.out.print("���l����͂��Ă�������:");
			num = sc.nextInt();
			System.out.println("���͒l��" + num);
			
		// �G���[���m�͈� �����܂�
		}catch(InputMismatchException e){
			
		// �G���[�����m�����ۂ̏���
			System.out.println("�G���[���e:" + e);
			System.out.println("���͒l���s���ł�");
		}
	}
}
