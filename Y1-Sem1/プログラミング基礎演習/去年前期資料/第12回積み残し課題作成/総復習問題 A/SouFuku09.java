
/*
	2�̔z������p���ĉ��L�̐}�`��\������v���O�������쐬���Ȃ���
	bluePrint�z��̒��g�̐��l�͕ύX���Ă悢�B
	
	[���s����]
	������������
	������������
	������������
	������������
*/

// Scanner��import��
import java.util.Scanner;

class SouFuku09{
	public static void main(String[] args){
		/*******
		* �錾 *
		********/
		
		// 0�Ԗڂ́�,1�Ԗڂ́�,2�Ԗڂ́�,3�Ԗڂ́��̔z��
		final String shape[] = {"��","��","��","��"};
		
		// �g�p����}�`�̐݌v�}
		int bluePrint[][] = {	{3,1,1,1,1,3},
								{0,2,1,1,2,0},
								{0,2,1,1,2,0},
								{3,2,1,1,2,3}};
		
		/***********
		* ���s���� *
		************/
		
		// �s�����J��Ԃ�
		for(int i=0; i<bluePrint.length; i++){
			// �񐔕��J��Ԃ�
			for(int j=0; j<bluePrint[i].length; j++){
				// bluePrint�z�������shape�z��̐}�`��1�\��
				System.out.print(shape[bluePrint[i][j]]);
			}
			// 1�s�̂����ɉ��s
			System.out.println();
		}
	}
}