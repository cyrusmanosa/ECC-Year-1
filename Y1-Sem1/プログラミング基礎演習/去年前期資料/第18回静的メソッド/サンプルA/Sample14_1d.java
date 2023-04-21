import java.util.Scanner;

class Sample14_1d{
	
	// 指定した2つの文字列を3回表示するメソッド
	public static void show(String str1,String str2){
		for(int i=0; i<3; i++){
			System.out.println(str1 + str2);
		}
	}
	
	// メインメソッド
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String inStr1;
		String inStr2;
		
		System.out.print("表示したい文字列を入力 str1:");
		inStr1 = sc.next();
		System.out.print("表示したい文字列を入力 str2:");
		inStr2 = sc.next();
		
		show(inStr1,inStr2);
	}
}
