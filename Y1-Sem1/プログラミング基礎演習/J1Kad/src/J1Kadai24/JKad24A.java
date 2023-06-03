package J1Kadai24;
import java.util.*;
public class JKad24A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final String[] STATE = {"GOOD","BAD"} ;
        final String[] LIST = {"��","����","����","���","�Ή�","����","�a�C","��"};
        int[] HEZO = new int[8];
        int[] NS = new int[8];
        while (true) {
            for (int i = 0; i < LIST.length; i++) {
                System.out.print(LIST[i] + ":" + STATE[HEZO[7 - i]] + "\t ");
            }
            System.out.println("");
            System.out.print("�ǂ����܂����H�i1�F����������A2:�񕜂�����A-1�F�I���j��");
            int choose = in.nextInt();
            if (choose <= 0 || choose > 2) {
                System.out.println("�I�����܂��I");
                in.close();
            }
            System.out.print("��ԃR�[�h����͂��Ă���������");
            int num = in.nextInt();
            for (int i = 0; i < 8; i++) {
                NS[7 - i] = (num & 0x01);
                num >>= 1; // n = n >> 1;
            }
            if (choose == 1) {
                for (int j = 0; j < 8; j++) {
                    HEZO[j] |= NS[j];
                }
            } else {
                for (int j = 0; j < 8; j++) {
                    HEZO[j] &= NS[j];
                }
            }
        }
    }
}
