package pac17;

import java.util.*;
public class Jkad17A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("�킵�͂��̐��E�̉��AECC �L���O����");
        System.out.println("�`���ɏo�����Ƃ�����҂͂��O���H");
        System.out.print("���͉��Ƃ����H��");
        String N = in.next();
        System.out.println(N + "�͎セ������");
        String[] RN = {"�{�����S" , "�v�b�N��" , "�`����" , "�Q���Q��"};
        int j;
        while (true){
            int i = (int)(Math.random()*4);
            System.out.print(RN[i] + "���͂ǂ�����H");
            int c = in.nextInt();
            j = i;
            if (c == 2) {
                break;
            }
        }

        System.out.println("�������I" + RN[j] + "���C�ɓ����Ă��炦�����I");
        System.out.println("�s���I�Q���Q���I�I���E�̕��a�����߂��̂���I");
    }
}
