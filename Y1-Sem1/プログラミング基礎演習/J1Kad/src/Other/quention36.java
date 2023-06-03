package Other;

import java.util.Scanner;
class quention36{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("���s�񐔁i���̐��j����͂��Ă���������");
		
		double r;
		int num = in.nextInt();
		
		for(int i=3; i<=10000; i+=2){
		r = 4*(1-(1/1*i));
		
		System.out.print(r);
		}
	}
}