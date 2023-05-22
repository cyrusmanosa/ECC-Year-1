import java.util.Scanner;
class JKad08S3{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("現在の時刻（時）を入力してください（0-23）＞");
		int nh = in.nextInt();
		System.out.print("現在の時刻（分）を入力してください（0-59）＞");
		int nm = in.nextInt();
		System.out.print("授業終了の時刻（時）を入力してください（0-23）＞");
		int ch = in.nextInt();
		System.out.print("授業終了の時刻（分）を入力してください（0-59）＞");
		int cm = in.nextInt();
		int rm = ;
		int rh;
		System.out.print("あと" + rh + "時間" + rm + "分、がんばれ！");
	}
}