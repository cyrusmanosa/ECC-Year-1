package Test;

import java.util.*;
public class Winner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sumA = 0;
        int sumB = 0;
        int sumC = 0;

        for (int i = 0; i < 18; i++){
            System.out.print("�v���[��" + ( i + 1 ) + "��@Player �`�̑Ő�: ");
            int scrA = in.nextInt();
            sumA += scrA;
            System.out.print("�v���[��" + ( i + 1 ) + "��@Player B�̑Ő�: ");
            int scrB = in.nextInt();
            sumB += scrB;
            System.out.print("�v���[��" + ( i + 1 ) + "��@Player C�̑Ő�: ");
            int scrC = in.nextInt();
            sumC += scrC;
            System.out.println();
        }
        System.out.println("Player A�̍��v�Ő�:" + sumA + "�v���[��");
        System.out.println("Player B�̍��v�Ő�:" + sumB + "�v���[��");
        System.out.println("Player C�̍��v�Ő�:" + sumC + "�v���[��");


        if ( sumC < sumB ){
            if( sumC < sumA){
                System.out.println("�D����: C");
            }else{
                System.out.println("�D����: A");
            }
        }else{
            if ( sumB < sumA ){
                System.out.println("�D����: B");
            }else{
                System.out.println("�D����: A");
            }
        }
    }
}
