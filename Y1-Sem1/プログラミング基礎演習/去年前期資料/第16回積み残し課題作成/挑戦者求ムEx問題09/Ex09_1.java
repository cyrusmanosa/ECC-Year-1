/*
	既にじゃんけんの処理が準備されている。
	配列（1次元配列・2次元配列）を使って簡略化せよ。	
	
	ヒント：配列を活用することにより勝敗などの分岐(if/switch)処理が激減します。
			(入力した値が0～2内であるかを判定する1つのif文だけでよくなる)
*/


import java.util.Scanner;
import java.util.Random;

public class Ex09_1 {
	public static void main(String[] args) {
		final int GU = 0;
		final int CHOKI = 1;
		final int PA = 2;
		
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
			System.out.print("あなたは");
			switch(user) {
				case GU:	System.out.println("グーを出した！");
							break;
				case CHOKI:	System.out.println("チョキを出した！");	
							break;
				case PA:	System.out.println("パーを出した！");
							break;
			}
			System.out.print("コンピュータは");
			switch(comp) {
				case GU:	System.out.println("グーを出した！");	
							break;
				case CHOKI:	System.out.println("チョキを出した！");	
							break;
				case PA:	System.out.println("パーを出した！");	
							break;
			}
			
			// 判定
			if (user == comp) {
				System.out.println("引き分け！");
			}
			else if (((user == GU)&&(comp == CHOKI))||((user == CHOKI)&&(comp == PA))||((user == PA)&&(comp == GU))) {
				System.out.println("あなたの勝ち！");
			}
			else {
				System.out.println("あなたの負け！");
			}
			System.out.println();
		}
	}
}
