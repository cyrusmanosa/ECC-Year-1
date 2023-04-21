import java.util.Scanner;
class Sample04_3c{
	public static void main(String[] args){
		int inNum1,inNum2,inNum3;
		System.out.println("勇者と魔法剣士は同じ技を使い、魔法使いはメラを使え！");
		Scanner sc = new Scanner(System.in);
		System.out.print("勇者の行動 1:メラ / 2:ヒャド / 3:ミナディン >");
		inNum1 = sc.nextInt();
		System.out.print("魔法使いの行動 1:メラ / 2:ヒャド / 3:ミナディン >");
		inNum2 = sc.nextInt();
		System.out.print("魔法剣士の行動 1:メラ / 2:ヒャド / 3:ミナディン >");
		inNum3 = sc.nextInt();
		
		/*
			「勇者での入力」と「魔法剣士での入力」が同じ時
			かつ「魔法使いでの入力」が1の時に大ダメージを与えるプログラム
			
			「勇者での入力」と「魔法剣士での入力」が同じ時
			または「魔法使いでの入力」が1の時に中ダメージを与えるプログラム
			
			となるよう追記してください！
		*/
		// 条件分岐
		if(inNum1 == inNum3 && inNum2 == 1){
			System.out.println("作戦成功：大ダメージ！！");
		}else if(inNum1 == inNum3 || inNum2 == 1){
			System.out.println("片方だけ作戦通り：中ダメージ！！");
		}else{
			System.out.println("作戦通りに動いていないぞ：小ダメージ！！");
		}
	}
}
