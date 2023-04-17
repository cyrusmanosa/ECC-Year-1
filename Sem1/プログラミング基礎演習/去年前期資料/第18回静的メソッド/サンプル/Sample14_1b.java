import java.util.Scanner;

class Sample14_1b{
	
	/* Hello!を指定した回数 表示するメソッド */
	
		// 指定された回数分繰り返す
		for(int i=0; i<count; i++){
			System.out.println("Hello!");
		}
	
	
	/* メインメソッド */
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int inNum;	// 回数入力用
		
		System.out.print("表示したい回数を入力:");
		inNum = Integer.parseInt(sc.next());
		
	}
}
