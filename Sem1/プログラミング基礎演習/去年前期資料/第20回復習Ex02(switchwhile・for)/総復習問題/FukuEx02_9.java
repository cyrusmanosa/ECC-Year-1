/*
先程のRPGのプログラムを
whileではなく
do while文やif文を活用し変更して
プログラム内の冗長部分を省略しましょう！


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
class FukuEx02_9{
	public static void main(String[] args){
		// 宣言部
		Scanner sc = new Scanner(System.in);
		int inNum;		// 選択肢入力用
		
		/*** ここから 
		System.out.println("王様：勇者よ、魔王を倒してきてはくれんか？");
		
		System.out.print("はい:0  /  いいえ:それ以外>");
		inNum = sc.nextInt();
		*** ここまでの処理が2回記述されており冗長となっている ***/
		
		// はい以外が選ばれている間繰り返す(do whileで作成すること)
		while(inNum != 0 ){
			System.out.println("王様：よく聞こえんかったのう・・・");
			System.out.println("王様：勇者よ、魔王を倒してきてはくれんか？");
		
			System.out.print("はい:0  /  いいえ:それ以外>");
			inNum = sc.nextInt();
		}
		
		System.out.println("王様：よくぞ言った！頼んだぞ");
		
	}
}
