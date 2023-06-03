package J1Kadai15;

import java.util.*;
public class JKad15S {
    public static void dekisugi(int n){
        System.out.println("����Ȃ̊ȒP���I");

        int y = n % 2;
        int i = 0;
        int a = 0;

        while (n > 1) {
            y = n % 2;
            n = n / 2;
            i++;
            a += n;
            System.out.println(i+ "���̎������F" + n + "\t" + "�s�폟�F" + y + "\t" + "�c��`�[���F" + (n +y) );
            n = n + y;
        }

        System.out.println("�g�[�^���̎�������" + a + "����B");
    }

    public static void sizuka(int n){
        System.out.println("����Ȃ̊ȒP��I");
        System.out.println("1 ��������΁�������������������");
        n -= 1;
        System.out.println("�Ō��1 �`�[���c�邽�߂ɂ�" + n + "��������΂����̂�B");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("�g�[�i�����g�̃`�[��������͂��Ă���������");
        int n = in.nextInt();
        System.out.print("�N�����������v�Z���܂����H�i1�F�o�ؐ��A����ȊO�F�������j��");
        int y = in.nextInt();
        if (y == 1) {
            dekisugi(n);
        }else{
            sizuka(n);
        }
    }
}
