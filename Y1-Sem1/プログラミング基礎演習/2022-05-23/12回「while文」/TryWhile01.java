import java.util.Scanner;
class TryWhile01{
	public static void main(String[] args){
		/* �錾�� */
		Scanner in = new Scanner(System.in);
		int count = 1;	// �J�E���g�p
		int inNum;		// ���͗p
		
		System.out.print("�J��Ԃ������񐔂����>");
		inNum = in.nextInt();
		
		/* �������J��Ԃ������Ŏ��s�o����悤�� */
		while ( count <= inNum ){
		System.out.println("�U��" + count + "���");
		count++;
		}
	}
}

