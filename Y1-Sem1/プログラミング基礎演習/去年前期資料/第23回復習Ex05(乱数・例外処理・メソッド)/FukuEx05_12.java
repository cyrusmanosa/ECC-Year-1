/*
	��������(�^����͎��R)�A�߂�l����(�^�͎��R)�̃��\�b�h���D���Ɏ�����
	main���\�b�h�Ŏ��삵�����\�b�h�����p����v���O�������쐬���Ȃ���
*/

import java.util.Random;

class FukuEx05_12{
	 
	/*	
		���\�b�h(��������A�߂�l����)
		���� :
		�߂�l :
	 */
	public static int doubleChance(int money){
		Random rnd = new Random();
		return money * rnd.nextInt(3);
	}
	
	/* ���C�����\�b�h */
	public static void main(String args[]){
		int money = 1000;
		
		System.out.println("����"   + doubleChance(money)  +"�~�ɂȂ�܂���");
	}
}
