import java.util.Scanner;

public class Kad08_2A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����10�i������2�i���ɕϊ����܂��I");
		System.out.print("10�i������");
		int decimal = sc.nextInt();
		
		int[] bit = new int[256];
		int i = 0;
		/*
		while(decimal != 0) {
			bit[i] = decimal % 2;
			decimal /= 2;
			i++;
		}
		
		System.out.print("2�i���F");
		while(i != 0) {
			i--;
			System.out.print(bit[i]);
		}
		System.out.println();
		*/
		
		do {
			bit[i] = decimal % 2;
			decimal /= 2;
			i++;
		} while(decimal > 0);
		
		System.out.print("2�i���F");
		do {
			i--;
			System.out.print(bit[i]);
		} while(i > 0);
		System.out.println();

	}
}
