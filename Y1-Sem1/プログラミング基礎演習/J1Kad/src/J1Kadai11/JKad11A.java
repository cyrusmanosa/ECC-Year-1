import java.util.Scanner;

class JKad11A{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("そうだ！動物園へ行こう！！");
		System.out.print("何人で行きますか？＞");
		int p = in.nextInt();
		System.out.print("あなたの年齢を入力してください＞");
		int a = in.nextInt();
		
		if (p < 30){
			if (a < 6){
				System.out.println("無料です！");
			}else if (a >= 15){
				System.out.println("大人料金：500 円になります！");
			}else{
				System.out.println("子供料金：200 円になります！");
			}
		}
			
		if (p >= 30 && p < 50){
			if (a < 6){
				System.out.println("無料です！");
			}else if (a >= 15){
				System.out.println("大人料金：450 円になります！");
			}else{
				System.out.println("子供料金：180 円になります！");
			}
		}
			
		if (p >= 50){
			if (a < 6){
				System.out.println("無料です！");
			}else if (a >= 15){
				System.out.println("大人料金：400 円になります！");
			}else{
				System.out.println("子供料金：160 円になります！");
			}
		}
	}
}