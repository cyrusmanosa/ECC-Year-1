/*
	�G�Ƃ̐퓬�v���O�����ł��B
	1����͂������i�؂�
	2����͂�����g���e
	3����͂����璴�����_�e�a
	����ȊO���ƒʏ�U��
	�ƂȂ�悤�ɒǋL����
	�v���O���������������Ă��������I
*/
import java.util.Scanner;
class FukuEx02_3{
	public static void main(String args[]){
		// �錾
		int enmHP = 100;	// �G��HP
		int inAction;		// �s�����͗p
		int pleyerPower = 50; // �v���C���[�̊�b�U����
		Scanner sc = new Scanner(System.in);	// ���͗p
		
		// �����\��
		System.out.println("�G��HP��" + enmHP + "�ł�");
		System.out.print("���Ȃ��̍s�� 1:��i�؂� / 2:�g���e / 3:�������_�e�a >");
		
		// ���͎�t
		inAction = sc.nextInt();	// �L�[�{�[�h�ɓ��͂��ꂽ�l��int�^�Ŏ󂯎��
		
		// ��������(switch���Ń`�������W�I)
		
			
			System.out.println("��i�؂�U���F" + (int)(pleyerPower * 1.2) + "�̃_���[�W�I");
			enmHP -= pleyerPower * 1.2;
			
			
			
			System.out.println("�g���e�U���F" + (int)(pleyerPower * 1.3) + "�̃_���[�W�I");
			enmHP -= pleyerPower * 1.3;
			
			
			
			System.out.println("�������_�e�a�F" + (int)(pleyerPower * 99) + "�̃_���[�W�I");
			enmHP -= pleyerPower * 99;
			
			
			
			System.out.println("�ʏ�U���F" + (int)(pleyerPower * 1) + "�̃_���[�W�I");
			enmHP -= pleyerPower * 1;
		
		// ����	
		System.out.println("�G��HP��" + enmHP);
	}
}