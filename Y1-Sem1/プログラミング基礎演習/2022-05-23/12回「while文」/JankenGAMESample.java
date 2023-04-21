import java.util.*;

class JankenGAMESample{
	public static void main(String args[]){
		/* 宣言部 */
		
		// ゲームモード
		final int NOMAL = 0;
		final int HARD = 1;
		int mode = NOMAL;	// nomal:0  / hard:1
		
		// 表示文字
		final String WIN = "あなたの勝ち";
		final String DROW = "あいこ";
		final String LOSE = "あなたの負け";
		final String HANDS[] = {"グー","チョキ","パー"};
		final String RESULTS_MSG[][] = {  {DROW,WIN,LOSE},
									{LOSE,DROW,WIN},
									{WIN,LOSE,DROW}};
		// コイン変動値							
		final int resultCoin[][] = {  {1,2,0},
								{0,1,2},
								{2,0,1} };
		// 手の識別変数
		final int GU = 0;
		final int CHOKI = 1;
		final int PA = 2;
		
		// cpuの手を設定(ハードモード用)
		final int cpuAI[][] = {{PA,GU,CHOKI},{GU,CHOKI,PA},{CHOKI,PA,GU}};
		final int CPU_WIN = 0;
		final int CPU_DROW = 1;
		final int CPU_LOSE = 2;
		
		// コイン初期値
		int myCoin = 10;
		
		// 継続確認用の判定文字列
		final String YES01 = "yes";
		final String YES02 = "y";
		
		// playerとcpuの手の変数定義(-1はエラー確認用)
		int inPlayerHand = -1;
		int cpuHand = -1;
		// 入力用
		Scanner in = new Scanner(System.in);
		
		/* 処理部 */
		System.out.println("じゃんけんゲームを開始します！");
		System.out.println("あなたの持ちコインは" + myCoin + "です");
		
		System.out.print("1枚使ってじゃんけんしますか？ yes/no  >");
		String inPlay = in.next();
		
		// yesを入力している間はじゃんけんGAMEを繰り返す
		while((inPlay.equals(YES01)) || (inPlay.equals(YES02))){
			myCoin--;	// 1枚消費
			// 選択肢の設定
			do{
				System.out.println("それではいきます！じゃんけん・・・");
				System.out.print("グー:0 / チョキ:1 パー:2 >");
				inPlayerHand = in.nextInt();
				if(inPlayerHand < 0 || 2 < inPlayerHand){
					System.out.println("選択肢の数字を選んでね！");
				}				
			}while(inPlayerHand < 0 || 2 < inPlayerHand);
			
			System.out.println("あなたの手は"+HANDS[inPlayerHand]);
			
			// プレイモードにより分岐
			if(mode == HARD){
				// ハードモード(中々勝てない)
				// CPUの手を生成
				cpuHand = (int)(Math.random() * 15);
				System.out.println("cpuの乱数:" + cpuHand);
				switch(cpuHand){
					case 0:
						cpuHand = cpuAI[CPU_LOSE][inPlayerHand];
						break;
					case 1,2,3:
						cpuHand = cpuAI[CPU_DROW][inPlayerHand];
						break;
					default:
						cpuHand = cpuAI[CPU_WIN][inPlayerHand];
				}
				System.out.println("cpuの手は"+HANDS[cpuHand]);
			}else{
				// ノーマルモード(勝率は半分)
				// CPUの手を生成
				cpuHand = (int)(Math.random() * 3);
				System.out.println("cpuの手は"+HANDS[cpuHand]);
			}
			// 結果処理
			System.out.println(RESULTS_MSG[inPlayerHand][cpuHand]);
			myCoin += resultCoin[inPlayerHand][cpuHand];
			
			// 継続確認
			System.out.println("\nあなたの持ちコインは" + myCoin + "です");
			System.out.print("続けてじゃんけんしますか？ yes/no  >");
			inPlay = in.next();
		}
		
		// GAME終了
		System.out.println("バイバーイ！");
	}
}