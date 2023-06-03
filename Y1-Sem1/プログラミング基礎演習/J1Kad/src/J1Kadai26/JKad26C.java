package J1Kadai26;

import java.util.Scanner;

public class JKad26C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] strHands = {"�O�[", "�`���L", "�p�["};
        while (true){
            System.out.print("�̂ё��͉����o���܂����H�i0�F�O�[�A1�F�`���L�A2�F�p�[�A-1�F��߂�j��");
            int me = in.nextInt();
            int random = (int)(Math.random()*3);
            System.out.println("�̂ё���" + strHands[me] + "���o�����I");
            System.out.println("��������" + strHands[random] + "���o�����I");
            System.out.println();
            if(me < 0 && me > 2){
                break;
            }
        }
    }
}