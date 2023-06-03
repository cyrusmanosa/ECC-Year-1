package J1Kadai23;

import java.util.*;
public class JKad23B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("���܉����ł����H�i1?12�j��");
        int month = sc.nextInt();
        switch (month){
            case 3,4,5:
                System.out.println("�t�ł��I�����G�߂ł��ˁI�I");
            case 6,7,8:
                System.out.println("�Ăł��I�����ł��ˁI�I");
            case 9,10,11:
                System.out.println("�H�ł��I�H�ו������������ł��ˁI�I");
            case 12,1,2:
                System.out.println("�H�ł��I�H�ו������������ł��ˁI�I");
            default:
                System.out.println("����1 ��?12 ���܂łł��I");
                break;
        }
    }
}