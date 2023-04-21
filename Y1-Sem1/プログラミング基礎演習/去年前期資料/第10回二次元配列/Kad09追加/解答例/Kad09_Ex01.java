import java.util.Scanner;
import java.util.Random;

public class Kad09_Ex01 {
	public static void main(String[] args) {
		//final int GU = 0;
		//final int CHOKI = 1;
		//final int PA = 2;
		
		final int WIN = 0;
		final int LOSE = 1;
		final int DRAW = 2;
		
		int[][] hantei = {
			{DRAW,  WIN, LOSE},
			{LOSE, DRAW,  WIN},
			{ WIN, LOSE, DRAW},
		};
		
		String[] strHands = {"グー", "チョキ", "パー"};
		String[] strHantei = {"あなたの勝ち！", "あなたの負け！", "引き分け！"};
		
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		
		System.out.println("じゃんけんをします！");
		
		while(true) {
			// 「手」の選択
			System.out.print("あなたは何を出しますか？（0：グー、1：チョキ、2：パー、-1：終了）＞");
			int user = sc.nextInt();
			if (user < 0) break;
			
			int comp = rnd.nextInt(3);
			System.out.println();
			
			// 「手」の表示
			System.out.println("あなたは" + strHands[user] + "を出した！");
			System.out.println("コンピュータは" + strHands[comp] + "を出した！");
			
			// 判定
			System.out.println(strHantei[hantei[user][comp]]);
			System.out.println();
		}
	}
}
