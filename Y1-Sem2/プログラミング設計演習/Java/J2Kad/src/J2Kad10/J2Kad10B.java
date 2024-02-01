package J2Kad10;/*
	課題名：J2Kad10C「列挙型?」
	作成日：2022/10/31
	作成者：田中太郎
*/
import java.util.Scanner;

public class J2Kad10B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("じゃんけんをします！");
//      手の紹介

        Janken.Hand[] hands = Janken.Hand.values();
        for(Janken.Hand h : hands){
            System.out.println(h.name + ":" + h.feature);
        }

        while(true) {
            // 手の選択
            System.out.println();
            System.out.print("何をだしますか?(0:グー、1:チョキ、2:パー、-1:終了）＞");
            int user = in.nextInt();
            if (user < 0) break;
            int comp = (int)(Math.random() * 3);

            System.out.println("あなたは" + hands[user].name + "お出した！" );
            System.out.println("コンピュータは" + hands[comp].name + "お出した！");
            System.out.println(Janken.resultTbl[user][comp].msg);
        }
    }
}
