/*
	�G�Ƃ̐퓬�v���O�����ł��B
	1����͂������i�؂�
	2����͂�����g���e
	3����͂����璴�����_�e�a
	����ȊO���ƒʏ�U��
	
	���̍ہA�ڐ���2��I��ł��Ȃ���
	�������U���o���Ȃ�
	
	�ƂȂ�悤�ɒǋL����
	�v���O���������������Ă��������I
*/
import java.util.Scanner;
class Sample05_2a{
	public static void main(String args[]){
		// �錾
		int enmHP = 100;	// �G��HP
		int inAction;		// �s�����͗p
		int inTarget;		// �ڐ��Ώ�
		int pleyerPower = 50; // �v���C���[�̊�b�U����
		Scanner sc = new Scanner(System.in);	// ���͗p
		
		// �����\��
		System.out.println("�G��HP��" + enmHP + "�ł�");
		System.out.print("���Ȃ��̍s�� 1:��i�؂� / 2:�g���e / 3:�������_�e�a >");
		
		// ���͎�t
		inAction = sc.nextInt();	// �L�[�{�[�h�ɓ��͂��ꂽ�l��int�^�Ŏ󂯎��
		
		// �ڐ��I��
		System.out.print("�ڐ��͂ǂ�����H 1:�G�̊������ / 2:�ڂ���� / 3:�ւ����� >");
		
		// ���͎�t
		inTarget = sc.nextInt();	// �L�[�{�[�h�ɓ��͂��ꂽ�l��int�^�Ŏ󂯎��
		
		// �ڐ��I����2��I�񂾏ꍇ
		if(inTarget == 2){
		
			// ��������(switch���Ń`�������W�I)
			switch(inAction){
				case 1:
					System.out.println("��i�؂�U���F" + (int)(pleyerPower * 1.2) + "�̃_���[�W�I");
					enmHP -= pleyerPower * 1.2;
					break;
				
				case 2:
					System.out.println("�g���e�U���F" + (int)(pleyerPower * 1.3) + "�̃_���[�W�I");
					enmHP -= pleyerPower * 1.3;
					break;
				
				case 3:
					System.out.println("�������_�e�a�F" + (int)(pleyerPower * 99) + "�̃_���[�W�I");
					enmHP -= pleyerPower * 99;
					break;
	
				default:
					System.out.println("�ʏ�U���F" + (int)(pleyerPower * 1) + "�̃_���[�W�I");
					enmHP -= pleyerPower * 1;
			}
		}else{
			// �ڐ��I����2�ȊO��I�񂾏ꍇ
			System.out.println("���Ȃ��͐Ή����ē����Ȃ��E�E�E");
		}

		// ����	
		System.out.println("�G��HP��" + enmHP);
	}
}