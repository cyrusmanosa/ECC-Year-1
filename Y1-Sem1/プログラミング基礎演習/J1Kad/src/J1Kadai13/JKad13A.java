package J1Kadai13;

import java.util.Scanner;
public class JKad13A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("�����ăQ�[���I");
        int r = 1;
        int c = 99;
        int a;
        int b = 0;
        int x = (int) (Math.random() * c);
        while (r > 0) {
            System.out.print(r + " ��ځF" + b + "����" + c + "�܂ł̐��l����͂��Ă���������");
            a = in.nextInt();
            while(a <= c && a >= b) {
                if (x == a) {
                    System.out.println("�������܂����I");
                    break;
                } else if (x > a) {
                    System.out.println(a + "���傫���ł��I");
                    b = x;
                    b++;
                } else if (x < a) {
                    System.out.println(a + " ��菬�����ł��I");
                    c = a;
                    c--;
                }
                r++;
            }
        }
    }
}
