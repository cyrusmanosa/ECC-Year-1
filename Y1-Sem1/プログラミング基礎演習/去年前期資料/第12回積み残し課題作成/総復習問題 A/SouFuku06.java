
/*
	0�����͂����܂ŌJ��Ԃ�PG
	���͂����l���ƍ��v�l��\������v���O�������쐬���Ȃ���
	(�l����100�l�ȏ���͂��Ă����Ȃ��悤�ɂ��邱��)
	
	[���s���ʗ�]
	�_�������:40
	�_�������:30
	�_�������:55
	�_�������:33
	�_�������:0
	4�l�̍��v��158
*/

// Scanner��import��
import java.util.Scanner;

class SouFuku06{
	public static void main(String[] args){
		/*******
		* �錾 *
		********/
		// ���͐l���̃J�E���g�p
		int count = 0;
		// Scanner
		Scanner sc = new Scanner(System.in);
		// �_�����͗p
		int inNum;
		// �_���̍��v�l�p
		int total = 0;
		
		/***********
		* ���s���� *
		************/
		
		// �������[�v
		while(true){
			System.out.print("�_�������:");
			inNum = sc.nextInt();
			
			// ����0�����͂��ꂽ��
			if(inNum == 0){
				// ���[�v���甲����
				break;
			}
			// ���v�l�ɓ��͒l�����Z����
			total += inNum;
			// ���͐l���̃J�E���g��1�����Z����
			count++;
		}
		// ���͐l���ƍ��v�l��\��
		System.out.println(count + "�l�̍��v��" + total);
	}
}