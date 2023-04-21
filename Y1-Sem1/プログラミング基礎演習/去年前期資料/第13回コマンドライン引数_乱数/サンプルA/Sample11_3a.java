/*
	コマンドライン引数として
	実行パラメータに[グー チョキ パー]を設定しておくこと

*/

// Randomのimport文
import java.util.Random;

class Sample11_3a{
	public static void main(String args[]){
		// Random
		Random rnd = new Random();
		
		// 手の出た回数のカウント用
		int handCount[] = new int[3];
		
		for(int i = 1; i <= 10; i++){
			int ransu = rnd.nextInt(args.length);	//0~2の乱数生成
			System.out.println(i + "回目：" + args[ransu]);
			handCount[ransu]++;	//出た手の回数を1増やす
		}
		
		System.out.println("\n*** 結果表示 ***");
		//結果表示
		for(int i = 0; i < handCount.length; i++){
			System.out.println(args[i] + "：" + handCount[i] + "回");
		}
	}
}
