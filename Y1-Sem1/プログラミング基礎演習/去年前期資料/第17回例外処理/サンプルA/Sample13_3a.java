// Scannerのimport文
import java.util.Scanner;

public class Sample13_3a{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int[] tensu = {90, 0, 80};
		
		System.out.println("配列の値は以下の通りです。");
		// 現在の配列の値を全て表示する為のループ
		for(int i = 0; i < tensu.length; i++){
			System.out.println("tensu[" + i + "] = " + tensu[i]);
		}
		
		System.out.print("\nどの要素の値を取り出しますか？＞");
		try {
			// エラー検知範囲 ここから
			int index = Integer.parseInt(sc.next());	// 入力した値を文字列から数値に変換し代入
			System.out.println(tensu[index] + "を取り出しました。");// 配列の入力した番目の値を表示
			// エラー検知範囲 ここまで
		}catch(ArrayIndexOutOfBoundsException e) {
			// 配列の不正な参照エラーを検知した際の処理
			System.out.println("エラー内容:" + e);
			System.out.println("その要素は存在しません。");
		}
	}
}
