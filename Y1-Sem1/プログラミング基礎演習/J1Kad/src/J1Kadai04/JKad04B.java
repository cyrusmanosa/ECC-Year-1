package J1Kadai04;

import java.util.Scanner;

class JKad04B{
	public static void main(String[]args){
		
		int Num;
		Scanner in = new Scanner(System.in);
		System.out.println("�����܂ő������킹�܂����H");
		
		Num = in.nextInt();
		
		int Answer;
		Answer=0;
		for(int i=1;i<=Num;i++){
			Answer+=i;
			}
		System.out.println("1 ����" + Num + "�܂ő������킹��ƁE�E�E" + Answer + "�ɂȂ�܂����I");
		
	}
}