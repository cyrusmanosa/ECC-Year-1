
/*
	�w������L�����y�[����
	18�`24�΂̔��ʃv���O�������쐬���Ă��������I
	-----------------------------------
	[���s����]18����͂����p�^�[��
	���Ȃ��̔N��:18
	�L�����y�[���Ώۂł��I
	
	
	[���s����]25����͂����p�^�[��
	���Ȃ��̔N��:25
	�\���󂠂�܂��񂪓K�p�O�̔N��ł�
*/

// Scanner��import��


class SouFuku04_2{
	public static void main(String[] args){
		/*******
		* �錾 *
		********/
		// �L�����y�[���ŏ��N��
		final int MIN_AGE =    ;
		// �L�����y�[���ő�N��
		final int MAX_AGE =    ;
		
		// �N����͗p
		int age;
		// Scanner
		Scanner sc = new Scanner(System.in);
		
		/***********
		* ���s���� *
		************/
		System.out.print("���Ȃ��̔N��:");
		// �L�[�{�[�h����N������
		age = sc.nextInt();
		
		// �����͈͓��̔N��̏ꍇ(�ϐ��A�萔�����p)
		
			System.out.println("�L�����y�[���Ώۂł��I");
			
		// ����ȊO(�͈͊O�̔N��̏ꍇ)
		
			System.out.println("�\���󂠂�܂��񂪓K�p�O�̔N��ł�");
		}
	}
}