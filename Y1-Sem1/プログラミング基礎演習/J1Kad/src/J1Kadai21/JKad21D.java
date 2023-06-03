package J1Kadai21;

public class JKad21D {
    public static void main(String[] args) {
        int[] cards = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int dst = 0; // ����ւ���i�ŏ��͐擪�j
        for (dst = 0; dst < (cards.length - 1); dst++) {
            int rest = cards.length - dst; // �c��J�[�h����
            int src = dst + (int)(Math.random() * rest); // ����ւ���
            // ����ւ�
            if ( cards[dst] < cards[src]) {
                int tmp = cards[dst];
                cards[dst] = cards[src];
                cards[src] = tmp;
                System.out.println(dst + "�Ԗڂ�" + src + "�Ԗڂ����ւ��܂����I");
            }else if(cards[dst] == cards[src]){
                System.out.println("�����J�[�h�Ȃ̂œ���ւ����p�X���܂��I");
            }
        }
        // �\��
        for (int i = 0; i < cards.length; i++) {
            System.out.print(cards[i] + " ");
        }
        System.out.println();
    }
}
