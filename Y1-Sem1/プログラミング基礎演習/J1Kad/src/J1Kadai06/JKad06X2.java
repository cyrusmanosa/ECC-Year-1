import java.util.Scanner;

class JKad06X2{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("モンテカルロ・シミュレーションで円周率を求めます！");
		System.out.print("何回シミュレーションしますか？＞");
		
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
             System.out.println("円周率は" + pi + "です！");
	}
}
