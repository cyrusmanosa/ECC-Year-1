
import java.util.Scanner;

class MondaiInc{
	
	public void startTest(){
		Scanner sc = new Scanner(System.in);
		String[][] mtext = {
			{"��1:num��+1����C���N�������g�͂ǂ�H","1:num + 1�@2:num.inc�@3:num++"},
			{"��2:num��-1����f�N�������g�͂ǂ�H","1:num--�@2:num - 1�@3:num.dec"},
			{"��3:���̃v���O�����̌��ʂ́H\n\tint num = 0;\n\tSystem.out.println(\"num = \" + (num++));","1:num = 0�@2:num = 1�@3:num = 2"},
			{"��4:���̃v���O�����̌��ʂ́H\n\tint num = 10;\n\tSystem.out.println(\"num = \" + (--num));","1:num = 10�@2:num = 9�@3:num = 8"},
			{"��5:���̃v���O�����̌��ʂ́H\n\tint x = 7,y = 6,z = 5;\n\tx = y--;\n\ty = ++z;\n\tz = --x;\n\tSystem.out.println( x + \"\" + y + \"\" + z);","1:765�@2:567�@3:766�@4:565"},
			{"��6:���̃v���O�����̌��ʂ́H\n\tint x = 10,y = 3,total = 0;\n\ttotal += x * y--;\n\ttotal += ++x;\n\tSystem.out.println(\"total = \" + total);","1:40�@2:41�@3:42�@4:43"},
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
				System.out.println("\n�����I�I\n");
				point++;
			}else{
				System.out.println("\n�s�����E�E�E\n");
			}
		}
		System.out.println("\n���Ȃ��̓��_�� " + point + " / " + mtext.length + " �_");
		if(point > 4){
			System.out.println("�ǂ��o���܂����I�I");
		}else if(point > 2){
			System.out.println("�܂��܂��ł��B");
		}else{
			System.out.println("��蒼���E�E�E");
		}
	}
}