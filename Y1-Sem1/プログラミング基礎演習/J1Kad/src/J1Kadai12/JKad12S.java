package J1Kadai12;

import java.util.Scanner;
public class JKad12S {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("�����ăQ�[���I");
        int r = 1;
        int x = (int) (Math.random()*99);
            while (r > 0) {
                System.out.print(r + "��ځF���l����͂��Ă���������");
                int a = in.nextInt();
                    if ( x == a) {
                        System.out.println("�������܂����I");
                        break;
                    }else if (x > a) {
                        System.out.println(a + "���傫���ł��I");
                    } else if (x < a ) {
                        System.out.println(a + " ��菬�����ł��I");
                    }
                r++;
            }
    }
}
