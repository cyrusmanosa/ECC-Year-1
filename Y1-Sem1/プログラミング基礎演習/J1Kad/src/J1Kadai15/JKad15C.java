package J1Kadai15;

import java.util.*;
public class JKad15C {
    public static int integrate(int n){
        Scanner in = new Scanner(System.in);
        System.out.print("1 ���傫����������͂��Ă���������");
        n = in.nextInt();
        int j = 0;
        int i = 1;
        while (i <= n){
            j += i;
            i++;
        }
        System.out.println("1 ����" + n + "�܂ŉ��Z���܂��I");
        System.out.println("���v��" + j + "�ł��I�I");
        return j;
    }

    public static void main(String[] args) {
        integrate(10);
    }
}
