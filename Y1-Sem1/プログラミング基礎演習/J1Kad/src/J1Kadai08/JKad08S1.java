import java.util.Scanner;
class JKad08S1{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("A さんの前を列車が通過します！");
		System.out.print("列車の速度（時速）を入力してください＞");
		double v = in.nextDouble();
		v = (double)((v*1000)/(60*60));
		System.out.print("列車の長さ（メートル）を入力してください＞");
		double s = in.nextDouble();
		double t = (double)(s/v);
		System.out.println(t + "秒かかります！");
	}
}