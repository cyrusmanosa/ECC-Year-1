import java.util.Scanner;
class Sample04_3c{
	public static void main(String[] args){
		int inNum1,inNum2,inNum3;
		System.out.println("�E�҂Ɩ��@���m�͓����Z���g���A���@�g���̓������g���I");
		Scanner sc = new Scanner(System.in);
		System.out.print("�E�҂̍s�� 1:���� / 2:�q���h / 3:�~�i�f�B�� >");
		inNum1 = sc.nextInt();
		System.out.print("���@�g���̍s�� 1:���� / 2:�q���h / 3:�~�i�f�B�� >");
		inNum2 = sc.nextInt();
		System.out.print("���@���m�̍s�� 1:���� / 2:�q���h / 3:�~�i�f�B�� >");
		inNum3 = sc.nextInt();
		
		/*
			�u�E�҂ł̓��́v�Ɓu���@���m�ł̓��́v��������
			���u���@�g���ł̓��́v��1�̎��ɑ�_���[�W��^����v���O����
			
			�u�E�҂ł̓��́v�Ɓu���@���m�ł̓��́v��������
			�܂��́u���@�g���ł̓��́v��1�̎��ɒ��_���[�W��^����v���O����
			
			�ƂȂ�悤�ǋL���Ă��������I
		*/
		// ��������
		if(inNum1 == inNum3 && inNum2 == 1){
			System.out.println("��퐬���F��_���[�W�I�I");
		}else if(inNum1 == inNum3 || inNum2 == 1){
			System.out.println("�Е��������ʂ�F���_���[�W�I�I");
		}else{
			System.out.println("���ʂ�ɓ����Ă��Ȃ����F���_���[�W�I�I");
		}
	}
}
