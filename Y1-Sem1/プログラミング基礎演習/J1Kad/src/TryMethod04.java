import java.util.*;

class TryMethod04{
	//入力した文字を指定回数表示するメソッド
	public static void show(String msg, int count){
		int i = 0;
		while(i < count){
			System.out.println(msg);
			i++;
		}
	}
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			String inStr; // 表示文字入力用
			System.out.println("表示したい文字を入力");
			inStr = in.next();
			
			int inNum; // 表示したい回数を入力
			System.out.println("表示したい回数を入力");
			inNum = in.nextInt();
			show(inStr,inNum); //show メソッドの呼びだし
	
		}
}