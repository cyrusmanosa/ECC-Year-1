// Scanner��import��
import java.util.Scanner;

public class Sample13_3a{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int[] tensu = {90, 0, 80};
		
		System.out.println("�z��̒l�͈ȉ��̒ʂ�ł��B");
		// ���݂̔z��̒l��S�ĕ\������ׂ̃��[�v
		for(int i = 0; i < tensu.length; i++){
			System.out.println("tensu[" + i + "] = " + tensu[i]);
		}
		
		System.out.print("\n�ǂ̗v�f�̒l�����o���܂����H��");
		try {
			// �G���[���m�͈� ��������
			int index = Integer.parseInt(sc.next());	// ���͂����l�𕶎��񂩂琔�l�ɕϊ������
			System.out.println(tensu[index] + "�����o���܂����B");// �z��̓��͂����Ԗڂ̒l��\��
			// �G���[���m�͈� �����܂�
		}catch(ArrayIndexOutOfBoundsException e) {
			// �z��̕s���ȎQ�ƃG���[�����m�����ۂ̏���
			System.out.println("�G���[���e:" + e);
			System.out.println("���̗v�f�͑��݂��܂���B");
		}
	}
}
