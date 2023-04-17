public class Kad10_2A {
	public static void main(String[] args) {
		int[][] numbers = {
			{11, 12, 13},
			{21, 22, 23},
			{31, 32, 33},
		};
		
		// 通常のfor文
		System.out.println("*** 通常のfor文で表示します！ ***");
		for (int row = 0; row < numbers.length; row++) {
			int[] rows = numbers[row];
			for (int col = 0; col < rows.length; col++) {
				int val = numbers[row][col];
				System.out.print(val + ", ");
			}
			System.out.println();
		}
		
		// 拡張for文
		System.out.println("*** 拡張for文で表示します！ ***");
		for (int[] rows : numbers) {
			for (int val : rows) {
				System.out.print(val + ", ");
			}
			System.out.println();
		}
	}
}
