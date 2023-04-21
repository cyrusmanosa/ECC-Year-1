/*
	未完成のじゃんけんプログラムです。
	exLv.1:自分とCPUの手を表示するプログラムにしましょう！
	exLv.2:勝敗を表示するプログラムにしましょう！
	exLv.3:2回勝つまで繰り返すプログラムにしましょう！

*/
import java.util.*;

class ExKad07_1{
	public static void main(String[] args){
		/* 宣言部 */
		// あなたの手
		int myHand;		// 0:グー / 1:チョキ/ 2:パー
		// CPUの手
		int enmHand;	// 0:グー / 1:チョキ/ 2:パー
		
		/* ゲーム開始文 */
		System.out.println("じゃんけんを行います！");
		System.out.println("出す手を入力してください！:0:グー / 1:チョキ/ 2:パー");
	
		/* 出す手をキーボードで入力 */
		
		
		/* あなたの出す手を表示 */
		// 表示内容を分岐
			System.out.println("あなたの手はグー");
			System.out.println("あなたの手はチョキ");
			System.out.println("あなたの手はパー");
				
		/* コンピュータの手を自動生成 */
		Random rnd = new Random();	// 乱数生成用
		enmHand = rnd.nextInt(3);	// 0～2までの乱数を生成
		
		/* コンピュータの手を表示 */
		// 表示内容を分岐
			System.out.println("CPUの手はグー");
			System.out.println("CPUの手はチョキ");
			System.out.println("CPUの手はパー");
		
		/* 勝敗判定 */
		//表示内容を分岐
			System.out.println("あなたの勝ち");
			System.out.println("あなたの負け");
			System.out.println("あいこ");
	}
}