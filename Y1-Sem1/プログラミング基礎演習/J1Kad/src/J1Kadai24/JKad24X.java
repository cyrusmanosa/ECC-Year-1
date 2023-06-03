package J1Kadai24;

import java.util.*;
public class JKad24X {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("0~255 �̐���1 ����͂��Ă���������");
        int num1 = sc.nextInt();
        System.out.print("0~255 �̐���1 ����͂��Ă���������");
        int num2 = sc.nextInt();
        System.out.println("*�ɂ�邩���Z�F\t" + num1*num2);
        System.out.println("2 �i���̂����Z�F\t" + mul(num1,num2));
    }
    public static int mul(int n1, int n2){
        int ans = 0;
        while(n2 != 0) {
            if((n2 & 1) == 1) {
                ans += n1;
            }
            n1 <<= 1;
            n2 >>= 1;
        }
        return ans;
    }
}