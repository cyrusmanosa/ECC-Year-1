package J1Kadai12;

import java.util.Scanner;
public class JKad12C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("1 ���傫����������͂��Ă���������");
        int num = in.nextInt();
        System.out.println("1 ����" + num + "�܂ŉ��Z���܂��I");
        int i = 1;
        int j = 0;
        while(i <= num) {
            j += i;
             i++;
        }
        System.out.println(j);
    }
}
