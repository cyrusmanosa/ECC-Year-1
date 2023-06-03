package J1Kadai12;

import java.util.Scanner;
public class JKad12D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("�����S�̐�����͂��Ă���������");
        int apple = in.nextInt();
        System.out.print("�H�ׂ�l�̐�����͂��Ă���������");
        int person = in.nextInt();
        int b = apple / person;
        while (apple >= person) {
            System.out.println("�ЂƂ��������S��H�ׂ��I");
            apple -= person;
        }
            System.out.println("���ꂼ��" + b + "�̃����S��H�܂����I");
            System.out.println("�c���������S��" + apple + "�ł��I");
        in.close();
    }
}