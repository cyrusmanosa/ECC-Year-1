/*

�w�肳�ꂽ�������u���v�����ɕ��ׂ鏈�����쐬����B

�i���s��ʁj
������ׂ܂��I
���ɂ������ׂ܂����H��20
����������������������������������������

*/

// Scanner��import��
import java.util.Scanner;

public class Sample07_2B {
	public static void main(String[] args) {
		/** �錾 **/
		
		// ���ɕ��ׂ鐔�p
		int col;
		// Scanner
		Scanner sc = new Scanner(System.in);
		
		
		/** ���s���� **/
		System.out.println("������ׂ܂��I");
		System.out.print("���ɂ������ׂ܂����H��");
		
		// ���l����͂����ɕ��ׂ�p�̕ϐ��ɑ��
		col = sc.nextInt();
		
		// ���͂����l�����������ɕ��ׂ郋�[�v
		// (i��1����n�߂ē��͂����s���ȉ��̊ԌJ��Ԃ��A�J��Ԃ�����i��1�����₷) ��������)
		for (int i = 0; i < col; i++) {
			// ["��"]��\��
			System.out.print("��");
		
		// ���͂����l�����������ɕ��ׂ郋�[�v
		// (i��1����n�߂ē��͂����s���ȉ��̊ԌJ��Ԃ��A�J��Ԃ�����i��1�����₷) �����܂�)
		}
		//���͂����l�����������ɕ\��������ɉ��s����
		System.out.println();
	}
}
