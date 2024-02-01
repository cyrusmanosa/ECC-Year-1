import java.util.Scanner;

public class J2Test13_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.print("誰を召喚しますか？（0：光の妖精、1：闇の妖精、2：炎の妖精、-1：やめる）＞");
            int n = in.nextInt();
            if (n < 0) break;
            ///// 簡潔に ////////
//            switch(n) {
//                default:
//                case 0:
//                    Light light = new Light();
//                    light.intro();
//                    break;
//                case 1:
//                    Darkness dark = new Darkness();
//                    dark.intro();
//                    break;
//                case 2:
//                    Fire fire = new Fire();
//                    fire.intro();
//                    break;
//            }
            ///// 簡潔に ////////
            System.out.println();
        }
        in.close();
    }
}
