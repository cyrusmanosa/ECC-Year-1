package J1Kadai23;

import java.util.*;
public class JKad23C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("�킽���̓X�[�p�[�e�B�[�`���[�AECC �G�N�Z�����g��I");
        System.out.println("���Ȃ��̃N���X�������ĂˁI");
        System.out.print("�i1�FIE�A2�FSK�A3�FSE�A����ȊO�F�킩��Ȃ���");
        int Class = sc.nextInt();
        switch (Class){
            case 1:
                System.out.println("4�N���R�[�X�Ȃ̂ˁI");
                break;
            case 2:
                System.out.println("3�N���R�[�X�Ȃ̂ˁI");
                break;
            case 3:
                System.out.println("2�N���R�[�X�Ȃ̂ˁI");
                break;
            default:
                System.out.println("�킩��Ȃ��̂ˁI");
                break;
        }
    }
}
