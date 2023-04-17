import java.util.*;

/**
 * スライムとの戦闘を行うゲームプログラム開発です
 * 決められた範囲内で
 * プログラムを追記し
 * 戦闘プログラムを完成させましょう！
 */

class Battle{
	public static void main(String[] args){
		// 宣言部
		Scanner sc = new Scanner(System.in);
		int enmHp = 10;	// 敵のHP
		int myHp = 10;	// 自分のHP
		int ATTACK_POINT = 11;	// あなたの攻撃力
		
		/* コマンド入力 */
		System.out.println("スライムが現れた！");
		System.out.println("あなたはどうする？");
		System.out.println("攻撃:1  / にげる:2");
		System.out.print("入力してください:");
		int inNum = sc.nextInt();	// inNumに選択肢を代入
		
		///////////////////////////////////////////////////////////
		/*** ↓↓  ここから戦闘処理を追記してください    ↓↓  ***/
		
		/* 条件分岐 */
		// 攻撃を選んだ時の処理(もし入力した値が1だったら)
		if(inNum == 1){
			// あなたの攻撃のメッセージを表示
			System.out.println("あなたの攻撃：" + ATTACK_POINT + "のダメージを与えた！");
			
			// 相手のHPから自分の攻撃力分マイナスする
			enmHp -= ATTACK_POINT;
		}else{
		// 攻撃以外を選んだ時の処理(もし入力した値が1でなかったら)
		
			System.out.println("あなたは逃げ出した");
			enmHp = 10;
		
		}
		/*** ↑↑  ここまでに戦闘処理を追記してください   ↑↑ ***/
		///////////////////////////////////////////////////////////
		
		/* 敵のターン */
		if(inNum == 2){
			System.out.println("逃げようとしたが回り込まれた！");
			enmHp = 10;
		}else if(inNum != 1){
			System.out.println("あなたは混乱している！");
			enmHp = 10;
		}
		
		if(enmHp > 0){
			System.out.println("スライムはジゴスパーク3連魔を唱えた");
			System.out.println("あなたは999のダメージ");
			myHp -= 999;
			System.out.println("あなたは999のダメージ");
			myHp -= 999;
			System.out.println("あなたは999のダメージ");
			myHp -= 999;
			
			if(myHp < 0){
				System.out.println("あなたは倒れた");
				System.out.println("GAME OVER");
			}
		}else{
			System.out.println("敵を倒した！");
		}
	}
}