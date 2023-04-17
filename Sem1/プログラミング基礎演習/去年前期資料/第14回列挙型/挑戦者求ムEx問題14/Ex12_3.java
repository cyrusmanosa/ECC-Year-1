/*
enumの応用方法

①enumの改造
enum Character {
    勇者(100, 70), 盗賊(80, 50), 魔法使い(20, 120), 僧侶(40, 80);
	
	
    （※これだけでは要素が足りません
		残りは各自で考えること、「Java enum」でネット検索してもOK）	

}

②プログラムの簡略化
（各自で考えること）

*/


import java.util.Scanner;

public class Kad12_Ex03{
	
	enum Character {

	}
	
	public static void main(String[] args){
		
		int hitPoint = 300;	//魔王の体力
		Scanner sc = new Scanner(System.in);
		
		System.out.println("********** ECC QUEST **********");
		System.out.println("魔王が現れた！▼");
		System.out.println("「単位が欲しくば１ターンで私を倒してみろ！」\n");
		
		for(Character c : Character.values()) {
			//行動入力
			System.out.print(c + "はどうする？[1->通常攻撃 2->魔法攻撃 他->逃げる]＞");
			int action = sc.nextInt();
			
			//行動処理
			switch(action){
			case 1:
				System.out.println(c + "の通常攻撃！ " +      + "ダメージ！▼");
				hitPoint -= ;
				break;
			case 2:
				System.out.println(c + "の魔法攻撃！" +        + "ダメージ！▼");
				hitPoint -= ;
				break;
			default:
				System.out.println(c + "は逃げだした！ しかし回り込まれた！▼");
				break;
			}
			
			if (hitPoint <= 0) break;
		}
		
		//勝利判定
		if(hitPoint <= 0){
			System.out.println("\n魔王を倒した！▼\n単位を手に入れた！");
			System.out.println("********** GAME CLEAR **********");
		}
		else {
			System.out.println("\n魔王を倒せなかった！▼\n単位が取れず留年した！");
			System.out.println("********** BAD END **********");
		}
	}
}
