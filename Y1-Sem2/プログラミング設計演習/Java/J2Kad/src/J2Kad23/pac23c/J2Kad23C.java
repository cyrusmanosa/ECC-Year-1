package J2Kad23.pac23c;

import java.util.Scanner;

public class J2Kad23C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("�t�@�~���XECC�ւ悤�����I");
        while (true) {
            System.out.print("�ǂ����܂����H�i0�F�P�i�\���A1�F�ꗗ�\���A-1�F�I���j��");
            int n = Integer.parseInt(in.next());
            if (n < 0) break;

            // ���j���[�̕\��
            switch (n){
                case 0:
                    Component M = new MenuItem("���[�j���O�Z�b�g",400);
                    M.print();
                    break;
                case 1:
                    Component N = new MorningMenu();
                    N.print();
                    break;
            }
            System.out.println();
        }
    }
}
