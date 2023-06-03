package J1Kadai24;

import java.util.*;
public class JKad24B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("����1����͂��Ă���������");
        int num1 = sc.nextInt();
        System.out.print("����2����͂��Ă���������");
        int num2 = sc.nextInt();
        System.out.println(num1 + "\t" + JKad24D.getBinString(num1)); //�p�V�O��flie��program
        System.out.println(num2 + "\t" + JKad24D.getBinString(num2)); //�p�V�O��flie��program
        String opStr[] = {"AND", " OR", "XOR"};
        System.out.print("���̉��Z�����܂����H�i0�FAND�A1�FOR�A2�FXOR�j��");
        int op = sc.nextInt();
        System.out.println("\t" + JKad24D.getBinString(num1) );
        System.out.println(opStr[op] + "\t" + JKad24D.getBinString(num2) );
        int result = 0;
        switch (op){
            case 0:
                result = num1 & num2;
                break;
            case 1:
                result = num1 | num2;
                break;
            case 2:
                result = num1 ^ num2;
                break;
            default:
        }
        System.out.println("------------");
        System.out.println(" \t" + JKad24D.getBinString(result));
    }
}
