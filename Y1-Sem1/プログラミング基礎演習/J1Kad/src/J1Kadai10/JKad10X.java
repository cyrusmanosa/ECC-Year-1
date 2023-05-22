import java.util.Scanner;

class JKad10X{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("じゃんけんをします！");
		System.out.print("何の手を出しますか？（0：グー、1：チョキ、2：パー＞");
		int num = in.nextInt();
		String C;
		
		if (num == 0){
			C = "グー";
			System.out.println("あなたは" + C + "を出した！");
		}else if (num == 1){
			C = "チョキ";
			System.out.println("あなたは" + C + "を出した！");
		}else if (num == 2){
			C = "パー";
			System.out.println("あなたは" + C + "を出した！");
		}
		
		String[] janken = {"グー" , "チョキ" , "パー"};
		int i = (int)(Math.random()*3);
		System.out.println("コンピュータは" + janken[i] + "を出した！");
		
		if (num == i){
			System.out.println("あいこだ!");
		}
		else if (num > i  || num == 0 && i == 2){
			System.out.println("あなたの負け！");
		}
		else if (num < i || num == 2 && i == 0){
			System.out.println("あなたの勝ち！");
		}
	}
}