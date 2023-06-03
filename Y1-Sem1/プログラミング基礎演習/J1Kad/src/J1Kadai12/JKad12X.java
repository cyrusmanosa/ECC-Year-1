package J1Kadai12;

import java.util.Scanner;
class JKad12X {
    public static void calcGCD(int n1, int n2) {
        Scanner in = new Scanner(System.in);
        System.out.println("�ӂ��߂̐�������͂��Ă���������" + n1);
        System.out.println("�ЂƂ߂̐�������͂��Ă���������" + n2);
        int a = n1;
        int b = n2;
        int i;
        if (a < b) {
            i = a;
            a = b;
            b = i;
        }
        int c = a - b;
        while (c != 0) {
            a = b;
            b = c;
            c = a - b;
            if (b < c) {
                break;
            }
        }
        System.out.println("�ő���񐔂�" + b + "�ł��I");
    }
    public static void calcLCM(int n1, int n2) {
        Scanner in = new Scanner(System.in);
        int a = n1;
        int b = n2;
        int i;
        int x = a * b;
        if (a < b) {
            i = a;
            a = b;
            b = i;
        }
        int c = a - b;
        while (c != 0) {
            a = b;
            b = c;
            c = a - b;
            if (b < c) {
                break;
            }
        }
        System.out.println("�ŏ����{����" + x / b + "�ł��I");
    }
    public static void main(String[] args) {
        calcGCD(30,50);
        calcLCM(30,50);
    }
}