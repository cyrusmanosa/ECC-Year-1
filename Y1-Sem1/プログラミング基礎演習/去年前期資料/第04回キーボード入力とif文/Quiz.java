import java.util.*;

/**
 * �N�C�Y�̃v���O��������肽���̂ł���
 * �܂��������ł��B
 * �ǂ�����ΐ������s��������
 * �\�����s���邩�l���Ă݂悤�I
 */

class Quiz{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		final String ANSER = "dog";
		
		System.out.println("���I");
		System.out.println("�����p���?");
		System.out.print("���͂��Ă�������(���p):");
		String inStr = sc.next();
		/****************************************
		 * �q���g								*
		 * ������ň�v���邩��r����ꍇ		*
		 * 										*
		 * ������.equals(��r�������l)			*
		 * 										*
		 * ��L�ɂ��Ȃ��ƒ��g�ł͂Ȃ�			*
		 * �����̂��̂Ɣ�r���Ă��܂���I		*
		 * �_���ȗ�)������ == ��r�������l		*
		 ****************************************/

			// �����̏ꍇ
			System.out.println("����!");

			// �s�����̏ꍇ
			System.out.println("�s�����B�B�B");
		}
	}
}