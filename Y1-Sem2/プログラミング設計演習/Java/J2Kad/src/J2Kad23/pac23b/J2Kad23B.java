package J2Kad23.pac23b;

import java.util.Scanner;

public class J2Kad23B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("�t�@�~���XECC�ւ悤�����I");
        while (true) {
            System.out.print("���̃��j���[��\�����܂����H�i0�F���[�j���O�A1�F�����`�A2�F�f�B�i�[�A-1�F�I���j��");
            int n = Integer.parseInt(in.next());
            if (n < 0) break;
            // ���j���[�̕\��
            switch (n){
                case 0:
                    Component M = new MorningMenu();
                    M.print();
                    break;
                case 1:
                    Component L = new LunchMenu();
                    L.print();
                    break;
                case 2:
                    Component D = new DinnerMenu();
                    D.print();
                    break;
            }
            System.out.println();
        }
    }
}
