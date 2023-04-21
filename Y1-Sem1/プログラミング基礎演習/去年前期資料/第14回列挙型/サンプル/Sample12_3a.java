
// 第5回実施したような戦闘プログラムを
// enumと配列を活用してキャラ人数分実行しましょう！

// Scannerのimport文
import java.util.Scanner;


class Sample12_3a{
	
	// enumでキャラを定義
	enum Party{勇者,魔法使い, 武闘家}
	
	public static void main(String args[]){
		/** 宣言 **/
									// キャラクター毎の通常攻撃ダメージ
									// キャラクター毎の魔法攻撃ダメージ
		
							// 敵のHP
							// 行動入力用
							// どのキャラクターの選択かの添え字 0:勇者 1:魔法使い 2:武闘家
		Scanner sc = new Scanner(System.in);	// 入力用
		
		
		/** 実行処理 **/
		// 全キャラ分繰り返す
		for(){
			
			// 初期表示
			System.out.println("敵のHPは" + 		 + "です");
			System.out.print(	 +"の行動 1:攻撃 / 2:魔法 / 3:あいさつする >");
			
			// 行動入力
						// キーボードに入力された値をint型で受け取る
			
			// 入力された値で攻撃種別を分岐
			switch(	){
				// 1が入力された場合
				case 1:
					// キャラ名と通常攻撃のダメージの表示
					System.out.println(		 + "の通常攻撃！ " + 		 + "ダメージ！▼");
					// HPを通常攻撃分減らす処理
					
					// 分岐から抜ける
					
				
				// 2が入力された場合
				case 2:
					// キャラ名と魔法攻撃のダメージの表示
					System.out.println(		 + "の魔法攻撃！" + 	 + "ダメージ！▼");
					// HPを魔法攻撃分減らす処理
					
					// 分岐から抜ける
					
				
				// それ以外
				default:
				System.out.println( + ":こんにちは！");
				System.out.println( + "は恥ずかしくなっただけだった....");
			}
			
			// 攻撃配列で次のキャラへ進む為添えに字を+1進ませる
			
		}
		// 結果	
		System.out.println("最終の敵のHPは" + );
	}
}