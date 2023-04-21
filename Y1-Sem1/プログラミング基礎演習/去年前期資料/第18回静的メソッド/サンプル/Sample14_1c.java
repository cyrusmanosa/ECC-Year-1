import java.util.Scanner;

class Sample14_1c{
	
	/**	指定した文字を3回表示するメソッド 
	*	引数 String str : 表示する文字列
	**/


	/* メインメソッド */
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String inStr;
		
		System.out.print("表示したい文字を入力:");
		inStr = sc.next();


		/* 入力した文字列を3回表示するという一連の処理を
		   関数化(メソッド)してください */
		// ここから ************************************
		for(int i=0; i<3; i++){
			System.out.println(str);
		}
		// ここまでの処理を関数に切り分けてください **********
		
		
	}
}
