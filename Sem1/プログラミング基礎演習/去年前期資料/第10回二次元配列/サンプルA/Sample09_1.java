import java.util.Scanner;

class Sample09_1{
	public static void main(String[] args){
		// 宣言
		Scanner sc = new Scanner(System.in);
		String name[] = {"田中","山田","斎藤"};
		String kyoka[] = {"算数","英語","社会","保健体育"};
		int tensu[][] = {{0,0,0,0},
						 {0,0,0,0},
						 {0,0,0,0}};
		// 3人分入力
		for(int i=0; i<tensu.length; i++){
			System.out.println(name[i]+"さんの点数を入力してください");
			// 4教科分入力
			for(int j=0; j<tensu[i].length; j++){
				System.out.print(kyoka[j] + ":");
				tensu[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		
		
	}
}