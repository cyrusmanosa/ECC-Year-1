package J1Kadai20;

import java.util.*;
public class JKad20S {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int BORDER = 75;
        System.out.println("�o�ȏ󋵂���͂��Ă��������B");
        int attend = 0;
        int absent = 0;
        int late = 0;
        for (int i = 0; i < 15; i++) {
            System.out.print("��" + i +"�T�ځF�i0�F�o�ȁA1�F���ȁA2�F�x���j��");
            int d = sc.nextInt();
            if ( d == 0 ){
                attend ++;
            }else if ( d == 1){
                absent++;
            }else{
                late++;
            }
        }
        System.out.println("�o�ȁF" + attend + "��");
        System.out.println("���ȁF" + absent + "��");
        System.out.println("�x���F" + late + "��");
        double r = (double)(attend * 100) / (double)(attend + absent + late);
        if ( r >= BORDER){
            System.out.println("�o�ȗ���" + r + "���ł��I�o�ȗ�OK �ł��I");
        }else{
            System.out.println("�o�ȗ���" + r + "���ł��I�o�ȗ�NG �ł��I");
        }
    }
}
