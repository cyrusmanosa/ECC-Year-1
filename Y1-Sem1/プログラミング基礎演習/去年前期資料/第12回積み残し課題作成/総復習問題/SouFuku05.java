
/*
	switch�������p�����͂������̋G�߂�\�����Ȃ���
	�������A[System.out.println�͌��󂠂���̂���]��
	[�ǉ��͋֎~]�Ƃ���B
	
	�t: 3, 4, 5
	��: 6, 7, 8
	�H: 9,10,11
	�~:12, 1, 2
	�G���[:��L�ȊO
	----------------------------------------
	
	[���s����]2����͂����p�^�[��
	��������͂��Ă�������:2
	�~�ł�

	
	[���s����]8����͂����p�^�[��
	��������͂��Ă�������:8
	�Ăł�
	
	[���s����]13����͂����p�^�[��
	��������͂��Ă�������:13
	���̓G���[
	
*/

// Scanner��import��


class SouFuku05{
	public static void main(String[] args){
		/*******
		* �錾 *
		********/
		// ���̓��͗p
		int inMonth;
		// Scanner
		Scanner sc = new Scanner(System.in);
		
		/***********
		* ���s���� *
		************/
		System.out.print("��������͂��Ă�������:");
		// �L�[�{�[�h���猎�����
		inMonth = sc.nextInt();
		
		// ���͂����l�ɂ���ĕ���(switch��)
		
			// 3���`5���̏ꍇ
			
			
			
				System.out.println("�t�ł�");
				
			// 6���`8���̏ꍇ
			
			
			
				System.out.println("�Ăł�");
				
			// 9���`11���̏ꍇ
			
			
			
				System.out.println("�H�ł�");
				
			// 12���`2���̏ꍇ
			
			
			
				System.out.println("�~�ł�");
			
			// ����ȊO(�͈͊O)
			
				System.out.println("���̓G���[");
		}
	}
}