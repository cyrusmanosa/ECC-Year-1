/*
	�ۑ薼�FJKad12A2
	�쐬���F2022/05/23
	�쐬�ҁF�c�����Y
*/
import java.util.Scanner;

public class JKad12A2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("�ЂƂ߂̐�������͂��Ă���������");
		int n1 = in.nextInt();
		System.out.print("�ӂ��߂̐�������͂��Ă���������");
		int n2 = in.nextInt();
		
		int mul1 = n1;
		int mul2 = n2;
		
		while(mul1 != mul2) {
			if (mul1 < mul2) {
				mul1 += n1;
			} else {
				mul2 += n2;
			}
		}
		
		System.out.println("�ŏ����{����" + mul1 + "�ł��I");
		in.close();
	}
}
