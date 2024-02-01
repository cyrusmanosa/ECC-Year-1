package J2Kad23.pac23c;

import java.util.Scanner;

public class J2Kad23C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ファミレスECCへようこそ！");
        while (true) {
            System.out.print("どうしますか？（0：単品表示、1：一覧表示、-1：終了）＞");
            int n = Integer.parseInt(in.next());
            if (n < 0) break;

            // メニューの表示
            switch (n){
                case 0:
                    Component M = new MenuItem("モーニングセット",400);
                    M.print();
                    break;
                case 1:
                    Component N = new MorningMenu();
                    N.print();
                    break;
            }
            System.out.println();
        }
    }
}
