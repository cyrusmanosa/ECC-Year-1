import java.util.Scanner;
import java.util.Random;

public class Ex08_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("���ׂĂ̌��̐������قȂ鐔�l���쐬���܂��I");
		int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		while(true) {
			System.out.print("��������͂��Ă��������i1�`9�A0�F�I���j��");
			int digits = sc.nextInt();
			if (digits == 0) break;
			if ((digits < 1)||(9 < digits)) continue;
			
			int[] values = new int[digits];
			int rest = 10;
			
			for (int i = 0; i < values.length; i++) {
				int n = rand.nextInt(rest);
				values[i] = numbers[n];
				rest--;
				numbers[n] = numbers[rest];
				numbers[rest] = values[i];
			}
			
			for (int i = 0; i < values.length; i++) {
				System.out.print(values[i]);
			}
			System.out.println();
		}
		
		System.out.println("�I�����܂��I");
	}
}
