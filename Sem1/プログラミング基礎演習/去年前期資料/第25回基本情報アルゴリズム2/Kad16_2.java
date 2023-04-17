import java.util.Scanner;

public class Kad16_2{
	
	//力まかせ法(探索成功:0以上, 探索失敗:-1)
	public static 戻り値の型 メソッド名(引数の型 引数名){
		
		int dc = 0;	//(探索対象文字列)の位置
		int sc = 0;	//(検索文字列)の位置
		
		//両位置がそれぞれの文字列の末尾に辿りつくまでループ
		
			//探索対象文字列と検索文字列から抜き出した1文字が一致している場合
			
				//対象文字を次の文字へ
				
				// 検索文字を次の文字へ
				
			//不一致の場合
			
				//探索済み文字列の次の文字へ
				
				//検索文字列の先頭の文字へ初期化
				
			
		
		
		//検索文字列カーソル位置が検索文字数と同じ（完全一致した）場合
		
			// 【探索成功】検索文字があった位置を返す
			
		
		// 【探索失敗】見つからなかった意味の-1を返す
		
	}
	
	public static void main(String[] args){
		
		final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int result; // 結果格納用
		
		System.out.println("データ：" + ALPHABET);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("検索文字列＞");
		String inStr = sc.next();
		
		//力まかせ探索を行い、結果を格納する
		result = 力まかせ法のメソッドを呼ぶ;
		// 結果が-1の場合
		
			// 【探索失敗】
			System.out.println(inStr + "は見つかりませんでした。");
		// それ以外
			
			// 【探索成功】
			System.out.println(inStr + "は" + 結果の変数 + "文字目に見つかりました。");
		
	}
}