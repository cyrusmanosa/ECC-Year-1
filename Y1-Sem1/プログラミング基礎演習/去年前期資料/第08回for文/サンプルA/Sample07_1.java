import java.util.Scanner;
class Sample07_1{
	public static void main(String[] args){
		// �錾
		Scanner sc = new Scanner(System.in);
		int inNum;
		System.out.print("�J��Ԃ������񐔂���́F");
		inNum = sc.nextInt();	// �J��Ԃ��񐔂����
		
		// �J��Ԃ�����
		for(int count=1; count<=inNum; count++){
			System.out.println("�U��" + count + "���!");
		}
		System.out.println("�U���I��");
	}
}
