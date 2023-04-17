import java.util.Scanner;

public class Kad06_Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("こんにちは！");
		System.out.println("わたしはレジ打ちマシーンよ！よろしくね！！");
		System.out.println();
		
		int sum = 0;
		while(true) {
			int num;
			do {
				System.out.print("さあ、何を買うの？（1：弁当500円、2：おにぎり150円、3：お茶120円、0：もう買わない）＞");
				num = sc.nextInt();
			} while((num < 0)||(3 < num));
			if (num == 0) break;
			
			switch(num) {
			case 1:
				System.out.println("お弁当は500円です！");
				sum += 500;
				break;
			case 2:
				System.out.println("おにぎりは150円よ！");
				sum += 150;
				break;
			case 3:
				System.out.println("お茶は120円ね！");
				sum += 120;
				break;
			}
			
			System.out.println("現在の合計金額：" + sum + "円");
			System.out.println();
		}
		
		System.out.println();
		System.out.println("消費税込みで" + (int)(sum * 1.08) + "円になります！");
		System.out.println("ありがとうございました！！");
	}
}
