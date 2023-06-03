package J1Kadai20;

import java.util.*;
public class JKad20A {
    public static void showCards(int[] cards){
        for (int card : cards) {
            System.out.print(card + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("�J�[�h�̖�������͂��Ă���������");
        int x = sc.nextInt();
        System.out.println("�ŏ��̕��т�\�����܂��I");
        int [] cards = new int[ x ];
        for ( int i = 0 ; i < cards.length ; i++ ){
            cards[ i ] = ( int ) ( Math.random() * 100 );
        }
        showCards( cards );
        System.out.println("�t���ɂ��܂��I");
            for ( int i = 0 ; i < x / 2 ; i++ ) {
                int a = cards[ i ];
                cards[ i ] = cards[ x - 1 - i ];
                cards[ x - 1 - i ] = a;
                showCards( cards );
            }
        }
    }