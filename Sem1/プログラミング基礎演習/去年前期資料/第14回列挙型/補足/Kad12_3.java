import java.util.Scanner;

public class Kad12_3{
	
	// enum �L�����N�^�[���`
	enum Character{�E��, ����, ���@�g��, �m��}
	
	public static void main(String[] args){
		
		// �ʏ�U���̔z��([0]�E�� : [1]���� : [2]���@�g�� : [3]�m��)
		final int[] POWER = {100, 80, 20, 40};	//�L�����N�^�[�ʂ̒ʏ�U���_���[�W
		
		// ���@�U���̔z��([0]�E�� : [1]���� : [2]���@�g�� : [3]�m��)
		final int[] MAGIC = {70, 50, 120, 80};	//�L�����N�^�[�ʂ̖��@�U���_���[�W]
		
		// �z��łǂ̃L�����N�^�[���w���Ă��邩�̓Y�����p
		int i = 0;	//�L�����N�^�[�J�E���^�i0->�E�� 1->���� 2->���@�g�� 3->�m���j
		
		//�����̗̑�
		int hitPoint = 300;	
		
		int action; // �s�����͗p
		
		// Scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.println("********** ECC QUEST **********");
		System.out.println("���������ꂽ�I��");
		System.out.println("�u�P�ʂ��~�����΂P�^�[���Ŏ���|���Ă݂�I�v\n");
		
		for() {
			//�s������
			System.out.print(   + "�͂ǂ�����H[1->�ʏ�U�� 2->���@�U�� ��->������]��");
			action = sc.nextInt();
			
			//���͂����s�������ɕ��򏈗�
			switch(){
			// ���͂����l��1�Ȃ�
			case 1:
				// �U�������L�����ƒʏ�U���̃_���[�W��\��
				System.out.println(  + "�̒ʏ�U���I " +          + "�_���[�W�I��");
				// HP����ʏ�_���[�W������
				hitPoint -=         ;
				// switch�����甲����
				break;
			// ���͂����l��2�Ȃ�
			case 2:
				// �U�������L�����Ɩ��@�U���̃_���[�W��\��
				System.out.println(   + "�̖��@�U���I" +          + "�_���[�W�I��");
				// HP���疂�@�_���[�W������
				hitPoint -=         ;
				// switch�����甲����
				break;
			// ���͂����l������ȊO�Ȃ�
			default:
				System.out.println(  + "�͓����������I ��������荞�܂ꂽ�I��");
				// switch�����甲����
				break;
			}
			
			//��������
			// ����HP��0�ȉ��Ȃ�
			if(hitPoint <= 0){
				// for�����甲����
				break;
			}
			//���̃L�����N�^�[�֐i�ނ��߂ɓY�������J�E���g�A�b�v����
			
		}
			
		//��������:
		// ����HP��0�ȉ��Ȃ�
		if(hitPoint <= 0){
			System.out.println("\n������|�����I��\n�P�ʂ���ɓ��ꂽ�I");
			System.out.println("********** GAME CLEAR **********");
		}else{
			System.out.println("\n������|���Ȃ������I��\n�P�ʂ���ꂸ���N�����I");
			System.out.println("********** BAD END **********");
		}
	}
}

