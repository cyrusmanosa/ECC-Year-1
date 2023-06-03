package J1Kadai19;

import java.util.*;
public class JKad19S {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("���Ȃ��̖��O����͂��Ă���������");
        String name = in.next();
        int all = 20;
        while ( all > 1 ) {
            showStone(all);
            System.out.println("");
            System.out.println(name + "�̔Ԃł��B");
            System.out.print("�����܂����H�i1-3�j��");
            int Cpu = in.nextInt();
            if (Cpu > 3) {
                continue;
            }
            System.out.println(Cpu + "���܂����I");
            all -= Cpu;
            if( all < 0){
                System.out.println(name +"�̕����ł��I");
                break;
            }
            showStone(all);
            System.out.println("");
            System.out.println("CPU�̔Ԃł��B");
            int c = (int)(Math.random()*3 +1);
            System.out.println("�����܂����H�i1-3�j��" + c);
            System.out.println(c + "���܂����I");
            all -= c;
            if( all < 0){
                System.out.println("CPU�̕����ł��I");
                break;
            }
        }

    }

    public static void showStone(int stone){
        System.out.print("�c��" + stone + "�F");
        for (int i = 0 ; i < stone; i ++){
            System.out.print("��");
        }
        return;
    }

}
