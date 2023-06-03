package J1Kadai20;

public class JKad20B {
    public static void main(String[] args) {
        int [] cards = new int[9];
        for (int i = 0 ; i < cards.length; i++) {
            cards[i] = (int)(Math.random()*100);
            System.out.println("cards[" + i + "]�F" + cards[i]);
        }
        System.out.println("�t���ŕ\�����܂��I");
        for (int i = 8 ; i >= 0 ; i--) {
            System.out.println("cards[" + i + "]�F" + cards[i]);
        }
    }
}
