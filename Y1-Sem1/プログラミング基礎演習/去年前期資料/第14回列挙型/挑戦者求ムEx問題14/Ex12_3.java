/*
enum�̉��p���@

�@enum�̉���
enum Character {
    �E��(100, 70), ����(80, 50), ���@�g��(20, 120), �m��(40, 80);
	
	
    �i�����ꂾ���ł͗v�f������܂���
		�c��͊e���ōl���邱�ƁA�uJava enum�v�Ńl�b�g�������Ă�OK�j	

}

�A�v���O�����̊ȗ���
�i�e���ōl���邱�Ɓj

*/


import java.util.Scanner;

public class Kad12_Ex03{
	
	enum Character {

	}
	
	public static void main(String[] args){
		
		int hitPoint = 300;	//�����̗̑�
		Scanner sc = new Scanner(System.in);
		
		System.out.println("********** ECC QUEST **********");
		System.out.println("���������ꂽ�I��");
		System.out.println("�u�P�ʂ��~�����΂P�^�[���Ŏ���|���Ă݂�I�v\n");
		
		for(Character c : Character.values()) {
			//�s������
			System.out.print(c + "�͂ǂ�����H[1->�ʏ�U�� 2->���@�U�� ��->������]��");
			int action = sc.nextInt();
			
			//�s������
			switch(action){
			case 1:
				System.out.println(c + "�̒ʏ�U���I " +      + "�_���[�W�I��");
				hitPoint -= ;
				break;
			case 2:
				System.out.println(c + "�̖��@�U���I" +        + "�_���[�W�I��");
				hitPoint -= ;
				break;
			default:
				System.out.println(c + "�͓����������I ��������荞�܂ꂽ�I��");
				break;
			}
			
			if (hitPoint <= 0) break;
		}
		
		//��������
		if(hitPoint <= 0){
			System.out.println("\n������|�����I��\n�P�ʂ���ɓ��ꂽ�I");
			System.out.println("********** GAME CLEAR **********");
		}
		else {
			System.out.println("\n������|���Ȃ������I��\n�P�ʂ���ꂸ���N�����I");
			System.out.println("********** BAD END **********");
		}
	}
}
