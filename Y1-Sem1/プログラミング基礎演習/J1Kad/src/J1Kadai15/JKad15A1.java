package J1Kadai15;

import java.util.Scanner;
public class JKad15A1 {
    public static void dekisugi(int n1, int n2){
        int a = n1 / n2;
        int b = n1 % n2;
        System.out.println("�o�ؐ�����A��낵���I");
        System.out.println("����Ȃ̊ȒP���I");
        System.out.println("����" + a + "�A�]���" + b + " ����B");
    }

    public static void  nobita(int n1, int n2){
        int c = n1 - n2;
        int i = 1;
        int x = n1 - (i * n2);

        while (c > n2){
            c -= n2;
        }

        while (x > n2){
            i++;
            x = n1 - (i * n2);
        }
        System.out.println("���A�������I�����S��H�ׂ���ƈꏏ���ˁI");
        System.out.println("����" + i + "�A�]���" + c + " ����B");
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("1 ���傫������1 ����͂��Ă���������");
        int a = in.nextInt();
        System.out.print("1 ���傫������2 ����͂��Ă���������");
        int b = in.nextInt();
        System.out.print(a + "��" + b + "�̏��Ɨ]����v�Z���܂��I");
        System.out.print("�N���Ăяo���܂����H�i1�F�o�ؐ��A����ȊO�F�̂ё��j��");
        int i = in.nextInt();
        if ( i == 1) {
            dekisugi(a,b);
        }else{
            nobita(a,b);
        }
    }
}
