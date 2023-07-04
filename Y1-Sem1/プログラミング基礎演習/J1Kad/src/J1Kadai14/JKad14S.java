package J1Kadai14;

import java.util.Scanner;

public class JKad14S {

    public static void main(String[] args) {
        System.out.println("���Ȃ��͗E�҂ł��I");
        System.out.println("����΂��ď�܂ł��ǂ蒅���Ă��������I�I");
        gotoTown();

    }

    // ���֍s�� P1
    public static void gotoTown(){
        Scanner in = new Scanner(System.in);
        System.out.println("���Ȃ��͒��ɂ��܂��B");
        System.out.print("�ǂ���֐i�݂܂����H�i1�F�����A2�F�X�j��");
        int a = in.nextInt();
            if (a == 1){
                gotoGrassland();
            }else{
                gotoForest();
            }
        System.out.print("����");
    }

    // �����֍s�� P2
    public static void gotoGrassland(){
        Scanner in = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("���Ȃ��͑����ɂ��܂��B");
        System.out.print("�ǂ���֐i�݂܂����H�i1�F�� �A2�F�X�j��");
        int a = in.nextInt();
            if (a == 1){
                gotoTown();
            }else{
                gotoForest();
            }
        System.out.print("������");
    }

    // �X�֍s�� P3
    public static void gotoForest(){
        Scanner in = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("���Ȃ��͐X�ɂ��܂��B");
        System.out.print("�ǂ���֐i�݂܂����H�i1�F���� �A2�F�r�n�j��");
        int a = in.nextInt();
            if (a == 1){
                gotoGrassland();
            }else{
                gotoWasteland();
            }
        System.out.print("���X");
    }

    // �r�n�֍s�� P4
    public static void gotoWasteland(){
        Scanner in = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("���Ȃ��͍r�n�ɂ��܂��B");
        System.out.print("�ǂ���֐i�݂܂����H�i1�F���� �A2�F���A�j��");
        int a = in.nextInt();
            if (a == 1){
                gotoGrassland();
            }else{
                gotoCave();
            }
        System.out.print("���r�n");
    }

    // ���A�֍s�� P5
    public static void gotoCave(){
        Scanner in = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("���Ȃ��͓��A�ɂ��܂��B");
        System.out.print("�ǂ���֐i�݂܂����H�i1�F�X �A2�F��j��");
        int a = in.nextInt();
            if (a == 1){
                gotoForest();
            }else{
//                gotoCastle();
            }
        System.out.print("�����A");
    }

//    // ��֍s�� P6
//    public static void gotoCastle(){
//        System.out.println("\n");
//        System.out.println("��ɒ����܂����I");
//        System.out.println("������\�����܂��I");
//        System.out.print("��");
//    }
}
