import java.util.Scanner;
class Sample04_3a{
	public static void main(String[] args){
		int inNum1,inNum2,inNum3;
		System.out.println("�E�҂̓����A���@�g���̓q���h���g���񂾁I");
		Scanner sc = new Scanner(System.in);
		System.out.print("�E�҂̍s�� 1:���� / 2:�q���h / 3:�~�i�f�B�� >");
		inNum1 = sc.nextInt();
		System.out.print("���@�g���̍s�� 1:���� / 2:�q���h / 3:�~�i�f�B�� >");
		inNum2 = sc.nextInt();
		System.out.print("���@���m�̍s�� 1:���� / 2:�q���h / 3:�~�i�f�B�� >");
		inNum3 = sc.nextInt();
		
		/*
			�u�E�҂�1����́v ����  �u���@�g����2����́v�̎��̂�
			��_���[�W��^����v���O�����ƂȂ�悤�ǋL���Ă��������I
		*/
		// ��������
		if(inNum1 == 1 && inNum2 == 2){
			System.out.println("��퐬���F��_���[�W�I�I");
		}else{
			System.out.println("�N�����ʂ�ɓ����Ă��Ȃ����F���_���[�W�I�I");
		}
	}
}
