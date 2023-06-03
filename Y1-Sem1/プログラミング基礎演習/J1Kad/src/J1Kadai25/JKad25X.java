package J1Kadai25;
import java.util.*;
public class JKad25X {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("�Í������镶����i�p�啶���̂݁j����͂��Ă���������");
        String inStr = in.next();
        System.out.println("�Í������܂��I");
        int p = 7;
        int q = 5;
        int d = 5;
        int n = p * q;
        int e = 5;
        int[] encode = new int[inStr.length()];
        char[] Eng = new char[26];

        for (int i = 0 ; i < Eng.length; i++){
            Eng[i] = inStr.charAt(i);
            encode[i] = (Eng[i] * e ) % n;
            System.out.print(encode[i] + " ");
        }
    }
}
