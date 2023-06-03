package J1Kadai15;

import java.util.Scanner;
public class JKad15D {
    public static void dekisugi(int n1, int n2){
        Scanner in = new Scanner(System.in);
        System.out.print("1 ���傫������1 ����͂��Ă���������");
        n1 = in.nextInt();
        System.out.print("1 ���傫������2 ����͂��Ă���������");
        n2 = in.nextInt();
        System.out.print(n1 + "��" + n2 + "�̏��Ɨ]����v�Z���܂��I");
        int a = n1 / n2;
        int b = n1 % n2;
        System.out.println("�o�ؐ�����A��낵���I");
        System.out.println("����Ȃ̊ȒP���I");
        System.out.println("����" + a + "�A�]���" + b + " ����B");
    }

    public static void main(String[] args) {
        dekisugi(10,3);
    }
}
