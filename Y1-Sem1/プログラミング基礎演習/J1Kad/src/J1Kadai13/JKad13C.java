package J1Kadai13;

import java.util.Scanner;
public class JKad13C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 1;
        int a;
        do {
            System.out.print("1 ���傫����������͂��Ă���������");
            a = in.nextInt();
        } while (i >= a);

        int j = 0;
        while (i <= a) {
            j += i;
            i++;
        }
        System.out.println("1 ����" + a + "�܂ŉ��Z���܂��I");
        System.out.println("���v��" + j + "�ł��I�I");
        in.close();
    }
}
