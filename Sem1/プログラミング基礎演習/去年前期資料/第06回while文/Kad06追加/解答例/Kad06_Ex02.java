import java.util.Scanner;

public class Kad06_Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("3�Ŋ������]����v�Z���܂��I");
		
		int num;
		do {
			System.out.print("���̐�������͂��Ă���������");
			num = sc.nextInt();
		} while(num < 0);
		
		switch(num % 3) {
		case 0:
			System.out.println("����؂�܂����I");
			break;
		case 1:
			System.out.println("�]���1�ł��I");
			break;
		case 2:
			System.out.println("�]���2�ł��I");
			break;
		}
	}
}
