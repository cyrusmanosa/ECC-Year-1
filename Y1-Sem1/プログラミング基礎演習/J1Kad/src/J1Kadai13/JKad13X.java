package J1Kadai13;

import java.util.Scanner;
class JKad13X {
    public static boolean isFizz(int n1) {
        Scanner in = new Scanner(System.in);
        System.out.println("�����܂ŋ��т܂����H��" + n1);
        for (int i = 1; i <= n1; i++) {
            if ( !(i % 3 == 0) && !(i % 5 == 0)) {
                System.out.println(i);
            }

            else if ( (i % 3 == 0) && !(i % 5 == 0) ) {
                System.out.println("���!");
            }

            else if ( (i % 10 == 3) ) {
                System.out.println("���!");
            }

            else if ( !(i % 3 == 0) && (i % 5 == 0) ) {
                System.out.println("�ɂ��!");
            }

            else if ( (i % 3 == 0) && (i % 5 == 0) ) {
                System.out.println("��ɂ��I!");
            }
        }
        return false;
    }

    public static void main(String[] args) {
        isFizz(41);
    }
}

