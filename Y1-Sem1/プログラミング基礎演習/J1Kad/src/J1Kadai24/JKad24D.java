package J1Kadai24;

import java.util.*;
public class JKad24D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("��������͂��Ă���������");
        int num = sc.nextInt();
        System.out.println(num + "\t" + getBinString(num));
    }

    /**
     * ���� ���ꂽ������2 �i���\�����郁�\�b�h
     * @param n 2�i���\������������
     * @return �����̒l���Q�i���ɕϊ�����������
     */
    public static String getBinString(int n) {
        // �󕶎��ŏ�����
        String strBinary = "";
        //�@�W�r�b�g�\���̂��߂ɌJ��Ԃ�
        for (int i = 0; i < 8; i++) {
            strBinary = (n & 0x01)+strBinary;
            n >>= 1; // n = n >> 1;
        }
        return strBinary;
    }
}


