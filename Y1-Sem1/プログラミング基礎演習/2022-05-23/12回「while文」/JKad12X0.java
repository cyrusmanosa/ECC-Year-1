/*
	�ۑ薼�FJKad12X0
	�쐬���F2022/05/23
	�쐬�ҁF�c�����Y
*/
import java.util.Scanner;

public class JKad12X0 {
	// �����Z
	public static int add(int n1, int n2) {
		int ans = n1 + n2;
		return ans;
	}
	// main���\�b�h
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("�ЂƂ߂̐�������͂��Ă���������");
		int n1 = in.nextInt();
		System.out.print("�ӂ��߂̐�������͂��Ă���������");
		int n2 = in.nextInt();
		
		System.out.println("�ӂ��̐��𑫂���" + add(n1, n2) + "�ł��I");
		
		in.close();
	}
}
