package J2Kad23.pac23d;

import java.util.Scanner;

public class J2Kad23D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("�t�@�~���XECC�ւ悤�����I");
        while (true) {
            System.out.print("�ǂ����܂����H�i0�F�P�i�\���A1�F�ꗗ�\���A-1�F�I���j��");
            int n = Integer.parseInt(in.next());
            if (n < 0) break;

            // ���j���[�̕\��
            switch (n) {
                case 0:
                    MenuItem M = new MenuItem("���[�j���O���j���[", 400);
                    M.printItem();
                    break;
                case 1:
                    MorningMenu N = new MorningMenu();
                    N.printList();
                    break;
            }
            System.out.println();
        }
    }
}
