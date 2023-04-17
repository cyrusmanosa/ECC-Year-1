import java.util.Scanner;

public class Kad06_Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("3で割った余りを計算します！");
		
		int num;
		do {
			System.out.print("正の整数を入力してください＞");
			num = sc.nextInt();
		} while(num < 0);
		
		switch(num % 3) {
		case 0:
			System.out.println("割り切れました！");
			break;
		case 1:
			System.out.println("余りは1です！");
			break;
		case 2:
			System.out.println("余りは2です！");
			break;
		}
	}
}
