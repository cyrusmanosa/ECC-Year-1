
// ��5����{�����悤�Ȑ퓬�v���O������
// enum�Ɣz������p���ăL�����l�������s���܂��傤�I

// Scanner��import��
import java.util.Scanner;


class Sample12_3a{
	
	// enum�ŃL�������`
	enum Party{�E��,���@�g��, ������}
	
	public static void main(String args[]){
		/** �錾 **/
		final int[] POWER = {100,20,120};// �L�����N�^�[���̒ʏ�U���_���[�W
		final int[] MAGIC = {80,100,10};// �L�����N�^�[���̖��@�U���_���[�W
		
		int enmHP = 200;	// �G��HP
		int inAction;		// �s�����͗p
		int charId = 0;		// �ǂ̃L�����N�^�[�̑I�����̓Y���� 0:�E�� 1:���@�g�� 2:������
		Scanner sc = new Scanner(System.in);	// ���͗p
		
		
		/** ���s���� **/
		// �S�L�������J��Ԃ�
		for(Party charcter: Party.values()){
			
			// �����\��
			System.out.println("�G��HP��" + enmHP + "�ł�");
			System.out.print(charcter +"�̍s�� 1:�U�� / 2:���@ / 3:���������� >");
			
			// �s������
			inAction = sc.nextInt();	// �L�[�{�[�h�ɓ��͂��ꂽ�l��int�^�Ŏ󂯎��
			
			// ���͂��ꂽ�l�ōU����ʂ𕪊�
			switch(inAction){
				// 1�����͂��ꂽ�ꍇ
				case 1:
					// �L�������ƒʏ�U���̃_���[�W�̕\��
					System.out.println(charcter + "�̒ʏ�U���I " + POWER[charId] + "�_���[�W�I��");
					// HP��ʏ�U�������炷����
					enmHP -= POWER[charId];
					// ���򂩂甲����
					break;
				
				// 2�����͂��ꂽ�ꍇ
				case 2:
					// �L�������Ɩ��@�U���̃_���[�W�̕\��
					System.out.println(charcter + "�̖��@�U���I" + MAGIC[charId] + "�_���[�W�I��");
					// HP�𖂖@�U�������炷����
					enmHP -= MAGIC[charId];
					// ���򂩂甲����
					break;
				
				// ����ȊO
				default:
				System.out.println(charcter + ":����ɂ��́I");
				System.out.println(charcter + "�͒p���������Ȃ�������������....");
			}
			
			// �U���z��̓Y�����ׂ̈Ɏ��̃L�����փL����ID��+1�i�܂���
			charId++;
		}
		// ����	
		System.out.println("�ŏI�̓G��HP��" + enmHP);
	}
}