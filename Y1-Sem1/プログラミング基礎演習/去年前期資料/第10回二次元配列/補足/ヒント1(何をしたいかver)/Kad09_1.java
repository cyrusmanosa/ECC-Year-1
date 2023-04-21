/* 
	課題名:Kad
	クラス:
	作成者:
	作成日:
*/

// Scannerのインポート


public class Kad09_1{
	public static void main(String[] args){
		/** 宣言 **/
		// Scanner
		
		// 乗車賃表
		
		// 乗車位置
		
		// 降車位置
		
		
		
		/** 実行処理 **/
		
		// 入力指示を表示
		System.out.print("乗車停留所(1~4)＞");
		// 乗車位置入力

		// 入力指示を表示
		System.out.print("降車停留所(1~4)＞");
		// 降車位置入力
		
		
		//もし乗車駅と降車駅が同じ場合

			// エラー文を表示
			System.out.println("同じ停留所です。");
			
		//それ以外でもし1~4以外の数値を入力した場合

			// エラー文を表示
			System.out.println("1~4の数値を入力してください。");
			
		
		// それ以外(正常入力の場合)
			//運賃を表示
			System.out.println(       + "から" +       + "までの乗車賃は" +       + "円です。");
		
	}
}
