/*
	�������̂���񂯂�v���O�����ł��B
	exLv.1:������CPU�̎��\������v���O�����ɂ��܂��傤�I
	exLv.2:���s��\������v���O�����ɂ��܂��傤�I
	exLv.3:2�񏟂܂ŌJ��Ԃ��v���O�����ɂ��܂��傤�I

*/
import java.util.*;

class ExKad07_1{
	public static void main(String[] args){
		/* �錾�� */
		// ���Ȃ��̎�
		int myHand;		// 0:�O�[ / 1:�`���L/ 2:�p�[
		// CPU�̎�
		int enmHand;	// 0:�O�[ / 1:�`���L/ 2:�p�[
		
		/* �Q�[���J�n�� */
		System.out.println("����񂯂���s���܂��I");
		System.out.println("�o�������͂��Ă��������I:0:�O�[ / 1:�`���L/ 2:�p�[");
	
		/* �o������L�[�{�[�h�œ��� */
		
		
		/* ���Ȃ��̏o�����\�� */
		// �\�����e�𕪊�
			System.out.println("���Ȃ��̎�̓O�[");
			System.out.println("���Ȃ��̎�̓`���L");
			System.out.println("���Ȃ��̎�̓p�[");
				
		/* �R���s���[�^�̎���������� */
		Random rnd = new Random();	// ���������p
		enmHand = rnd.nextInt(3);	// 0�`2�܂ł̗����𐶐�
		
		/* �R���s���[�^�̎��\�� */
		// �\�����e�𕪊�
			System.out.println("CPU�̎�̓O�[");
			System.out.println("CPU�̎�̓`���L");
			System.out.println("CPU�̎�̓p�[");
		
		/* ���s���� */
		//�\�����e�𕪊�
			System.out.println("���Ȃ��̏���");
			System.out.println("���Ȃ��̕���");
			System.out.println("������");
	}
}