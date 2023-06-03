package J1Kadai14;

import java.util.Scanner;
public class JKad14C2 {
    public static void main(String[] args) {
        System.out.println("�W���b�N�͓����܂����I");
        System.out.println("���̓��A�V�܂œ͂����̖؂ɐ��������I");
        System.out.println("������o��΂����ƕ󕨂�����ɈႢ�Ȃ��I�I");
        claimBeanTree();
        System.out.println("�߂ł����A�߂ł����B");
    }

    public static void claimBeanTree(){
        Scanner in = new Scanner(System.in);
        System.out.println("�W���b�N�͓��̖؂�o�����I");
        while(true) {
            System.out.print("�ǂ����܂����H�i1�F�o��A����ȊO�F������ꂽ�j��");
            int x = in.nextInt();
            if (x != 1){
                System.out.println("�W���b�N�͓��̖؂��~�肽�I");
                System.out.println("�W���b�N�͓��̖؂��~�肽�I");
                System.out.println("�W���b�N�͓��̖؂��~�肽�I");
                System.out.println("�W���b�N�͓��̖؂��~�肽�I");
                System.out.println("�W���b�N�͓��̖؂��~�肽�I");
                System.out.println("�W���b�N�͓��̖؂��~�肽�I");
                break;
            }
        }
        in.close();
    }
}
