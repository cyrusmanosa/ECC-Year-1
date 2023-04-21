/*
占いマシーンを作成せよ。

①名前と年齢を入力する
②乱数を使ってラブ運・金運・全体運に0～100までの値を設定する。
（乱数の使い方は「java Randomクラス」で検索すること）

③ラブ運・金運・全体運で一番高い値を調べて表示する。

　ラブ運が一番高いとき「ラブ運が最高ね！」
　金運が一番高いとき「金運がいいみたいね！」
　全体運が一番高いとき「何かいいことがあるかもね！」



（実行結果）
こんにちは！
わたしは占いマシーンよ！
あなたのことを占ってあげるわ！よろしくね！

名前は何ていうの？ecc
年齢はいくつ？18

eccさん、こんにちは！
あなたは18歳なんですね！

eccさんの今日の運勢は
ラブ運：49
金　運：42
全体運：33

ラブ運が最高ね！

*/

import java.util.Scanner;
import java.util.Random;

public class Ex04_2 {
	public static void main(String[] args) {

		
		System.out.println("こんにちは！");
		System.out.println("わたしは占いマシーンよ！");
		System.out.println("あなたのことを占ってあげるわ！よろしくね！");
		System.out.println();
		
		System.out.print("名前は何ていうの？");

		System.out.print("年齢はいくつ？");

		
		System.out.println(name + "さん、こんにちは！");
		System.out.println("あなたは" + age + "歳なんですね！");
		System.out.println();
		

		
		System.out.println("さんの今日の運勢は");
		System.out.println("ラブ運：" );
		System.out.println("金　運：" );
		System.out.println("全体運：" );
		System.out.println();
		

		System.out.println("ラブ運が最高ね！");


		System.out.println("金運がいいみたいね！");


		System.out.println("何かいいことがあるかもね！");

	}
}
