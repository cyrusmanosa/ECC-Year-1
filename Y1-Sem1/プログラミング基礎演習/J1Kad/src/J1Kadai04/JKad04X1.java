package J1Kadai04;

import java.util.Scanner;
class JKad04X1{
	public static void main(String[] args){
		int Num;
		
		Scanner in = new Scanner(System.in);
		System.out.print("0 ����255 �܂ł̐�������͂��Ă���������");
		Num = in.nextInt();
		
		while(Num>0){
			Num/=2;
		
		}
		if(Num == 0){
			
		System.out.print(Num%2);
		
	}
}