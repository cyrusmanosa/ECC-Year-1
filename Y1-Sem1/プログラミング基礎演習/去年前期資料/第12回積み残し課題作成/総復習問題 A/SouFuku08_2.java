
/*
	�z������p����CPU�Ƃ̂���񂯂�v���O�������������Ȃ���
	5���̒l(0,1,2)����͂�
	���ꂼ��Y��������\�����Ȃ���
	CPU�̎�͔z��̃v���O�����ŌŒ肵�Ă�����\�����Ȃ���
	
	[���s����]
	5�񂶂�񂯂�����܂��I
	����񂯂�A�A�A
	0:�O�[ 1:�`���L 2:�p�[:2
	���Ȃ�:�p�[
	cpu:�O�[
	
	����񂯂�A�A�A
	0:�O�[ 1:�`���L 2:�p�[:1
	���Ȃ�:�`���L
	cpu:�p�[
	
	����񂯂�A�A�A
	0:�O�[ 1:�`���L 2:�p�[:0
	���Ȃ�:�O�[
	cpu:�O�[
	
	����񂯂�A�A�A
	0:�O�[ 1:�`���L 2:�p�[:1
	���Ȃ�:�`���L
	cpu:�`���L
	
	����񂯂�A�A�A
	0:�O�[ 1:�`���L 2:�p�[:1
	���Ȃ�:�`���L
	cpu:�`���L


*/

// Scanner��import��
import java.util.Scanner;

class SouFuku08_2{
	public static void main(String[] args){
		/*******
		* �錾 *
		********/
		
		// ����񂯂�̎�̔z��
		final String hand[] = {"�O�[","�`���L","�p�["};
		// Scanner
		Scanner sc = new Scanner(System.in);
		// �o����̓��͗p
		int inNum;
		
		// CPU���ǂ̎���o�����i�[�����z��(����̓O�[,���̓p�[�A���̎��̓O�[�A���̎��̓`���L�A���̎��̓`���L)
		int cpuAi[] = {0,2,0,1,1};
		
		
		/***********
		* ���s���� *
		************/
		System.out.println("5�񂶂�񂯂�����܂��I");
		
		// cpuAi�z��̗v�f���J��Ԃ�
		for(int i=0; i<cpuAi.length; i++){
			System.out.println("����񂯂�A�A�A");
			System.out.print("0:�O�[ 1:�`���L 2:�p�[:");
			inNum = sc.nextInt();
			
			// �I�񂾎��\��
			System.out.println("���Ȃ�:" + hand[inNum]);
			// ���߂�ꂽCPU�̎��\��
			System.out.println("cpu:" + hand[ cpuAi[i] ]);
			// ���₷���悤�ɉ��s
			System.out.println();
		}
	}
}