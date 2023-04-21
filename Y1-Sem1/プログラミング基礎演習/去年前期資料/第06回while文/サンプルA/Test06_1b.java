/*
リンゴを一人ひとつずつ食べる処理が準備されている。
リンゴを食べることができるかどうか判定するif文をwhile文に変更し、
動作がどう変化するのか確認せよ。

（Before）
リンゴの数を入力してください＞10
食べる人の数を入力してください＞3
一人ひとつずつリンゴを食べた！
余ったリンゴは7個です！

（After）
リンゴの数を入力してください＞10
食べる人の数を入力してください＞3
一人ひとつずつリンゴを食べた！
一人ひとつずつリンゴを食べた！
一人ひとつずつリンゴを食べた！
余ったリンゴは1個です！


*/

// Scannerを使用可能にする為のインポート文
import java.util.Scanner;

public class Test06_1b {
	public static void main(String[] args) {
		// 宣言部
		Scanner sc = new Scanner(System.in);
		int apple;	// リンゴの数
		int eater;	// 食べる人の数
		
		// 入力指示の文字列表示
		System.out.print("リンゴの数を入力してください＞");
		// 入力(数値)
		apple = sc.nextInt();
		
		// 入力指示の文字列表示
		System.out.print("食べる人の数を入力してください＞");
		// 入力(数値)
		eater = sc.nextInt();
		
		
		/* [リンゴの数]が[食べる人]よりも多い間繰り返す処理に変更しよう！ */
		while (apple >= eater) {
			// 文字列表示
			System.out.println("一人ひとつずつリンゴを食べた！");
			// リンゴの数を食べた人分減らす
			apple -= eater;
		}
		// リンゴの数を表示
		System.out.println("余ったリンゴは" + apple + "個です！");
	}
}
