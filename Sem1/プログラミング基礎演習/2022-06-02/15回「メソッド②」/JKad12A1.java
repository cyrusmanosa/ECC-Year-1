/*
	�ۑ薼�FJKad12A1
	�쐬���F2022/05/23
	�쐬�ҁF�c�����Y
*/
import java.util.Scanner;

public class JKad12A1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("�ЂƂ߂̐�������͂��Ă���������");
		int n1 = in.nextInt();
		System.out.print("�ӂ��߂̐�������͂��Ă���������");
		int n2 = in.nextInt();
		
		while(n1 != n2) {
			if (n1 > n2) {
				n1 -= n2;
			} else {
				n2 -= n1;
			}
		}
		
		System.out.println("�ő���񐔂�" + n1 + "�ł��I");
		in.close();
	}
}
