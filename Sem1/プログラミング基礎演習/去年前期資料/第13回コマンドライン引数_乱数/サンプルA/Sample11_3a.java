/*
	�R�}���h���C�������Ƃ���
	���s�p�����[�^��[�O�[ �`���L �p�[]��ݒ肵�Ă�������

*/

// Random��import��
import java.util.Random;

class Sample11_3a{
	public static void main(String args[]){
		// Random
		Random rnd = new Random();
		
		// ��̏o���񐔂̃J�E���g�p
		int handCount[] = new int[3];
		
		for(int i = 1; i <= 10; i++){
			int ransu = rnd.nextInt(args.length);	//0~2�̗�������
			System.out.println(i + "��ځF" + args[ransu]);
			handCount[ransu]++;	//�o����̉񐔂�1���₷
		}
		
		System.out.println("\n*** ���ʕ\�� ***");
		//���ʕ\��
		for(int i = 0; i < handCount.length; i++){
			System.out.println(args[i] + "�F" + handCount[i] + "��");
		}
	}
}
