package J2Kad23.pac23b;

import java.util.Scanner;

public class J2Kad23B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ファミレスECCへようこそ！");
        while (true) {
            System.out.print("何のメニューを表示しますか？（0：モーニング、1：ランチ、2：ディナー、-1：終了）＞");
            int n = Integer.parseInt(in.next());
            if (n < 0) break;
            // メニューの表示
            switch (n){
                case 0:
                    Component M = new MorningMenu();
                    M.print();
                    break;
                case 1:
                    Component L = new LunchMenu();
                    L.print();
                    break;
                case 2:
                    Component D = new DinnerMenu();
                    D.print();
                    break;
            }
            System.out.println();
        }
    }
}
