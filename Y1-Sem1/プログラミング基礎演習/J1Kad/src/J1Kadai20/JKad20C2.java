package J1Kadai20;

import java.util.*;
public class JKad20C2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1 ���傫����������͂��Ă���������");
        int value = sc.nextInt();
        System.out.println("1 ����" + value + "�܂ŉ��Z���܂��I");
        int all = 0;
        for (int i = 0 ; i <= value ; i++) {
            all += i;
        }
        System.out.println("���v��" + all + "�ł��I�I");
    }
}
