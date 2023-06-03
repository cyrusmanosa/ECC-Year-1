package J1Kadai12;

import java.util.Scanner;
public class JKad12B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = 1;
        int t = 0;
        while (p > 0) {
            System.out.print(p + "�l�ڂ̓_������͂��Ă���������");
            int a = in.nextInt();
            if (a < 0){
                break;
            }
            p++;
            t += a;
        }
        System.out.println((p-1) + "�l�̍��v��" + t + "�_�ł��I");
        System.out.println((p-1) + "�l�̕��ς�" + (double)(t)/(double)(p-1) + "�_�ł��I" );
        in.close();
    }
}
