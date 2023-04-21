import java.util.Scanner;

public class Kad12_Ex03{
	
	enum Character {
		�E��(100, 70),
		����(80, 50),
		���@�g��(20, 120),
		�m��(40, 80);
		
		public int power;
		public int magic;
		
		private Character(int power, int magic) {
			this.power = power;
			this.magic = magic;
		}
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
				System.out.println(c + "�̒ʏ�U���I " + c.power + "�_���[�W�I��");
				hitPoint -= c.power;
				break;
			case 2:
				System.out.println(c + "�̖��@�U���I" + c.magic + "�_���[�W�I��");
				hitPoint -= c.magic;
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
