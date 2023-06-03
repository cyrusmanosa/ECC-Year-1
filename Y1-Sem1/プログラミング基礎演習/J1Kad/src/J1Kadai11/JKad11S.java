package J1Kadai11;

import java.util.Scanner;
public class JKad11S {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("三角形を作ります！");
        System.out.print("辺1 の長さを入力してください＞");
        int a = in.nextInt();
        System.out.print("辺2 の長さを入力してください＞");
        int b = in.nextInt();
        System.out.print("辺3 の長さを入力してください＞");
        int c = in.nextInt();

        if (a == b && b == c){
            System.out.print("正三角形になります！");
        }else if (a == b || b == c || c == a){
            System.out.print("二等辺三角形になります！");
        }else if (a + b > c && b + c > a && c + a > b){
            System.out.print("三角形になります！");
        }else {
	  	System.out.print("三角形になりません!");
        }
    }
}
