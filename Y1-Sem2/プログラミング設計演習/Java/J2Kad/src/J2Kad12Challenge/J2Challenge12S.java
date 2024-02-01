package J2Kad12Challenge;

import java.util.Scanner;

public class J2Challenge12S {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("世界にはばたくECCフーズ！");
        System.out.println("ただいまM&Aで拡大中！！");
        System.out.println();

        while (true) {
            System.out.print("どの店のメニューを表示しますか？（0：ECCドーナツ、1：ECCコーヒー、2：ECCバーガー、-1：終了）＞");
            int n = in.nextInt();
            if (n < 0) break;

            // 作成すること

            System.out.println();
        }
    }
}
