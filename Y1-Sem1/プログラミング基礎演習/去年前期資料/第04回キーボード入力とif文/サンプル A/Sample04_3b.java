import java.util.Scanner;
class Sample04_3b{
	public static void main(String[] args){
		int inNum1,inNum2,inNum3;
		System.out.println("�N���q���h�g���񂾁I");
		Scanner sc = new Scanner(System.in);
		System.out.print("�E�҂̍s�� 1:���� / 2:�q���h / 3:�~�i�f�B�� >");
		inNum1 = sc.nextInt();
		System.out.print("���@�g���̍s�� 1:���� / 2:�q���h / 3:�~�i�f�B�� >");
		inNum2 = sc.nextInt();
		System.out.print("���@���m�̍s�� 1:���� / 2:�q���h / 3:�~�i�f�B�� >");
		inNum3 = sc.nextInt();
		
		/*
			�u�E�҂�2����́v 
			�܂���  �u���@�g����2����́v
			�܂��́u���@���m��2����́v
			�̎��̂ݑ�_���[�W��^����v���O�����ƂȂ�悤
			�ǋL���Ă��������I
		*/
		// ��������
		if(inNum1 == 2 || inNum2 == 2 || inNum3 == 2){
			System.out.println("��퐬���F��_���[�W�I�I");
		}else{
			System.out.println("���ʂ�ɓ����Ă��Ȃ����F���_���[�W�I�I");
		}
	}
}
