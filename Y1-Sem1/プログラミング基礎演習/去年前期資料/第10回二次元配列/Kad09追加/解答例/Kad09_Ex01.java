import java.util.Scanner;
import java.util.Random;

public class Kad09_Ex01 {
	public static void main(String[] args) {
		//final int GU = 0;
		//final int CHOKI = 1;
		//final int PA = 2;
		
		final int WIN = 0;
		final int LOSE = 1;
		final int DRAW = 2;
		
		int[][] hantei = {
			{DRAW,  WIN, LOSE},
			{LOSE, DRAW,  WIN},
			{ WIN, LOSE, DRAW},
		};
		
		String[] strHands = {"�O�[", "�`���L", "�p�["};
		String[] strHantei = {"���Ȃ��̏����I", "���Ȃ��̕����I", "���������I"};
		
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
			System.out.println("���Ȃ���" + strHands[user] + "���o�����I");
			System.out.println("�R���s���[�^��" + strHands[comp] + "���o�����I");
			
			// ����
			System.out.println(strHantei[hantei[user][comp]]);
			System.out.println();
		}
	}
}
