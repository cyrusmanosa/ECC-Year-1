/*
	課題名：J2Kad24X「世界にはばたくECCフーズ！」
	作成日：2023/1/16
	作成者：田中太郎
*/
package J2Kad24.pac24x;

import java.util.Scanner;

public class J2Kad24X {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("世界にはばたくECCフーズ！");
        System.out.println("ただいまM&Aで拡大中！！");

        while (true) {
            System.out.print("どのメニューを表示しますか？（0：ECCドーナツ、1：ECCコーヒー、-1：終了）＞");
            int shop = Integer.parseInt(in.next());
            if (shop < 0) break;

            if (shop == 0) {
                // ECCドーナツ


            } else if (shop == 1) {
                // ECCコーヒー


            }

            System.out.println();
        }
    }
}
