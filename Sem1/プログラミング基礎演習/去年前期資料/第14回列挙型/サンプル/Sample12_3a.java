
// ��5����{�����悤�Ȑ퓬�v���O������
// enum�Ɣz������p���ăL�����l�������s���܂��傤�I

// Scanner��import��
import java.util.Scanner;


class Sample12_3a{
	
	// enum�ŃL�������`
	enum Party{�E��,���@�g��, ������}
	
	public static void main(String args[]){
		/** �錾 **/
									// �L�����N�^�[���̒ʏ�U���_���[�W
									// �L�����N�^�[���̖��@�U���_���[�W
		
							// �G��HP
							// �s�����͗p
							// �ǂ̃L�����N�^�[�̑I�����̓Y���� 0:�E�� 1:���@�g�� 2:������
		Scanner sc = new Scanner(System.in);	// ���͗p
		
		
		/** ���s���� **/
		// �S�L�������J��Ԃ�
		for(){
			
			// �����\��
			System.out.println("�G��HP��" + 		 + "�ł�");
			System.out.print(	 +"�̍s�� 1:�U�� / 2:���@ / 3:���������� >");
			
			// �s������
						// �L�[�{�[�h�ɓ��͂��ꂽ�l��int�^�Ŏ󂯎��
			
			// ���͂��ꂽ�l�ōU����ʂ𕪊�
			switch(	){
				// 1�����͂��ꂽ�ꍇ
				case 1:
					// �L�������ƒʏ�U���̃_���[�W�̕\��
					System.out.println(		 + "�̒ʏ�U���I " + 		 + "�_���[�W�I��");
					// HP��ʏ�U�������炷����
					
					// ���򂩂甲����
					
				
				// 2�����͂��ꂽ�ꍇ
				case 2:
					// �L�������Ɩ��@�U���̃_���[�W�̕\��
					System.out.println(		 + "�̖��@�U���I" + 	 + "�_���[�W�I��");
					// HP�𖂖@�U�������炷����
					
					// ���򂩂甲����
					
				
				// ����ȊO
				default:
				System.out.println( + ":����ɂ��́I");
				System.out.println( + "�͒p���������Ȃ�������������....");
			}
			
			// �U���z��Ŏ��̃L�����֐i�ވדY���Ɏ���+1�i�܂���
			
		}
		// ����	
		System.out.println("�ŏI�̓G��HP��" + );
	}
}