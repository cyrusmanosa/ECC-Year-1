import java.util.Scanner;
class Sample04_3b{
	public static void main(String[] args){
		int inNum1,inNum2,inNum3;
		System.out.println("誰かヒャド使うんだ！");
		Scanner sc = new Scanner(System.in);
		System.out.print("勇者の行動 1:メラ / 2:ヒャド / 3:ミナディン >");
		inNum1 = sc.nextInt();
		System.out.print("魔法使いの行動 1:メラ / 2:ヒャド / 3:ミナディン >");
		inNum2 = sc.nextInt();
		System.out.print("魔法剣士の行動 1:メラ / 2:ヒャド / 3:ミナディン >");
		inNum3 = sc.nextInt();
		
		/*
			「勇者で2を入力」 
			または  「魔法使いで2を入力」
			または「魔法剣士で2を入力」
			の時のみ大ダメージを与えるプログラムとなるよう
			追記してください！
		*/
		// 条件分岐
		if(inNum1 == 2 || inNum2 == 2 || inNum3 == 2){
			System.out.println("作戦成功：大ダメージ！！");
		}else{
			System.out.println("作戦通りに動いていないぞ：小ダメージ！！");
		}
	}
}
