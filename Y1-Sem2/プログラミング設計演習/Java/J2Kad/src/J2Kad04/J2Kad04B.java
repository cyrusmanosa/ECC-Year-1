package J2Kad04;
/*
    課題名：J2Kad04B
    作成日：2022/10/06
    作成者：田中太郎
 */
import java.util.Scanner;

public class J2Kad04B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ピクミンを探します！");
        while(true) {
            Pikmin.showCount();
            System.out.print("どうしますか？（0：探す、-1：やめる）＞ ");
            int choose = in.nextInt();
            Pikmin[] pikmin = new Pikmin[3];
            if ( choose != 0){break;}
            int RD = (int)(Math.random()*4);
            if ( RD > 0) {
                for (int x = 0; x < RD; x++) { pikmin[x] = new Pikmin(); }
                System.out.println(RD + "匹見つけた！");
            }else{
                System.out.println("見つからなかった！");
            }
            System.out.println(" ");
        }
    }
}
