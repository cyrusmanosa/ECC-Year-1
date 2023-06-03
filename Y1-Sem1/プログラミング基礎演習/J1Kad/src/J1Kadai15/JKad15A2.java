package J1Kadai15;

import java.util.*;
public class JKad15A2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("1 ���傫����������͂��Ă���������");
        int n = in.nextInt();
        System.out.println("1 ����" + n + "�܂ŉ��Z���܂��I");
        System.out.println("���v��" + integrate(n) + "�ł��I�I");
    }

    public static int integrate(int n)  {
        if ( n == 1){
            return 1;
        }else{
            return (n + integrate(n-1) );
        }
    }
}
