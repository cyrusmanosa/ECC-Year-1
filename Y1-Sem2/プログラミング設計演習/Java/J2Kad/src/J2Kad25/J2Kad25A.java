package J2Kad25;

/*
	�ۑ薼�FJ2Kad25A�uECC�t�[�Y�iM��A�j�v
	�쐬���F2023/1/19
	�쐬�ҁF�c�����Y
*/

import java.util.Scanner;

public class J2Kad25A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("���E�ɂ͂΂���ECC�t�[�Y�I");
        System.out.println("��������M&A�Ŋg�咆�I�I");

        while (true) {
            System.out.print("�ǂ̃��j���[��\�����܂����H�i0�FECC�R�[�q�[�A1�FECC�h�[�i�c�A2�FECC�o�[�K�[�A-1�F�I���j��");
            int shop = Integer.parseInt(in.next());
            if (shop < 0) break;
            MenuIterator iterator = null;
            switch(shop) {
                default:
                case 0:     // ECC�R�[�q�[
                    iterator = new CafeMenu().iterator(); //.iterator() <- ���\�b�h
                    break;
                case 1:     // ECC�h�[�i�c
                    iterator = new DonutMenu().iterator(); //.iterator() <- ���\�b�h
                    break;
                case 2:
                    iterator = new BurgerMenu().iterator(); //.iterator() <- ���\�b�h
                    break;
            }
            while(iterator.hasNext()){ // ���̗v�f�����邩�m�F
                iterator.next().print(); // �v�f�̖��O�ƔN������Ԃɕ\��
            }
            System.out.println();
        }
    }
}
