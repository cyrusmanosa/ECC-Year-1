
// 第5回実施したような戦闘プログラムを
// enumと配列を活用してキャラ人数分実行しましょう！

// Scannerのimport文
import java.util.Scanner;


class Sample12_3a{
	
	// enumでキャラを定義
	enum Party{勇者,魔法使い, 武闘家}
	
	public static void main(String args[]){
		/** 宣言 **/
		final int[] POWER = {100,20,120};// キャラクター毎の通常攻撃ダメージ
		final int[] MAGIC = {80,100,10};// キャラクター毎の魔法攻撃ダメージ
		
		int enmHP = 200;	// 敵のHP
		int inAction;		// 行動入力用
		int charId = 0;		// どのキャラクターの選択かの添え字 0:勇者 1:魔法使い 2:武闘家
		Scanner sc = new Scanner(System.in);	// 入力用
		
		
		/** 実行処理 **/
		// 全キャラ分繰り返す
		for(Party charcter: Party.values()){
			
			// 初期表示
			System.out.println("敵のHPは" + enmHP + "です");
			System.out.print(charcter +"の行動 1:攻撃 / 2:魔法 / 3:あいさつする >");
			
			// 行動入力
			inAction = sc.nextInt();	// キーボードに入力された値をint型で受け取る
			
			// 入力された値で攻撃種別を分岐
			switch(inAction){
				// 1が入力された場合
				case 1:
					// キャラ名と通常攻撃のダメージの表示
					System.out.println(charcter + "の通常攻撃！ " + POWER[charId] + "ダメージ！▼");
					// HPを通常攻撃分減らす処理
					enmHP -= POWER[charId];
					// 分岐から抜ける
					break;
				
				// 2が入力された場合
				case 2:
					// キャラ名と魔法攻撃のダメージの表示
					System.out.println(charcter + "の魔法攻撃！" + MAGIC[charId] + "ダメージ！▼");
					// HPを魔法攻撃分減らす処理
					enmHP -= MAGIC[charId];
					// 分岐から抜ける
					break;
				
				// それ以外
				default:
				System.out.println(charcter + ":こんにちは！");
				System.out.println(charcter + "は恥ずかしくなっただけだった....");
			}
			
			// 攻撃配列の添え字の為に次のキャラへキャラIDを+1進ませる
			charId++;
		}
		// 結果	
		System.out.println("最終の敵のHPは" + enmHP);
	}
}