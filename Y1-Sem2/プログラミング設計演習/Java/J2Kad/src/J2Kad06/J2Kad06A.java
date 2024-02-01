package J2Kad06;/*
	課題名：J2Kad06A「妖精の召喚」
	作成日：2022/10/17
	作成者：田中太郎
*/
import java.util.Scanner;

public class J2Kad06A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("妖精を召喚して自己紹介させます！");
        Fairy[] m = new Fairy[3];
        m[0] = new Light();
        m[1] = new Darkness();
        m[2] = new Fire();

        while (true) {
            System.out.print("誰を召喚しますか？（0：光の妖精、1：闇の妖精、2：炎の妖精、-1：やめる）＞ ");
            int choose = in.nextInt();
            if ( choose < 0 ){ break;}
            m[ choose ].intro();
            System.out.println();
        }
    }
}
