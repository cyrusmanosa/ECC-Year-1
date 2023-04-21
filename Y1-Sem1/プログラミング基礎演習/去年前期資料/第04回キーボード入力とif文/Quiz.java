import java.util.*;

/**
 * クイズのプログラムを作りたいのですが
 * まだ未完成です。
 * どうすれば正解か不正解かの
 * 表示が行えるか考えてみよう！
 */

class Quiz{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		final String ANSER = "dog";
		
		System.out.println("問題！");
		System.out.println("犬を英語で?");
		System.out.print("入力してください(半角):");
		String inStr = sc.next();
		/****************************************
		 * ヒント								*
		 * 文字列で一致するか比較する場合		*
		 * 										*
		 * 文字列.equals(比較したい値)			*
		 * 										*
		 * 上記にしないと中身ではなく			*
		 * 箱そのものと比較してしまうよ！		*
		 * ダメな例)文字列 == 比較したい値		*
		 ****************************************/

			// 正解の場合
			System.out.println("正解!");

			// 不正解の場合
			System.out.println("不正解。。。");
		}
	}
}