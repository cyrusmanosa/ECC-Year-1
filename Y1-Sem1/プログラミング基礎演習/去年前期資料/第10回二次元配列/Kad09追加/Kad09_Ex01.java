import java.util.Scanner;
import java.util.Random;

public class Kad09_Ex01 {
	public static void main(String[] args) {
		final int GU = 0;
		final int CHOKI = 1;
		final int PA = 2;
		
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		
		System.out.println("����񂯂�����܂��I");
		
		while(true) {
			// �u��v�̑I��
			System.out.print("���Ȃ��͉����o���܂����H�i0�F�O�[�A1�F�`���L�A2�F�p�[�A-1�F�I���j��");
			int user = sc.nextInt();
			if (user < 0) break;
			
			int comp = rnd.nextInt(3);
			System.out.println();
			
			// �u��v�̕\��
			System.out.print("���Ȃ���");
			switch(user) {
				case GU:	System.out.println("�O�[���o�����I");	break;
				case CHOKI:	System.out.println("�`���L���o�����I");	break;
				case PA:	System.out.println("�p�[���o�����I");	break;
			}
			System.out.print("�R���s���[�^��");
			switch(comp) {
				case GU:	System.out.println("�O�[���o�����I");	break;
				case CHOKI:	System.out.println("�`���L���o�����I");	break;
				case PA:	System.out.println("�p�[���o�����I");	break;
			}
			
			// ����
			if (user == comp) {
				System.out.println("���������I");
			}
			else if (((user == GU)&&(comp == CHOKI))||((user == CHOKI)&&(comp == PA))||((user == PA)&&(comp == GU))) {
				System.out.println("���Ȃ��̏����I");
			}
			else {
				System.out.println("���Ȃ��̕����I");
			}
			System.out.println();
		}
	}
}
