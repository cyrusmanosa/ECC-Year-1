
/*
	�g��for�������p����
	����̑S����\������v���O�������쐬���Ȃ���

	[���s����]
	����
	���
	�㐙
	
	�_�c
	�؉�
	�v�ۓc
*/

// Scanner��import��
import java.util.Scanner;

class SouFuku10_2{
	public static void main(String[] args){
		/*******
		* �錾 *
		********/
		
		String namesList[][] = { {"����","���","�㐙"},// A�N���X
						   		 {"�_�c","�؉�","�v�ۓc"}};	// B�N���X


		/***********
		* ���s���� *
		************/
		
		// �S�N���X���J��Ԃ�(�g��for��)
		for(String names[] : namesList){
			// �N���X���̐l�������肩����(�g��for��)
			for(String name : names){
				// �N���X����1�l�̖��O��\��
				System.out.println(name);
			}
			// 1�N���X�\����ɉ��s
			System.out.println();
		}
	}
}