
import java.util.Scanner;

class MondaiKiso{
	
	public void startTest(){
		Scanner sc = new Scanner(System.in);
		String[][] mtext = {
			{"問1:javaを保存する時、ファイル名は〇〇と同じにする","1:クラス名　2:変数名　3:メソッド名"},
			{"問2:実行させるプログラムはmainメソッドの〇と〇の間に記述する","1: ( と ) 　2: { と } 　3: \" と \" "},
			{"問3:/* と */ で挟むを複数行コメント化できる。では先頭に // を記述すると？","1: 行末までコメントになる 　2: 以降全てがコメントになる 　3: エラーになる "},
			{"問4:ユーザに入力させるには〇〇クラスを使用する","1: Scan 　2: Input 　3: Scanner "},
			{"問5:int型に入力する際に使用するメソッドは？","1: next() 　2: nextInt() 　3: nextDouble() "},
			{"問6:次の変数型の中で仲間外れはどれ？","1: int 　2: short 　3: long 　4: double "},
			{"問7:int型のビット数＋short型のビット数＋double型のビット数＝〇(バイト)","1: 14 　2: 112 　3: 16 　4: 96 "},
			{"問8:次のプログラムは何をしているでしょうか？\n\tint num = 10;","1: 代入 　2: 初期化 "},
			{"問9:次のプログラムの2行目と3行目の先頭に空白が自動で入っています。\nその空白を何と呼ぶ？\n\nclass Test{\n\tpublic static void main(String[] args){\n\t\tint num = 10;","1: インシデント 　2: インスタンス 　3: イングラム 　4: インデント"},
			{"問10:次のプログラム内の〇〇に入るものは？\n\tdouble num1 = 10.2,num2 = 23.4;\n\tint num3 = (〇〇)(num1 + num2);","1: double 　2: nextInt 　3: int 　4: Scanner"},
			{"問11:問10のnum3をprintlnで表示すると何が表示される？","1: 33.6 　2: エラーになる 　3: 33 "},
			{"問12:次のプログラムの ＝ は何と呼ばれるか？\n\tnum1 = 10;","1: 代入演算子 　2: 比較演算子 　3: 論理演算子 "},
		};
		int[] ans = {1,2,1,3,2,4,1,2,4,3,3,1};
		int point = 0;
		
		for(int i = 0; i < mtext.length; i++){
			for(int j = 0; j < mtext[i].length; j++){
				System.out.println("\n" + mtext[i][j]);
			}
			System.out.print("ans >>> ");
			int uans = sc.nextInt();
			if(uans == ans[i]){
				System.out.println("\n正解！！\n");
				point++;
			}else{
				System.out.println("\n不正解・・・\n");
			}
		}
		System.out.println("\nあなたの得点は " + point + " / " + mtext.length + " 点");
		if(point > 9){
			System.out.println("良く出来ました！！");
		}else if(point > 5){
			System.out.println("まぁまぁです。");
		}else{
			System.out.println("やり直し・・・");
		}
	}
}