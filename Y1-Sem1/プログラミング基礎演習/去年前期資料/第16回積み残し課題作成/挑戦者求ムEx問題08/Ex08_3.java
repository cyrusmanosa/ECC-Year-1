import java.util.Scanner;
import java.util.Random;

public class Ex08_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("すべての桁の数字が異なる数値を作成します！");
		int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		while(true) {
			System.out.print("桁数を入力してください（1～9、0：終了）＞");
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
		
		System.out.println("終了します！");
	}
}
