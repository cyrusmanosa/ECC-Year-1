/*
	敵との戦闘プログラムです。
	1を入力したら弐段切り
	2を入力したら波動弾
	3を入力したら超級武神覇斬
	それ以外だと通常攻撃
	
	その際、目線は2を選んでいないと
	動けず攻撃出来ない
	
	となるように追記して
	プログラムを完成させてください！
*/
import java.util.Scanner;
class Sample05_2a{
	public static void main(String args[]){
		// 宣言
		int enmHP = 100;	// 敵のHP
		int inAction;		// 行動入力用
		int inTarget;		// 目線対象
		int pleyerPower = 50; // プレイヤーの基礎攻撃力
		Scanner sc = new Scanner(System.in);	// 入力用
		
		// 初期表示
		System.out.println("敵のHPは" + enmHP + "です");
		System.out.print("あなたの行動 1:弐段切り / 2:波動弾 / 3:超級武神覇斬 >");
		
		// 入力受付
		inAction = sc.nextInt();	// キーボードに入力された値をint型で受け取る
		
		// 目線選択
		System.out.print("目線はどうする？ 1:敵の顔を見る / 2:目を閉じる / 3:蛇を見る >");
		
		// 入力受付
		inTarget = sc.nextInt();	// キーボードに入力された値をint型で受け取る
		
		// 目線選択で2を選んだ場合
		if(inTarget == 2){
		
			// 条件分岐(switch文でチャレンジ！)
			switch(inAction){
				case 1:
					System.out.println("弐段切り攻撃：" + (int)(pleyerPower * 1.2) + "のダメージ！");
					enmHP -= pleyerPower * 1.2;
					break;
				
				case 2:
					System.out.println("波動弾攻撃：" + (int)(pleyerPower * 1.3) + "のダメージ！");
					enmHP -= pleyerPower * 1.3;
					break;
				
				case 3:
					System.out.println("超級武神覇斬：" + (int)(pleyerPower * 99) + "のダメージ！");
					enmHP -= pleyerPower * 99;
					break;
	
				default:
					System.out.println("通常攻撃：" + (int)(pleyerPower * 1) + "のダメージ！");
					enmHP -= pleyerPower * 1;
			}
		}else{
			// 目線選択で2以外を選んだ場合
			System.out.println("あなたは石化して動けない・・・");
		}

		// 結果	
		System.out.println("敵のHPは" + enmHP);
	}
}