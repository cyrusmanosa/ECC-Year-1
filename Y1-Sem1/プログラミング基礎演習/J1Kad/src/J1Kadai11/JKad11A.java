package J1Kadai11;

import java.util.Scanner;

class JKad11A{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("�������I�������֍s�����I�I");
		System.out.print("���l�ōs���܂����H��");
		int p = in.nextInt();
		System.out.print("���Ȃ��̔N�����͂��Ă���������");
		int a = in.nextInt();
		
		if (p < 30){
			if (a < 6){
				System.out.println("�����ł��I");
			}else if (a >= 15){
				System.out.println("��l�����F500 �~�ɂȂ�܂��I");
			}else{
				System.out.println("�q�������F200 �~�ɂȂ�܂��I");
			}
		}
			
		if (p >= 30 && p < 50){
			if (a < 6){
				System.out.println("�����ł��I");
			}else if (a >= 15){
				System.out.println("��l�����F450 �~�ɂȂ�܂��I");
			}else{
				System.out.println("�q�������F180 �~�ɂȂ�܂��I");
			}
		}
			
		if (p >= 50){
			if (a < 6){
				System.out.println("�����ł��I");
			}else if (a >= 15){
				System.out.println("��l�����F400 �~�ɂȂ�܂��I");
			}else{
				System.out.println("�q�������F160 �~�ɂȂ�܂��I");
			}
		}
	}
}