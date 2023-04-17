import java.util.Scanner;

public class Kad12_3{
	
	// enum キャラクターを定義
	enum Character{勇者, 盗賊, 魔法使い, 僧侶}
	
	public static void main(String[] args){
		
		// 通常攻撃の配列([0]勇者 : [1]盗賊 : [2]魔法使い : [3]僧侶)
		final int[] POWER = {100, 80, 20, 40};	//キャラクター別の通常攻撃ダメージ
		
		// 魔法攻撃の配列([0]勇者 : [1]盗賊 : [2]魔法使い : [3]僧侶)
		final int[] MAGIC = {70, 50, 120, 80};	//キャラクター別の魔法攻撃ダメージ]
		
		// 配列でどのキャラクターを指しているかの添え字用
		int i = 0;	//キャラクターカウンタ（0->勇者 1->盗賊 2->魔法使い 3->僧侶）
		
		//魔王の体力
		int hitPoint = 300;	
		
		int action; // 行動入力用
		
		// Scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.println("********** ECC QUEST **********");
		System.out.println("魔王が現れた！▼");
		System.out.println("「単位が欲しくば１ターンで私を倒してみろ！」\n");
		
		for() {
			//行動入力
			System.out.print(   + "はどうする？[1->通常攻撃 2->魔法攻撃 他->逃げる]＞");
			action = sc.nextInt();
			
			//入力した行動を元に分岐処理
			switch(){
			// 入力した値が1なら
			case 1:
				// 攻撃したキャラと通常攻撃のダメージを表示
				System.out.println(  + "の通常攻撃！ " +          + "ダメージ！▼");
				// HPから通常ダメージ分引く
				hitPoint -=         ;
				// switch文から抜ける
				break;
			// 入力した値が2なら
			case 2:
				// 攻撃したキャラと魔法攻撃のダメージを表示
				System.out.println(   + "の魔法攻撃！" +          + "ダメージ！▼");
				// HPから魔法ダメージ分引く
				hitPoint -=         ;
				// switch文から抜ける
				break;
			// 入力した値がそれ以外なら
			default:
				System.out.println(  + "は逃げだした！ しかし回り込まれた！▼");
				// switch文から抜ける
				break;
			}
			
			//勝利判定
			// もしHPが0以下なら
			if(hitPoint <= 0){
				// for文から抜ける
				break;
			}
			//次のキャラクターへ進むために添え字をカウントアップする
			
		}
			
		//勝利判定:
		// もしHPが0以下なら
		if(hitPoint <= 0){
			System.out.println("\n魔王を倒した！▼\n単位を手に入れた！");
			System.out.println("********** GAME CLEAR **********");
		}else{
			System.out.println("\n魔王を倒せなかった！▼\n単位が取れず留年した！");
			System.out.println("********** BAD END **********");
		}
	}
}

