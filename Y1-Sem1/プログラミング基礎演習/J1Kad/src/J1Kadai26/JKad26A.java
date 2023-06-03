package J1Kadai26;

import java.util.Scanner;

public class JKad26A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int WIN = 0;
        final int LOSE = 1;
        final int DRAW = 2;
        String[] strHands = {"�R�m", "�|��", "����","���R","�X�p�C"};
        String[] strJudge = {"���Ȃ��̏����I", "���Ȃ��̕����I", "���������I"};
        int[][] result = { {DRAW,WIN,LOSE,LOSE,WIN},
                           {LOSE,DRAW,WIN,LOSE,WIN},
                           {WIN,LOSE,DRAW,LOSE,WIN},
                           {WIN,WIN,WIN,DRAW,LOSE},
                           {LOSE,LOSE,LOSE,WIN,DRAW}
        };
        while (true){
            System.out.print("�̂ё��͉����o���܂����H�i0�F�R�m�A1�F�|���A2�F�����A3�F���R�A4�F�X�p�C�A-1�F��߂�j��");
            int me = in.nextInt();
            int random = (int)(Math.random()*5);
            if(me < 0){
                break;
            }
            System.out.println("�̂ё���" + strHands[me] + "���o�����I");
            System.out.println("��������" + strHands[random] + "���o�����I");
            System.out.println();
            System.out.println(strJudge[result[me][random]]);
            System.out.println();
        }
    }
}