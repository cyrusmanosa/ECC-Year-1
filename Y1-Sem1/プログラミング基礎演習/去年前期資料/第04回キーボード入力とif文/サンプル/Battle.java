import java.util.*;

/**
 * �X���C���Ƃ̐퓬���s���Q�[���v���O�����J���ł�
 * ���߂�ꂽ�͈͓���
 * �v���O������ǋL��
 * �퓬�v���O���������������܂��傤�I
 */

class Battle{
	public static void main(String[] args){
		// �錾��
		Scanner sc = new Scanner(System.in);
		int enmHp = 10;	// �G��HP
		int myHp = 10;	// ������HP
		int ATTACK_POINT = 11;	// ���Ȃ��̍U����
		
		/* �R�}���h���� */
		System.out.println("�X���C�������ꂽ�I");
		System.out.println("���Ȃ��͂ǂ�����H");
		System.out.println("�U��:1  / �ɂ���:2");
		System.out.print("���͂��Ă�������:");
		int inNum = sc.nextInt();	// inNum�ɑI��������
		
		///////////////////////////////////////////////////////////
		/*** ����  ��������퓬������ǋL���Ă�������    ����  ***/
		
		/* �������� */
		// �U����I�񂾎��̏���(�������͂����l��1��������)
		if(inNum == 1){
			// ���Ȃ��̍U���̃��b�Z�[�W��\��
			System.out.println("���Ȃ��̍U���F" + ATTACK_POINT + "�̃_���[�W��^�����I");
			
			// �����HP���玩���̍U���͕��}�C�i�X����
			enmHp -= ATTACK_POINT;
		}else{
		// �U���ȊO��I�񂾎��̏���(�������͂����l��1�łȂ�������)
		
			System.out.println("���Ȃ��͓����o����");
			enmHp = 10;
		
		}
		/*** ����  �����܂łɐ퓬������ǋL���Ă�������   ���� ***/
		///////////////////////////////////////////////////////////
		
		/* �G�̃^�[�� */
		if(inNum == 2){
			System.out.println("�����悤�Ƃ�������荞�܂ꂽ�I");
			enmHp = 10;
		}else if(inNum != 1){
			System.out.println("���Ȃ��͍������Ă���I");
			enmHp = 10;
		}
		
		if(enmHp > 0){
			System.out.println("�X���C���̓W�S�X�p�[�N3�A����������");
			System.out.println("���Ȃ���999�̃_���[�W");
			myHp -= 999;
			System.out.println("���Ȃ���999�̃_���[�W");
			myHp -= 999;
			System.out.println("���Ȃ���999�̃_���[�W");
			myHp -= 999;
			
			if(myHp < 0){
				System.out.println("���Ȃ��͓|�ꂽ");
				System.out.println("GAME OVER");
			}
		}else{
			System.out.println("�G��|�����I");
		}
	}
}