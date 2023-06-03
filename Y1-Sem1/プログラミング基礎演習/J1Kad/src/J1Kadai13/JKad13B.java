package J1Kadai13;

import java.util.Scanner;
public class JKad13B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = 1;
        int a = 0;
        System.out.print(p + "�l�ڂ̓_������͂��Ă���������");
        int m = in.nextInt();

        if (p == 1 && m < 0){
            System.out.println("���Ȃ��Ƃ���l���͓��͂��Ă��������I");
            System.out.print(p + "�l�ڂ̓_������͂��Ă���������");
            m = in.nextInt();
        }

        while (m >= 0) {
            p++;
            a += m;
            System.out.print(p + "�l�ڂ̓_������͂��Ă���������");
            m = in.nextInt();
        }
            System.out.println( (p - 1) + "�l�̍��v��" + a + "�_�ł��I");
            System.out.println( (p - 1) + "�l�̕��ς�" + (double)(a) / (double)(p-1) + "�_�ł��I");
    }
}
