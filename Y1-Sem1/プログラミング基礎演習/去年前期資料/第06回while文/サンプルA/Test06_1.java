import java.util.Scanner;
class Test06_1{
	public static void main(String[] args){
		// �錾��
		Scanner sc = new Scanner(System.in);
		int count = 1;	// �J�E���g�p
		int inNum;		// ���͗p
		System.out.print("�J��Ԃ������񐔂���́F");
		inNum = sc.nextInt();	// ���l�����

		// �J��Ԃ�����
		while(count <= inNum){
			System.out.println("�U��" + count + "���!");
			count++;	// �J�E���g��1�i�߂�
		}
	}
}
