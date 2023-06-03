package J1Kadai20;

import java.util.*;

public class JKad20X {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("�o�u���\�[�g���g���ăJ�[�h�������ɕ��ׂ܂��I");
        System.out.print("�J�[�h�̖�������͂��Ă��������� ");
        int leaf = sc.nextInt();
        int[] cards = new int[leaf];
        for (int i = 0; i < cards.length; i++) {
            cards[i] = (int) (Math.random() * 100);
        }
        showCards(leaf,cards);
    }
    public static void showCards(int leaf, int[] cards) {
        int box;
        int count = (leaf * (leaf - 1) / 2);
        for(int j = 0; j < cards.length; j++){
            for(int k = 1; k < cards.length; k++) {
                if (cards[j] < cards[k]) {
                    box = cards[k];
                    cards[k] = cards[j];
                    cards[j] = box;
                }
            }
        }

        for (int i = 0; i <= count; i++) {
            if (i < 10) {
                System.out.print(" " + i + "���  ");
                for (int j = 0; j < cards.length; j++){
                     System.out.print(cards[j] + " ");
                }
            } else {
                System.out.print(i + "��ځ@");
                for (int j = 0; j < cards.length; j++){
                    System.out.print(cards[j] + " ");
                }
            }
            System.out.println(" ");
        }
    }
}

