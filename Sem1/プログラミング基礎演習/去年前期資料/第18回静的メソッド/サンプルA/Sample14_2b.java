import java.util.Scanner;

class Sample14_2b{
	
	/*	2�̈������ƂɈ��ݕ��̖��O��Ԃ����̋@�̃��\�b�h
		���� int�^	money : ����������z
		���� int�^	selectNo : �ǂ̈��ݕ��𔃂���
		�߂�l String�^ ���������ݕ��̖��O
	 */	 
	public static String jihanki(int money,int selectNo){
		String result = "";	// �߂�l�p�̔��������ݕ��̖��O
		
		switch(selectNo){
			// �R�[�� 120�~ 
			case 1:
				if(money >= 120){
					result = "�R�[��";
				}else{
					result = "���z������܂���";
				}
				break;
				
			// �G�i�W�[�h�����N 200�~
			case 2:
				if(money >= 200){
					result = "�G�i�W�[�h�����N";
				}else{
					result = "���z������܂���";
				}
				break;
				
			// �� 100�~
			case 3:
				if(money >= 100){
					result = "��";
				}else{
					result = "���z������܂���";
				}
				break;
			default:
				result = "���i�ԍ���I��ł�������";
		}
		return result;
	}
	
	/* ���C�����\�b�h */
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int inNum1;	// �����R�C����
		int inNum2;	// �������ݕ��̔ԍ�
		String drink; // ���������ݕ��̖��O
		
		System.out.println("1 : �R�[��120�~ /  2 : �G�i�W�[�h�����N200�~  /  3: ��100�~");
		
		System.out.print("����������z�����߂Ă������� ����:");
		inNum1 = Integer.parseInt(sc.next());
		
		System.out.print("�w������W���[�X��I�����Ă�������");
		inNum2 = Integer.parseInt(sc.next());
		
		// ���͂����l�Q�������Ƃ��ă��\�b�h�ɓn���A�󂯎�����l��ϐ�drink�֑��
		drink = jihanki(inNum1,inNum2);
		System.out.println("���������̂�" + drink);
	}
}
