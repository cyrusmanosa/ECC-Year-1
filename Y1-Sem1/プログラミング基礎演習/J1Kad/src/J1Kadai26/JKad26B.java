package J1Kadai26;

import java.util.Scanner;

public class JKad26B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int WIN = 0;
        final int LOSE = 1;
        final int DRAW = 2;
        String[] strHands = {"�O�[", "�`���L", "�p�["};
        String[] strJudge = {"���Ȃ��̏����I", "���Ȃ��̕����I", "���������I"};
        int[][] result = { {DRAW,WIN,LOSE},{LOSE,DRAW,WIN},{WIN,LOSE,DRAW}
                         };
        while (true){
            System.out.print("�̂ё��͉����o���܂����H�i0�F�O�[�A1�F�`���L�A2�F�p�[�A-1�F��߂�j��");
            int me = in.nextInt();
            int random = (int)(Math.random()*3);
            if(me < 0 && me > 2){
                break;
            }
            System.out.println("�̂ё���" + strHands[me] + "���o�����I");
            System.out.println("��������" + strHands[random] + "���o�����I");
            System.out.println();
            System.out.println( strJudge[result[me][random]] );
            System.out.println();
        }
    }
}