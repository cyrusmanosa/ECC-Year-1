/*
ATMの入金を行えるプログラムを完成させよ



[実行結果例] aを入力したパターン
ATMを起動します
現在の貯金額:10000円
いくら貯金しますか？
入金額:a
エラー内容:java.util.InputMismatchException
数値を入力してください
現在の貯金額:10000円
ご利用ありがとうございました



[実行結果例] 5000を入力したパターン
ATMを起動します
現在の貯金額:10000円
いくら貯金しますか？
入金額:5000
入金処理完了
現在の貯金額:15000円
ご利用ありがとうございました
*/

// Scannerのimport文
import java.util.Scanner;
// InputMismatchExceptionのimport文
import java.util.InputMismatchException;

class FukuEx05_6{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int savingMoney = 10000;	// 貯金額
		int inMoney;				// 入金用
		
		
		// エラー検知範囲 ここから
			System.out.println("ATMを起動します");
			System.out.println("現在の貯金額:" + savingMoney + "円");
			
			
			System.out.println("いくら貯金しますか？");
			System.out.print("入金額:");
			inMoney = sc.nextInt();
			
			// 貯金額に入金額を加算する
			
			
			System.out.println("入金処理完了");
			
		// エラー検知範囲 ここまで
		
			// 入力エラーを検知した際の処理
			System.out.println("エラー内容:" + e);
			System.out.println("数値を入力してください");
		
		
		System.out.println("現在の貯金額:" + savingMoney + "円");
		System.out.println("ご利用ありがとうございました");
	}
}
