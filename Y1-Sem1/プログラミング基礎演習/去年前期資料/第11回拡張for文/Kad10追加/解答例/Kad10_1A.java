public class Kad10_1A {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
		
		// �ʏ��for��
		System.out.println("*** �ʏ��for���ŕ\�����܂��I ***");
		for (int i = 0; i < numbers.length; i++) {
			int val = numbers[i];
			System.out.println(val);
		}
		
		// �g��for��
		System.out.println("*** �g��for���ŕ\�����܂��I ***");
		for (int val : numbers) {
			System.out.println(val);
		}
	}
}
