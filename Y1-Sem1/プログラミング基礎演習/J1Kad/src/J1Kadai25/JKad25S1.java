package J1Kadai25;

import java.util.*;
public class JKad25S1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("�p�P�����͂��Ă���������");
        String inStr = in.next();
        int Out = 0;
        for (char Eng = 'A'; Eng <= 'Z';Eng++){
            int num = 0;
            Out = 0;

            for (int i = 0; i < inStr.length(); i++) {
                char Check = inStr.charAt(i);
                if ( Check == Eng || Check == Eng + 32){
                    num++;
                }

                if ( Check < 65 || Check > 122){
                    Out++;
                }

            }
            System.out.print(Eng + ":\t" + num);
            System.out.println();
        }
        System.out.println("���̑��F" + Out);
    }
}