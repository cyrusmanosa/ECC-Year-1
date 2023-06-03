package J1Kadai23;

import java.util.Scanner;
public class JKad23D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("���̐�������͂��Ă���������");
        int n = in.nextInt();
        n %= 3;
        switch (n){
            case 0:
                System.out.println("����؂�܂����I");
                break;
            case 1:
                System.out.println("�]���1 �ł��I");
                break;
            case 2:
                System.out.println("�]���2 �ł��I");
                break;
        }
    }
}
