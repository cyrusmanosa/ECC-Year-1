/*
	課題名：JKad21D0
	作成日：2022/06/23
	作成者：田中太郎
*/
public class JKad21D0 {
    public static void main(String[] args) {
        int[] cards = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        // シャッフル
        int dst = 0;
        while (dst < cards.length - 1) {
            int rest = cards.length - dst;
            int src = dst + (int)(Math.random() * rest);
            // 入れ替え
            int tmp = cards[dst];
            cards[dst] = cards[src];
            cards[src] = tmp;
            System.out.println(dst + "番目と" + src + "番目を入れ替えました！");
            dst++;
        }
        // 表示
        for (int i = 0; i < cards.length; i++) {
            System.out.print(cards[i] + " ");
        }
        System.out.println();
    }
}
