package J1Kadai26;

import java.util.Scanner;

public class JKad26X {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] strHands = {"�O�[", "�`���L", "�p�["};
        String[] strJudge =
        {       "",
                "��l�����܂����I", //0x01
                "��l�����܂����I", //0x02
                "�����������I",    //0x03
                "�S���Ɠ����肾�I", //0x04
                "������",         //0x05, 0x01 �� 0x02
                "������",         //0x06, 0x02 �� 0x04
                "�����������I"     //0x07, 0x01 �� 0x02 �� 0x04
        };

        String[]strName ={"�̂т�","������","�W���C�A��","�X�l�v"};

        final int WIN = 0x01;
        final int LOSE = 0x02;
        final int DRAW = 0x04;
        int[] intHand = new int[strName.length];
        //���s�z��
        int [][] intJudge=
        {
            {DRAW,WIN,LOSE},
            {LOSE,DRAW,WIN},
            {WIN,LOSE,DRAW}
        };

        while(true) {
            System.out.print("�̂ё��͉����o���܂����H�i0:�O�[�A1:�`���L�A2:�p�[�A-1�F��߂�)��");
            intHand[0] = in.nextInt();
            if (intHand[0] < 0) {
                break;
            }

            // ����
            for (int i = 1 ; i < strName.length; i++) {
                intHand[i] =(int) (Math.random() * strHands.length);
            }

            //�S���̎�̕\��
            for (int i = 0; i < strName.length; i++) {
                System.out.println(strName[i]+"��" + strHands[intHand[i]] + "���o�����I");
            }

            System.out.println();

            //���s�\��
            for (int i = 0; i < strName.length; i++) {
                int result = 0;      //��l���̔��茋��
                for (int j = 0; j < strName.length; j++){
                    if( i == j ){   //�������g�̎���continue
                        continue;
                    }
                    result |= intJudge[ intHand[i]] [intHand[j] ];
                }
                System.out.println(strName[i]+"��"+strJudge[result]);
            }
            System.out.println();
        }
    }
}