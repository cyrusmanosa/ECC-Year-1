import java.util.Scanner;
import java.util.Random;

class Sample14_2c{
	
	/**	
	*	当たっているかのチェックを行うメソッド 
	*	引数 int no : 入力した番号
	*	引数 int ans: 判定する答えの値
	*	戻り値 int 結果を戻す(0:左側  1:右側  2:正解)
	**/



	/* メインメソッド */
	public static void main(String args[]){
		final int MAX = 5;
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		
		int atari = rnd.nextInt(MAX);
		int inNum;	// 入力用
		int result;	// 結果用
		
		while(true){
			try{
				System.out.println("当たりが入っているのは何番目でしょう！");
				System.out.print("何番目か入力(0～" + (MAX-1) + ")：");
				inNum = Integer.parseInt(sc.next());
				
				
				/****  関数化 ここから   **/
				
				if(inNum > atari){
					// 入力した値が答えより右側
					result = 0;
				}else if(inNum < atari) {
					// 入力した値が答えより左側
					result = 1;
				}else{
					// 入力した値が答えと一致
					result = 2;
				}
				
				/****  関数化 ここまで   **/
				
				
				if(result == 0){
						System.out.println("今より左側だよ!");
				}else if(result == 1){
						System.out.println("今より右側だよ!");
				}else if(result == 2){
						System.out.println("正解！");
						break;
				}
			}catch(NumberFormatException e){
				System.out.println("入力値が不正です。");
			}
		}
	}
}
