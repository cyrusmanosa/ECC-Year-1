package J1Kadai14;

import java.util.Scanner;
public class JKad14B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("���p�񓙕ӎO�p�`�̖ʐς����߂܂��I");
        System.out.print("�Εӂ̒�������͂��Ă���������");
        int length = in.nextInt();
        System.out.print("�N�Ɍv�Z�����܂����H�i1�F�o�ؐ��A2�F�������j��");
        int p = in.nextInt();
        if (p == 1){
            dekisugi(length);
        }else{
            sizuka(length);
        }
        System.out.println(" ");
    }
    public static void dekisugi(int length){
        System.out.println("�O�p�`�̖ʐς͒�Ӂ~������2 ������");
        System.out.println("��ӂƍ��������߂�΂����񂾁I");
        double a = length / Math.sqrt(2);
        System.out.println("��ӂ�" + a + "�A����������������1");
        double b = (a * a ) / 2;
        System.out.println("���p�񓙕ӎO�p�`�̖ʐς�" + b + "����I");

    }
    public static void sizuka(int length){
        System.out.println("���p�񓙕ӎO�p�`��4 �Ő����`�ɂȂ邩��");
        System.out.println("�����`�̖ʐς����߂�4 �Ŋ���΂����񂾂�I");
        int a = length * length;
        System.out.println("�����`�̖ʐς�" + a + "������");
        System.out.println("���p�񓙕ӎO�p�`�̖ʐς�" + ( (double)(a) / (double) (4) ) + "�ˁI");
    }
}
