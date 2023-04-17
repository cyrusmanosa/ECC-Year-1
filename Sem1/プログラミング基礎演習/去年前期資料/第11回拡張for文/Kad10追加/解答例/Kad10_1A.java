public class Kad10_1A {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
		
		// 通常のfor文
		System.out.println("*** 通常のfor文で表示します！ ***");
		for (int i = 0; i < numbers.length; i++) {
			int val = numbers[i];
			System.out.println(val);
		}
		
		// 拡張for文
		System.out.println("*** 拡張for文で表示します！ ***");
		for (int val : numbers) {
			System.out.println(val);
		}
	}
}
