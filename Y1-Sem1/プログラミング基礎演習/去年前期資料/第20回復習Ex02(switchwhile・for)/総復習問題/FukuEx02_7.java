/*
RPGあるある
意味のない選択肢を選ばせられるプログラムを完成させよ

[実行結果]
王様：勇者よ、魔王を倒してきてはくれんか？
はい:0  /  いいえ:それ以外>1
王様：よく聞こえんかったのう・・・
王様：勇者よ、魔王を倒してきてはくれんか？
はい:0  /  いいえ:それ以外>2
王様：よく聞こえんかったのう・・・
王様：勇者よ、魔王を倒してきてはくれんか？
はい:0  /  いいえ:それ以外>0
王様：よくぞ言った！頼んだぞ

*/


import java.util.Scanner;
class FukuEx02_7{
	public static void main(String[] args){
		// 宣言部
		Scanner sc = new Scanner(System.in);
		int inNum;		// 選択肢入力用
		
		System.out.println("王様：勇者よ、魔王を倒してきてはくれんか？");
		
		System.out.print("はい:0  /  いいえ:それ以外>");
		inNum = sc.nextInt();
		
		// はい以外が選ばれている間繰り返す
		
			System.out.println("王様：よく聞こえんかったのう・・・");
			System.out.println("王様：勇者よ、魔王を倒してきてはくれんか？");
		
			System.out.print("はい:0  /  いいえ:それ以外>");
			inNum = sc.nextInt();
		
		
		System.out.println("王様：よくぞ言った！頼んだぞ");
		
	}
}
