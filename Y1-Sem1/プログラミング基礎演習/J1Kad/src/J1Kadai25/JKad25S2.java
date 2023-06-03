package J1Kadai25;
import java.util.Scanner;

public class JKad25S2 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("������1 ����͂��Ă���������");
        String str1 = in.next();
        System.out.print("������2 ����͂��Ă���������");
        String str2 = in.next();
        String str0;

        for (int i = 0; i < str1.length() - str2.length() ; i++){
            String str;
            str = str1.substring( i , i + str2.length() );

            if( str.equals(str2) ){
                System.out.println("����������������܂����I");
                str0 = str1.substring( 0 , i ) + "[" + str2 + "]" + str1.substring(i + str2.length() );
                System.out.print(str0);
                break;
            }

        }

    }
}