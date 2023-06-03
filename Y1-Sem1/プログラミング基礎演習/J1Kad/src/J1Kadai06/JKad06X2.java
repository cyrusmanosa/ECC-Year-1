package J1Kadai06;

import java.util.Scanner;

class JKad06X2{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("�����e�J�����E�V�~�����[�V�����ŉ~���������߂܂��I");
		System.out.print("����V�~�����[�V�������܂����H��");
		
            int i,imax;
            double x,y;
            double n = in.nextInt();
		
            imax=10000000;
                for(i=0;i<=imax;i++){
                     x=Math.random();
                     y=Math.random();
                     if((x * x) + (y * y)<1.0){
                        n+=1.0;
                }
             }
             double pi = n / imax*4;
             System.out.println("�~������" + pi + "�ł��I");
	}
}
