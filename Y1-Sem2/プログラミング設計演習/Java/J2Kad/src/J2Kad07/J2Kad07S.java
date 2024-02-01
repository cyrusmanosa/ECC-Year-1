package J2Kad07;/*
	課題名：J2Kad07A「ECCコーヒー再び！」
	作成日：2022/10/20
	作成者：田中太郎
*/
import java.util.Scanner;

public class J2Kad07S {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ECCコーヒーへようこそ！");
        System.out.println("門外不出のレシピで作るから、おいしいよ！！");
        System.out.println();

        while (true) {
            System.out.print("ご注文は？（0：コーヒー、1；紅茶、2：ココア、3：ゆず茶、-1：店を出る）＞ ");
            int	n = in.nextInt();
            if (n < 0) break;
            switch (n) {
                default:
                case 0:
                    Coffee C = new Coffee();
                    C.execute();
                    break;
                case 1:
                    Tea T = new Tea();
                    T.execute();
                    break;
                case 2:
                    Cocoa CO = new Cocoa();
                    CO.execute();
                    break;
                case 3:
                    Yuzu Y = new Yuzu();
                    Y.execute();
                    break;
            }

            System.out.println("お待たせしました！ごゆっくりどうぞ！");
            System.out.println();
        }

        System.out.println("ありがとうございました！");
    }
}
