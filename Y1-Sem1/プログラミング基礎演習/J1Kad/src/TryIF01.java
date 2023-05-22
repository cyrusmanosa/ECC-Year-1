import java.util.Scanner;

public class TryIF01{
	public static void main(String[] args){
		//変数定義
		int inNum01;	//入力値1
		int inNum02;	//入力値2
		int maxNum;		//最大値
		
		Scanner in = new Scanner(System.in);
		
		//一つ目の数字を入力してもらうよう表示
		System.out.print("ひとつめの整数を入力してください＞");
		//入力値を変数1に代入
		inNum01 = in.nextInt();
		//二つ目の数字を入力してもらうよう表示
		System.out.print("ふたつめの整数を入力してください＞");
		//入力値を変数2に代入
		inNum02 = in.nextInt();
		//暫定最大値を変数1として代入
		maxNum = inNum01;
		//もし最大値より変数２が大きければ
		if(maxNum < inNum02){
		//最大値の変数に変数2を代入
		maxNum = inNum02;
		//最大値の変数を表示
		System.out.print("ふたつの数字で大きい方は" + maxNum + "です！");
		}
	}
}