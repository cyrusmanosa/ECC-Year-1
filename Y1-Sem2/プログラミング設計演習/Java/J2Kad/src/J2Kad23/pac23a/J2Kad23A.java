package J2Kad23.pac23a;

import java.util.Scanner;

public class J2Kad23A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("�t�@�~���XECC�ւ悤�����I");
        while (true) {
            System.out.print("���̃��j���[��\�����܂����H�i0�F���[�j���O�A1�F�����`�A2�F�f�B�i�[�A3�F���ׂāA-1�F�I���j��");
            int n = Integer.parseInt(in.next());
            if (n < 0) break;
            Component A = new AllMenu();
            Component M = new MorningMenu();
            Component L = new LunchMenu();
            Component D = new DinnerMenu();
            // ���j���[�̕\��
            switch (n){
                case 0:
                    M.print();
                    break;
                case 1:
                    L.print();
                    break;
                case 2:
                    D.print();
                    break;
                case 3:
                    A.print();
                    break;
            }
            System.out.println();
        }
    }
}
