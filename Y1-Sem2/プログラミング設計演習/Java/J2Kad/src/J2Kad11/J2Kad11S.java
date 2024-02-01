package J2Kad11;/*
	課題名：J2Kad11S「LinkedList」
	作成日：2022/11/07
	作成者：田中太郎
*/

import java.util.Scanner;

public class J2Kad11S {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        while(true) {
            // データの表示
            System.out.print("現在のリスト：");
            System.out.println();
            // コマンド入力
            System.out.print("どうしますか？（0：addFirst、1：addLast、2：removeFirst、3：removeLast、-1：終了）＞");
            int cmd = in.nextInt();
            if (cmd < 0) break;
            System.out.println();
        }
    }
}
