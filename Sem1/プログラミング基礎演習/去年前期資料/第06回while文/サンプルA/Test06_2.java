import java.util.Scanner;
class Test06_2{
	public static void main(String[] args){
		// �錾��
		Scanner sc = new Scanner(System.in);
		int inNum;		// ���͗p
		int count = 0;	//�J�E���g�p
		
		// ��딻��J��Ԃ�����
		do{
			count++;	// �J�E���g��1�i�߂�
			System.out.println("�U��" + count + "���!");
			System.out.print("�����čU�����܂����H YES:1 / NO:0 = ");
			inNum = sc.nextInt();	// ���l����
		}while(inNum == 1);
		System.out.println("�U���I��");
	}
}
