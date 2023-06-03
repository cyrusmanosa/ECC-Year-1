package J1Kadai13;

import java.util.Scanner;

public class JKad13BAA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = 0;
        int a = 0;

        while (true) {
            System.out.print(p + "�l�ڂ̓_������͂��Ă���������");
            int m = in.nextInt();
            if ( m < 0){
                break;
            }
            p++;
            if (m > 100){
                continue;
            }
            a += m;
        }
            System.out.println( (p) + "�l�̍��v��" + a + "�_�ł��I");
            System.out.println( (p ) + "�l�̕��ς�" + (double)(a) / (double)(p) + "�_�ł��I");
    }
}
