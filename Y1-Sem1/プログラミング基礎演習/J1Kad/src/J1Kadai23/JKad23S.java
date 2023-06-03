package J1Kadai23;

import java.util.*;
public class JKad23S {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("����񂯂�����܂��I");
        String[] pc = {"�O�[","�`���L","�p�["};
        System.out.print("���̎���o���܂����H�i0�F�O�[�A1�F�`���L�A2�F�p�[��");

        int me = sc.nextInt();
        int i = (int)(Math.random()*3);

        if (me > 2){
            sc.close();
        }


        switch (me){
            case 0:
                System.out.println("���Ȃ��̓O�[���o�����I");
                break;
            case 1:
                System.out.println("���Ȃ��̓`���L���o�����I");
                break;
            case 2:
                System.out.println("���Ȃ��̓p�[���o�����I");
                break;
        }

        System.out.println("�b�o�t��"+pc[i]+"���o�����I");

        if( i < me && (me!=2 && i!=0) ){
            System.out.println("���Ȃ��̕����I");
        }else if (me < i ){
            System.out.println("���Ȃ��̏����I");
        }else if (me == i){
            System.out.println("���������I");
        }
    }
}
