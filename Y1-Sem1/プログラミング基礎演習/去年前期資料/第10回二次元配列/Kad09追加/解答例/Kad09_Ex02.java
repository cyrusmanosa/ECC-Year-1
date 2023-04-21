import java.util.Scanner;
import java.util.Random;

public class Kad09_Ex02 {
	public static void main(String[] args) {
		final int WIN = 0;
		final int LOSE = 1;
		final int DRAW = 2;
		
		int[][] hantei = {
			{DRAW,  WIN, LOSE, LOSE,  WIN},
			{LOSE, DRAW,  WIN, LOSE,  WIN},
			{ WIN, LOSE, DRAW, LOSE,  WIN},
			{ WIN,  WIN,  WIN, DRAW, LOSE},
			{LOSE, LOSE, LOSE,  WIN, DRAW},
		};
		
		String[] strHands = {"�R��", "�|��", "����", "�叫", "�X�p�C"};
		String[] strHantei = {"���Ȃ��̏����I", "���Ȃ��̕����I", "���������I"};
		
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		
		System.out.println("����񂯂�����܂��I");
		
		while(true) {
			System.out.print("���Ȃ��͉���I�т܂����H�i");
			for (int i = 0; i < strHands.length; i++) {
				System.out.print(i + "�F" + strHands[i] + "�A");
			}
			System.out.print("-1�F�I���j��");
			int user = sc.nextInt();
			if (user < 0 ) break;
			
			int comp = rnd.nextInt(strHands.length);
			System.out.println();
			
			System.out.println("���Ȃ���" + strHands[user] + "��I�񂾁I");
			System.out.println("�R���s���[�^��" + strHands[comp] + "��I�񂾁I");
			System.out.println(strHantei[hantei[user][comp]]);
			System.out.println();
		}
	}
}
