package J2Kad23.pac23a;

import java.util.Scanner;

public class J2Kad23A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ファミレスECCへようこそ！");
        while (true) {
            System.out.print("何のメニューを表示しますか？（0：モーニング、1：ランチ、2：ディナー、3：すべて、-1：終了）＞");
            int n = Integer.parseInt(in.next());
            if (n < 0) break;
            Component A = new AllMenu();
            Component M = new MorningMenu();
            Component L = new LunchMenu();
            Component D = new DinnerMenu();
            // メニューの表示
            switch (n){
                case 0:
                    M.print();
                    break;
                case 1:
                    L.print();
                    break;
                case 2:
                    D.print();
                    break;
                case 3:
                    A.print();
                    break;
            }
            System.out.println();
        }
    }
}
