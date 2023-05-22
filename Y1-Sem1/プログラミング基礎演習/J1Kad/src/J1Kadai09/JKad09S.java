import java.util.Scanner;
class JKad09S{
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
		int s = a ;
		
		
		//1
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
		
		//2
		if (max > s && max != s && s < a){
			s = a;
		}
		if(max > s && max != s && s < b){
			s = b;
		}
		
		if (max > s && max != s && s < c){
			s = c;
		}
		
		if (max > s && max != s && s < d){
			s = d;
		}
		
		if (max > s && max != s && s < e){
			s = e;
		}
			
		System.out.println("二番目に高い点数" + s + "点です！");
	}
}