/*
�����S����l�ЂƂ��H�ׂ鏈������������Ă���B
�����S��H�ׂ邱�Ƃ��ł��邩�ǂ������肷��if����while���ɕύX���A
���삪�ǂ��ω�����̂��m�F����B

�iBefore�j
�����S�̐�����͂��Ă���������10
�H�ׂ�l�̐�����͂��Ă���������3
��l�ЂƂ������S��H�ׂ��I
�]���������S��7�ł��I

�iAfter�j
�����S�̐�����͂��Ă���������10
�H�ׂ�l�̐�����͂��Ă���������3
��l�ЂƂ������S��H�ׂ��I
��l�ЂƂ������S��H�ׂ��I
��l�ЂƂ������S��H�ׂ��I
�]���������S��1�ł��I


*/

// Scanner���g�p�\�ɂ���ׂ̃C���|�[�g��
import java.util.Scanner;

public class Test06_1b {
	public static void main(String[] args) {
		// �錾��
		Scanner sc = new Scanner(System.in);
		int apple;	// �����S�̐�
		int eater;	// �H�ׂ�l�̐�
		
		// ���͎w���̕�����\��
		System.out.print("�����S�̐�����͂��Ă���������");
		// ����(���l)
		apple = sc.nextInt();
		
		// ���͎w���̕�����\��
		System.out.print("�H�ׂ�l�̐�����͂��Ă���������");
		// ����(���l)
		eater = sc.nextInt();
		
		
		/* [�����S�̐�]��[�H�ׂ�l]���������ԌJ��Ԃ������ɕύX���悤�I */
		while (apple >= eater) {
			// ������\��
			System.out.println("��l�ЂƂ������S��H�ׂ��I");
			// �����S�̐���H�ׂ��l�����炷
			apple -= eater;
		}
		// �����S�̐���\��
		System.out.println("�]���������S��" + apple + "�ł��I");
	}
}
