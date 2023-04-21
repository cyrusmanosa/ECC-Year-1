import java.util.Random;

public class Ex08_2 {
	public static void main(String[] args) {
		Random rand = new Random();
		
		int[] numbers = new int[10];
		
		// 値の設定
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(100);
		}
		
		// 表示
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(" " + numbers[i]);
		}
		System.out.println();
		
		// 一番大きい数字を最後尾へ
		System.out.println("一番大きい数字を最後尾にします！");
		for (int i = 0; i < numbers.length - 1; i++) {
			if (numbers[i] > numbers[i+1] ) {
				int tmp = numbers[i];
				numbers[i] = numbers[i+1];
				numbers[i+1] = tmp;
			}
		}
		// 表示
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(" " + numbers[i]);
		}
		System.out.println();
	}
}
