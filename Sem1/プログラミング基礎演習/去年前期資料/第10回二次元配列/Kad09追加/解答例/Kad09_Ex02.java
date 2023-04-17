import java.util.Scanner;
import java.util.Random;

public class Kad09_Ex02 {
	public static void main(String[] args) {
		final int WIN = 0;
		final int LOSE = 1;
		final int DRAW = 2;
		
		int[][] hantei = {
			{DRAW,  WIN, LOSE, LOSE,  WIN},
			{LOSE, DRAW,  WIN, LOSE,  WIN},
			{ WIN, LOSE, DRAW, LOSE,  WIN},
			{ WIN,  WIN,  WIN, DRAW, LOSE},
			{LOSE, LOSE, LOSE,  WIN, DRAW},
		};
		
		String[] strHands = {"騎兵", "弓兵", "槍兵", "大将", "スパイ"};
		String[] strHantei = {"あなたの勝ち！", "あなたの負け！", "引き分け！"};
		
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		
		System.out.println("じゃんけんをします！");
		
		while(true) {
			System.out.print("あなたは何を選びますか？（");
			for (int i = 0; i < strHands.length; i++) {
				System.out.print(i + "：" + strHands[i] + "、");
			}
			System.out.print("-1：終了）＞");
			int user = sc.nextInt();
			if (user < 0 ) break;
			
			int comp = rnd.nextInt(strHands.length);
			System.out.println();
			
			System.out.println("あなたは" + strHands[user] + "を選んだ！");
			System.out.println("コンピュータは" + strHands[comp] + "を選んだ！");
			System.out.println(strHantei[hantei[user][comp]]);
			System.out.println();
		}
	}
}
