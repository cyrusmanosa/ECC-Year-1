import java.util.Scanner;

class JKad09A{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("のび太の点数を入力してください＞");
		int a = in.nextInt();
		System.out.print("しずかちゃんの点数を入力してください＞");
		int b = in.nextInt();
		System.out.print("ジャイアンの点数を入力してください＞");
		int c = in.nextInt();
		System.out.print("スネ夫の点数を入力してください＞");
		int d = in.nextInt();
		System.out.print("出木杉くんの点数を入力してください＞");
		int e = in.nextInt();
		int max = a;
		
		if (max < b){
			max = b;
		}
		if (max < c){
			max = b;
		}
		if (max < d){
			max = d;
		}
		if (max < e){
			max = e;
		}
		System.out.println("一番高い点数は" + max + "点です！");
	}
}