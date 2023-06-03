package J1Kadai24;

import java.util.*;
public class JKad24S {
    public static void main(String[] args) {
        int[][] NUM = new int[3][8];
        Scanner sc = new Scanner(System.in);
        System.out.print("����1����͂��Ă���������");
        int num1 = sc.nextInt();
        System.out.print("����2����͂��Ă���������");
        int num2 = sc.nextInt();
        System.out.println(num1 + "\t" + JKad24D.getBinString(num1)); //�p�V�O��flie��program
        System.out.println(num2 + "\t" + JKad24D.getBinString(num2)); //�p�V�O��flie��program
        String[] opStr = {"0��1", "1��0", "X��X"};
        System.out.print("�������o���܂����H�i0�F0��1�A1�F1��0�A2�F�ω��Ȃ��j��");
        int op = sc.nextInt();
        if ( op < 0 || op > 2){
            System.out.println("�I�����܂��I");
            sc.close();
        }
        System.out.println("\t" + JKad24D.getBinString(num1) );
        System.out.println(opStr[op] + "\t" + JKad24D.getBinString(num2) );
        for (int i = 0; i < 8; i++) {
            NUM[0][7 - i] = (num1 & 0x01);
            num1 >>= 1; // n = n >> 1;
        }
        for (int i = 0; i < 8; i++) {
            NUM[1][7 - i] = (num2 & 0x01);
            num2 >>= 1; // n = n >> 1;
        }
        switch (op){
            case 0:
                for (int j = 7; j >= 0; j--) {
                    if (NUM[0][j]== 0 && NUM[1][j]==1){
                        NUM[2][j] = 1;
                    }else{
                        NUM[2][j] = 0;
                    }
                }
                break;
            case 1:
                for (int j = 7; j >= 0; j--) {
                    if (NUM[0][j] == 1 && NUM[1][j] == 0){
                        NUM[2][j] = 1;
                    }else{
                        NUM[2][j] = 0;
                    }
                }
                break;
            case 2:
                for (int j = 7; j >= 0; j--) {
                    if (NUM[0][j]== NUM[1][j]){
                        NUM[2][j] = 1;
                    }else{
                        NUM[2][j] = 0;
                    }
                }
                break;
        }
        System.out.println("------------");
        System.out.print("\t");
        for (int j = 0; j < 8; j++) {
                System.out.print(NUM[2][j] );
            }
    }
}