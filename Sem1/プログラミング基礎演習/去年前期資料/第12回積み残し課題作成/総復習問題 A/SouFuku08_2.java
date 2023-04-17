
/*
	配列を活用したCPUとのじゃんけんプログラムを完成しなさい
	5回手の値(0,1,2)を入力し
	それぞれ該当する手を表示しなさい
	CPUの手は配列のプログラムで固定している手を表示しなさい
	
	[実行結果]
	5回じゃんけんをします！
	じゃんけん、、、
	0:グー 1:チョキ 2:パー:2
	あなた:パー
	cpu:グー
	
	じゃんけん、、、
	0:グー 1:チョキ 2:パー:1
	あなた:チョキ
	cpu:パー
	
	じゃんけん、、、
	0:グー 1:チョキ 2:パー:0
	あなた:グー
	cpu:グー
	
	じゃんけん、、、
	0:グー 1:チョキ 2:パー:1
	あなた:チョキ
	cpu:チョキ
	
	じゃんけん、、、
	0:グー 1:チョキ 2:パー:1
	あなた:チョキ
	cpu:チョキ


*/

// Scannerのimport文
import java.util.Scanner;

class SouFuku08_2{
	public static void main(String[] args){
		/*******
		* 宣言 *
		********/
		
		// じゃんけんの手の配列
		final String hand[] = {"グー","チョキ","パー"};
		// Scanner
		Scanner sc = new Scanner(System.in);
		// 出す手の入力用
		int inNum;
		
		// CPUがどの手を出すか格納した配列(初回はグー,次はパー、その次はグー、その次はチョキ、その次はチョキ)
		int cpuAi[] = {0,2,0,1,1};
		
		
		/***********
		* 実行処理 *
		************/
		System.out.println("5回じゃんけんをします！");
		
		// cpuAi配列の要素分繰り返す
		for(int i=0; i<cpuAi.length; i++){
			System.out.println("じゃんけん、、、");
			System.out.print("0:グー 1:チョキ 2:パー:");
			inNum = sc.nextInt();
			
			// 選んだ手を表示
			System.out.println("あなた:" + hand[inNum]);
			// 決められたCPUの手を表示
			System.out.println("cpu:" + hand[ cpuAi[i] ]);
			// 見やすいように改行
			System.out.println();
		}
	}
}