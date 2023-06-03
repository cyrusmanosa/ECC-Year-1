package J1Kadai11.pac11;

import java.util.Scanner;
public class JKad11S {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("�O�p�`�����܂��I");
        System.out.print("��1 �̒�������͂��Ă���������");
        int a = in.nextInt();
        System.out.print("��2 �̒�������͂��Ă���������");
        int b = in.nextInt();
        System.out.print("��3 �̒�������͂��Ă���������");
        int c = in.nextInt();

        if (a == b && b == c){
            System.out.print("���O�p�`�ɂȂ�܂��I");
        }else if (a == b || b == c || c == a){
            System.out.print("�񓙕ӎO�p�`�ɂȂ�܂��I");
        }else if (a + b > c && b + c > a && c + a > b){
            System.out.print("�O�p�`�ɂȂ�܂��I");
        }else {
            System.out.print("�O�p�`�ɂȂ�܂���!");
        }
        in.close();
    }
}
