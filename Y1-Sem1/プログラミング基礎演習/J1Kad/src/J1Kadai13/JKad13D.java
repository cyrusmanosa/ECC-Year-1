package J1Kadai13;

import java.util.Scanner;
public class JKad13D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("0 �ȏ�̐�������͂��Ă���������");
        int n = in.nextInt();
        while(n > 0) {
            System.out.print(n % 10);
            n /= 10;
        }
        if(n == 0){
            System.out.println(n);
        }
        System.out.println();
        in.close();
    }
}
