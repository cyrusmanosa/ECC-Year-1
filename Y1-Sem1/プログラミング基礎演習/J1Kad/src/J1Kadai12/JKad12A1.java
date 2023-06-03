package J1Kadai12;

import java.util.Scanner;
class JKad12A1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("�ЂƂ߂̐�������͂��Ă���������");
        int a = in.nextInt();
        System.out.print("�ӂ��߂̐�������͂��Ă���������");
        int b = in.nextInt();
        int i;
        if( a < b ){
            i = a;
            a = b;
            b = i;
        }
        int c = a - b;
        while( c != 0 ) {
            a = b;
            b = c;
            c = a - b;
            if ( b < c ) {
                break;
            }
        }
        System.out.println("�ő���� = " + b );
    }

}