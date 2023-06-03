package J1Kadai25;

import java.util.*;
public class JKad25C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("�p�P�����͂��Ă���������");
        String input = in.next();
        //�@1���������擾�@������.charAt(�Y�������ԍ�)
        for (int i = 0 ; i < input.length(); i++) {
            char code = input.charAt(i);
            System.out.println(code + "�̕����R�[�h�F" + Integer.toHexString(code));
        }
    }
}
