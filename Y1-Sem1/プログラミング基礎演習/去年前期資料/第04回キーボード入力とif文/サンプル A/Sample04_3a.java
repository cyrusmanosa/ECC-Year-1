import java.util.Scanner;
class Sample04_3a{
	public static void main(String[] args){
		int inNum1,inNum2,inNum3;
		System.out.println("勇者はメラ、魔法使いはヒャドを使うんだ！");
		Scanner sc = new Scanner(System.in);
		System.out.print("勇者の行動 1:メラ / 2:ヒャド / 3:ミナディン >");
		inNum1 = sc.nextInt();
		System.out.print("魔法使いの行動 1:メラ / 2:ヒャド / 3:ミナディン >");
		inNum2 = sc.nextInt();
		System.out.print("魔法剣士の行動 1:メラ / 2:ヒャド / 3:ミナディン >");
		inNum3 = sc.nextInt();
		
		/*
			「勇者で1を入力」 かつ  「魔法使いで2を入力」の時のみ
			大ダメージを与えるプログラムとなるよう追記してください！
		*/
		// 条件分岐
		if(inNum1 == 1 && inNum2 == 2){
			System.out.println("作戦成功：大ダメージ！！");
		}else{
			System.out.println("誰か作戦通りに動いていないぞ：小ダメージ！！");
		}
	}
}
