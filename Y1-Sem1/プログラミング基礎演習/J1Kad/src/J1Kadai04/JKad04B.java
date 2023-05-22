import java.util.Scanner;

class JKad04B{
	public static void main(String[]args){
		
		int Num;
		Scanner in = new Scanner(System.in);
		System.out.println("いくつまで足し合わせますか？");
		
		Num = in.nextInt();
		
		int Answer;
		Answer=0;
		for(int i=1;i<=Num;i++){
			Answer+=i;
			}
		System.out.println("1 から" + Num + "まで足し合わせると・・・" + Answer + "になりました！");
		
	}
}