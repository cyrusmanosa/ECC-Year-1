package J1Kadai19;

import java.util.*;
public class JKad19A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = 0;
        int h = 300;
        int e = 15;
        System.out.println("���ʒ����Q�[���I");
        System.out.println("���P�b�g�𑀂��Ė����������Ă��������B");

        while ( h > 0) {
            System.out.println("--------------------------------");
            System.out.println("[�R��]�F" + e + "\t" + "[���x]�F" + s + "\t" + "[���x]�F" + h);
            System.out.println("--------------------------------");
            System.out.print("�t���˂��܂����H�i1�F����A����ȊO�F���Ȃ��j��");
            System.out.print("");
            int q = in.nextInt();
            if (q == 1) {
                if(e == 0){
                    System.out.println("�R�����Ȃ��I");
                    continue;
                }
                System.out.println("�R�����g�����I");
                e -= 1;
                s += 5;
                h += 1;
            }else{
                s -= 4;
                h += s;
            }
        }
        if (s < -10){
            System.out.println("�Y�L���[���I�������s�I�I");
        }else{
            System.out.println("���߂łƂ��I���������I�I");
        }
    }
}
