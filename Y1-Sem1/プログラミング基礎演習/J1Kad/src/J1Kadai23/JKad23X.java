package J1Kadai23;

import java.util.*;
public class JKad23X {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("�ǂ����܂����H�i1�F�X�^�[�g/�X�g�b�v�A2�F�N���A�j��");
            int Choose = sc.nextInt();
            if ( Choose < 0){
                System.out.println("�I�����܂��I");
                sc.close();
            }
            switch (Choose){
                case 1 -> {
                    System.out.println("�����o���܂���!");
                    Time(Choose);
                }
                case 2 -> {
                    System.out.println("���̑���͖����ł�");
                    System.out.println("�X�g�b�v�E�H�b�`�͎~�܂��Ă��܂�");
                }
                default -> {return;}
            }
        }
    }

    public static void Time(int choose) {
        Scanner sc = new Scanner(System.in);
            System.out.print("�ǂ����܂����H�i1�F�X�^�[�g/�X�g�b�v�A2�F�N���A�j��");
            int Choose = sc.nextInt();
            if ( Choose < 1){
                System.out.println("�I�����܂��I");
                sc.close();
            }
        switch (Choose) {
            case 1 -> {
                System.out.println("�ꎞ��~���܂�!");
                Pause(choose);
            }
            case 2 -> {
                System.out.println("���̑���͖����ł�!");
                System.out.println("���Ԃ��v�����ł�!");
                Time(choose);
            }
            default -> Time(choose);
        }
    }

    public static void Pause(int choose) {
        Scanner sc = new Scanner(System.in);
        System.out.print("�ǂ����܂����H�i1�F�X�^�[�g/�X�g�b�v�A2�F�N���A�j��");
        int Choose = sc.nextInt();
        if ( Choose < 1){
            System.out.println("�I�����܂��I");
            sc.close();
        }
        switch (Choose) {
            case 1 -> {
                System.out.println("�v�����ĊJ���܂�!");
                Time(choose);
            }
            case 2 -> System.out.println("�v�����X�g�b�v���ă^�C�����N���A���܂�!");
            default -> {return;}
        }
    }
}