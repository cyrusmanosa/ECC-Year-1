import java.util.*;

class TryElseIf01{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("点数を入力してください");
		int inScore = in.nextInt();
		
		// ここから条件分岐
		if(inScore <= 30){
			System.out.println("もっと真面目に");
		}
		if(inScore > 30){
			System.out.println("もっと頑張ろう");
		}
		if(inScore > 50){
			System.out.println("半分以上は取れてます");
		}
		if(inScore > 70){
			System.out.println("ある程度理解出来ています");
		}
		if(inScore > 80){
			System.out.println("よく理解しています");
		}
		if(inScore > 90){
			System.out.println("もっと素晴らしい");
		}
		
		
	}
}