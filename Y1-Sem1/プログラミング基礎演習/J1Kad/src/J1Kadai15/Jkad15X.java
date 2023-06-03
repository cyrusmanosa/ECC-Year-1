package J1Kadai15;

import java.util.*;
public class Jkad15X {
    public static void dekisugi(int v, int h) {
        System.out.println("����͂Ȃ��Ȃ��育�킢���I");
        System.out.println("�Ƃ肠����1 �񊄂��āA���ꂼ����܂������āA�S����" + breakOff(v,h) +"�񂾁I");
    }
    public static int breakOff(int v, int h){
        if (v > 1) {    //�c�u���b�N�������Ƃ�
            int v1 = v / 2;
            int v2 = v - v1;
            return 1 + breakOff(v1,h) + breakOff(v2,h);
        }

        if (h > 1) {    //���u���b�N�������Ƃ�
            int h1 = h / 2;
            int h2 = h - h1;
            return 1 + breakOff(v,h1) + breakOff(v,h2);
        }

        return 0;  //����ȏ㊄��Ȃ��Ƃ�
    }
    public static void sizuka(int v, int h){
        System.out.println("����Ȃ̊ȒP��I");
        int x = v * h;
        int r = 0;
        if (x % 2 == 0){
            r = x - 1;
            System.out.println("�Ƃ肠����1 �񊄂��āA���ꂼ����܂������āA�S����" + r + "�񂾁I");
        }else{
            System.out.println("�Ƃ肠����1 �񊄂��āA���ꂼ����܂������āA�S����" + x + "�񂾁I");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("�`���R�������Ă����܂��I");
        System.out.print("�c�̃u���b�N�͂����ł����H��");
        int v = in.nextInt();
        System.out.print("���̃u���b�N�͂����ł����H��");
        int h = in.nextInt();
        System.out.print("�N������񐔂��v�Z���܂����H�i1�F�o�ؐ��A����ȊO�F�������j��");
        int p = in.nextInt();
        if (p == 1) {
            dekisugi(v,h);
        }else{
            sizuka(v,h);
        }
    }
}
