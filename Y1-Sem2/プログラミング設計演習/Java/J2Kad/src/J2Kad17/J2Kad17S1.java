package J2Kad17;

/*
	課題名：J2Kad17S1「文字列描画システム?（BigCharクラス）」
	作成日：2022/11/28
	作成者：田中太郎
*/
import java.util.Scanner;

public class J2Kad17S1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Canvas c = new Canvas();
        while(true) {
            System.out.print("文字（英数字）を入力してください（-1：終了）＞");
            String letter = in.next();
            if (letter.equals("-1")) break;

            BigChar bc = new BigChar( letter.charAt(0) );

            c.clear();
            bc.draw(c);
            System.out.println();
            c.show();
        }
    }
}
