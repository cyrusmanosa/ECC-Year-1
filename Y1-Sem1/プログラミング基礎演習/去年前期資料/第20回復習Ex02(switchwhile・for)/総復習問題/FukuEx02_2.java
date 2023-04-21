import java.util.Scanner;

class FukuEx02_2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int inNum;
		
		/*** if文を使ったじゃんけんver ***/
		System.out.println("**** if文でプログラム *****");
		System.out.print("手を入力 グー:1  /  チョキ:2  /  パー:3 >");
		inNum = sc.nextInt();
		
		System.out.print("あなたの手は");
		
		if(inNum == 1){
			System.out.println("グー");
		}else if(inNum == 2){
			System.out.println("チョキ");
		}else if(inNum == 3){
			System.out.println("パー");
		}else{
			System.out.println("入力値が不正です");
		}
		
		
		/*** switch文を使ったじゃんけんver ***/
		System.out.println("**** switch文でプログラム *****");
		System.out.print("手を入力 グー:1  /  チョキ:2  /  パー:3 >");
		inNum = sc.nextInt();
		
		System.out.print("あなたの手は");
		
			
			System.out.println("グー");
			
			
			
			System.out.println("チョキ");
			
			
			
			System.out.println("パー");
			
			
			
			System.out.println("入力値が不正です");
		}
	}
}