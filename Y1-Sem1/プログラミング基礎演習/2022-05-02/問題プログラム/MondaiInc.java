
import java.util.Scanner;

class MondaiInc{
	
	public void startTest(){
		Scanner sc = new Scanner(System.in);
		String[][] mtext = {
			{"問1:numを+1するインクリメントはどれ？","1:num + 1　2:num.inc　3:num++"},
			{"問2:numを-1するデクリメントはどれ？","1:num--　2:num - 1　3:num.dec"},
			{"問3:次のプログラムの結果は？\n\tint num = 0;\n\tSystem.out.println(\"num = \" + (num++));","1:num = 0　2:num = 1　3:num = 2"},
			{"問4:次のプログラムの結果は？\n\tint num = 10;\n\tSystem.out.println(\"num = \" + (--num));","1:num = 10　2:num = 9　3:num = 8"},
			{"問5:次のプログラムの結果は？\n\tint x = 7,y = 6,z = 5;\n\tx = y--;\n\ty = ++z;\n\tz = --x;\n\tSystem.out.println( x + \"\" + y + \"\" + z);","1:765　2:567　3:766　4:565"},
			{"問6:次のプログラムの結果は？\n\tint x = 10,y = 3,total = 0;\n\ttotal += x * y--;\n\ttotal += ++x;\n\tSystem.out.println(\"total = \" + total);","1:40　2:41　3:42　4:43"},
		};
		int[] ans = {3,1,1,2,4,2};
		int point = 0;
		
		for(int i = 0; i < mtext.length; i++){
			for(int j = 0; j < mtext[i].length; j++){
				System.out.println("\n" + mtext[i][j]);
			}
			System.out.print("ans >>> ");
			int uans = sc.nextInt();
			if(uans == ans[i]){
				System.out.println("\n正解！！\n");
				point++;
			}else{
				System.out.println("\n不正解・・・\n");
			}
		}
		System.out.println("\nあなたの得点は " + point + " / " + mtext.length + " 点");
		if(point > 4){
			System.out.println("良く出来ました！！");
		}else if(point > 2){
			System.out.println("まぁまぁです。");
		}else{
			System.out.println("やり直し・・・");
		}
	}
}