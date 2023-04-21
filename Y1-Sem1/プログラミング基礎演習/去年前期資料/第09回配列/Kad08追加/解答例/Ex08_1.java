import java.util.Random;

public class Ex08_1 {
	public static void main(String[] args) {
		Random rand = new Random();
		
		int[] numbers = new int[10];
		
		// ’l‚Ìİ’è
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(100);
		}
		
		// •\¦
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(" " + numbers[i]);
		}
		System.out.println();
		
		// ˆê”Ô‘å‚«‚¢”š‚ğ’T‚·
		int max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (max < numbers[i] ) {
				max = numbers[i];
			}
		}
		System.out.println("ˆê”Ô‘å‚«‚¢”š‚Í" + max + "‚Å‚·I");
	}
}
