package J1Kadai11.pac11;

import java.util.Scanner;
class JKad11C1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("�������I�������֍s�����I�I");
        System.out.print("���Ȃ��̔N�����͂��Ă���������");
        int a = in.nextInt();
        if (a >= 15) {
            System.out.print("��l�����F500 �~�ɂȂ�܂��I");
        }
        if (a < 15) {
            System.out.println("�q�������F200 �~�ɂȂ�܂��I");
        }
        if (a <= 6) {
            System.out.println("�����ł��I");
        }
        in.close();
    }
}