import java.util.Scanner;

public class Kad04_Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ЂƂ߂̐�������͂��Ă���������");	int num1 = sc.nextInt();
		System.out.print("�ӂ��߂̐�������͂��Ă���������");	int num2 = sc.nextInt();
		System.out.print("�݂��߂̐�������͂��Ă���������");	int num3 = sc.nextInt();
		System.out.print("����߂̐�������͂��Ă���������");	int num4 = sc.nextInt();
		
		int max = num1;
		if (max < num2) {
			max = num2;
		}
		if (max < num3) {
			max = num3;
		}
		if (max < num4) {
			max = num4;
		}
		System.out.println("�����΂�傫���l��" + max + "�ł��I");
	}
}
