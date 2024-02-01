package J2Kad25;

/*
	課題名：J2Kad25B「ECCフーズ（Iteratorパターン）」
	作成日：2023/1/19
	作成者：田中太郎
*/

import java.util.Scanner;

public class J2Kad25B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("世界にはばたくECCフーズ！");
        System.out.println("ただいまM&Aで拡大中！！");

        while (true) {
            System.out.print("どのメニューを表示しますか？（0：ECCコーヒー、1：ECCドーナツ、-1：終了）＞");
            int shop = Integer.parseInt(in.next());
            if (shop < 0) break;
            MenuIterator iterator = null;

            switch(shop) {
                default:
                case 0:     // ECCコーヒー
                    iterator = new CafeMenu().iterator(); //.iterator() <- メソッド
                    break;
                case 1:     // ECCドーナツ
                    iterator = new DonutMenu().iterator(); //.iterator() <- メソッド
                    break;
            }
            // 表示
            while(iterator.hasNext()){ // 次の要素があるか確認
                iterator.next().print(); // 要素の名前と年齢を順番に表示
            }
            System.out.println();
        }
    }
}
