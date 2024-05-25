package Test;

import java.util.*;
public class Winner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sumA = 0;
        int sumB = 0;
        int sumC = 0;

        for (int i = 0; i < 18; i++){
            System.out.print("プレーヤ" + ( i + 1 ) + "回　Player Ａの打数: ");
            int scrA = in.nextInt();
            sumA += scrA;
            System.out.print("プレーヤ" + ( i + 1 ) + "回　Player Bの打数: ");
            int scrB = in.nextInt();
            sumB += scrB;
            System.out.print("プレーヤ" + ( i + 1 ) + "回　Player Cの打数: ");
            int scrC = in.nextInt();
            sumC += scrC;
            System.out.println();
        }
        System.out.println("Player Aの合計打数:" + sumA + "プレーヤ");
        System.out.println("Player Bの合計打数:" + sumB + "プレーヤ");
        System.out.println("Player Cの合計打数:" + sumC + "プレーヤ");


        if ( sumC < sumB ){
            if( sumC < sumA){
                System.out.println("優勝者: C");
            }else{
                System.out.println("優勝者: A");
            }
        }else{
            if ( sumB < sumA ){
                System.out.println("優勝者: B");
            }else{
                System.out.println("優勝者: A");
            }
        }
    }
}
