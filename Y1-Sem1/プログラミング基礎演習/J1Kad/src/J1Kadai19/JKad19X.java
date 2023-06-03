package J1Kadai19;

import java.util.*;
public class JKad19X {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] Cheese = {"�R�m","�|��","����","���R","�X�p�C"};
        while (true) {
            System.out.println("���Ȃ��͉���I�т܂����H");
            System.out.print("�i0�F�R�m�A1�F�|���A2�F�����A3�F���R�A4�F�X�p�C�j��");
            int c = in.nextInt();
            if (c < 0) {
                break;
            }else if (c > 5) {
                continue;
            }
            System.out.println("���Ȃ���" + Cheese[c] + "���o�����I");
            int r = (int) (Math.random() * 5);
            System.out.println("�b�o�t��" + Cheese[r] + "���o�����I");
            switch (c) {
                case 0 -> {
                    if (r != 2 && r != 3 && r != 0) {
                        System.out.println("���Ȃ��̏����I");
                    } else if (c == r) {
                        System.out.println("���������I");
                    } else {
                        System.out.println("���Ȃ��̕����I");
                    }
                    continue;
                }
                case 1 -> {
                    if (r != 0 && r != 3 && r != 1) {
                        System.out.println("���Ȃ��̏����I");
                    } else if (c == r) {
                        System.out.println("���������I");
                    } else {
                        System.out.println("���Ȃ��̕����I");
                    }
                    continue;
                }
                case 2 -> {
                    if (r != 0 && r != 3 && r != 2) {
                        System.out.println("���Ȃ��̏����I");
                    } else if (c == r) {
                        System.out.println("���������I");
                    } else {
                        System.out.println("���Ȃ��̕����I");
                    }
                    continue;
                }
                case 3 -> {
                    if (r != 4 && r != 3) {
                        System.out.println("���Ȃ��̏����I");
                    } else if (c == r) {
                        System.out.println("���������I");
                    } else {
                        System.out.println("���Ȃ��̕����I");
                    }
                    continue;
                }
                case 4 -> {
                    if (r == 3) {
                        System.out.println("���Ȃ��̏����I");
                    } else if (c == r) {
                        System.out.println("���������I");
                    } else {
                        System.out.println("���Ȃ��̕����I");
                    }
                    continue;
                }
            }
        }
    }
}