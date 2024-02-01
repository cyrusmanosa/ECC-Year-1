package J2Kad11;

import java.util.Scanner;
public class A123 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("0‚æ‚è‘å‚«‚¢®”‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
        int n = in.nextInt();
        switch (n % 5){
            case 0 :
                System.out.println("5‚ÅŠ„‚èØ‚ê‚Ü‚·");
                break;
            default:
                System.out.println("5‚ÅŠ„‚èØ‚ê‚Ü‚¹‚ñ");
                break;
        }
        in.close();
    }
}
