package J2Kad23.pac23d;

import java.util.Scanner;

public class J2Kad23D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ファミレスECCへようこそ！");
        while (true) {
            System.out.print("どうしますか？（0：単品表示、1：一覧表示、-1：終了）＞");
            int n = Integer.parseInt(in.next());
            if (n < 0) break;

            // メニューの表示
            switch (n) {
                case 0:
                    MenuItem M = new MenuItem("モーニングメニュー", 400);
                    M.printItem();
                    break;
                case 1:
                    MorningMenu N = new MorningMenu();
                    N.printList();
                    break;
            }
            System.out.println();
        }
    }
}
