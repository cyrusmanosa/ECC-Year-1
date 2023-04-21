import java.util.Random;

public class Kad10_Ex01 {
	public static void main(String[] args) {
		Random rand = new Random();
		
		int[] numbers = new int[10];
		
		// ’l‚Ìİ’è
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(100);
		}
		
		// •\¦
		for (int val : numbers) {
			System.out.print(" " + val);
		}
		System.out.println();
		
		// ˆê”Ô‘å‚«‚¢”š‚ğ’T‚·
		int max = numbers[0];
		for (int val : numbers) {
			if (max < val ) {
				max = val;
			}
		}
		System.out.println("ˆê”Ô‘å‚«‚¢”š‚Í" + max + "‚Å‚·I");
	}
}
