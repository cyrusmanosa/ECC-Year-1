import java.util.Scanner;
class Sample04_3d{
	public static void main(String[] args){
		int inNum1,inNum2,inNum3;
		System.out.println("�݂�Ȃœ����Z���o���񂾁I");
		Scanner sc = new Scanner(System.in);
		System.out.print("�E�҂̍s�� 1:���� / 2:�q���h / 3:�~�i�f�B�� >");
		inNum1 = sc.nextInt();
		System.out.print("���@�g���̍s�� 1:���� / 2:�q���h / 3:�~�i�f�B�� >");
		inNum2 = sc.nextInt();
		System.out.print("���@���m�̍s�� 1:���� / 2:�q���h / 3:�~�i�f�B�� >");
		inNum3 = sc.nextInt();
		
		/*
			�u�E�҂̓��́v�Ɓu���@�g���̓��́v�Ɓu���@���m�̓��́v�ƑS����������
			��_���[�W��^����v���O����
			(�q���g�F[A == B == C ]�Ƃ����������͏o���܂���I
			[A == B] �������� [B == C]�̂悤�ȂQ���ׂ鏑���������ł��B
			�����A����2�ȏ�̔�r�����킹������������w�񂾂悤�ȁE�E�E)
			
			�u�E�҂̓��́v���u���@�g���̓��́v���u���@���m�̓��́v��������
			���_���[�W��^����v���O����
			
			�ƂȂ�悤�ǋL���Ă��������I
		*/
		// ��������
		if(inNum1 == inNum2  &&  inNum2 == inNum3){
			System.out.println("�S���s������v�F��_���[�W�I�I");
		}else if(inNum1 == inNum2 || inNum2 == inNum3 || inNum1 == inNum3){
			System.out.println("2�l�̍s������v�F���_���[�W�I�I");
		}else{
			System.out.println("�S���s�����o���o���F���_���[�W�I�I");
		}
	}
}
