import java.util.Scanner;
class Sample04_3d{
	public static void main(String[] args){
		int inNum1,inNum2,inNum3;
		System.out.println("みんなで同じ技を出すんだ！");
		Scanner sc = new Scanner(System.in);
		System.out.print("勇者の行動 1:メラ / 2:ヒャド / 3:ミナディン >");
		inNum1 = sc.nextInt();
		System.out.print("魔法使いの行動 1:メラ / 2:ヒャド / 3:ミナディン >");
		inNum2 = sc.nextInt();
		System.out.print("魔法剣士の行動 1:メラ / 2:ヒャド / 3:ミナディン >");
		inNum3 = sc.nextInt();
		
		/*
			「勇者の入力」と「魔法使いの入力」と「魔法剣士の入力」と全員が同じ時
			大ダメージを与えるプログラム
			(ヒント：[A == B == C ]という書き方は出来ません！
			[A == B] もしくは [B == C]のような２つを比べる書き方だけです。
			ただ、その2つ以上の比較を合わせるやり方を今日学んだような・・・)
			
			「勇者の入力」か「魔法使いの入力」か「魔法剣士の入力」が同じ時
			中ダメージを与えるプログラム
			
			となるよう追記してください！
		*/
		// 条件分岐
		if(inNum1 == inNum2  &&  inNum2 == inNum3){
			System.out.println("全員行動が一致：大ダメージ！！");
		}else if(inNum1 == inNum2 || inNum2 == inNum3 || inNum1 == inNum3){
			System.out.println("2人の行動が一致：中ダメージ！！");
		}else{
			System.out.println("全員行動がバラバラ：小ダメージ！！");
		}
	}
}
