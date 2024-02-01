package J2Kad06;/*
	課題名：J2Kad06B「モンスターを探せ！」
	作成日：2022/10/17
	作成者：田中太郎
*/
import java.util.Scanner;

public class J2Kad06B {
    public static void main(String[] args) {
        Monster[] m = new Monster[3];
        m[0] = new Monster("ピカチュウ");
        m[1] = new FireMonster("ヒトカゲ");
        m[2] = new RockMonster("カブト");

        Scanner in = new Scanner(System.in);
        System.out.println("モンスターを探します！");

        while(true) {
            System.out.print("どうしますか？（0：探す、-1：やめる）＞");
            int cmd = in.nextInt();
            if (cmd < 0) break;
            int ran = (int)( Math.random() * 3 );
            m[ran].intro();
            System.out.println();
        }
    }
}
