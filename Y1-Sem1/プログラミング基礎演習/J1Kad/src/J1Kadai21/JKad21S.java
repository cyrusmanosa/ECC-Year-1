package J1Kadai21;

import java.util.*;
public class JKad21S {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] data = {57300, 25000, 10000, 5000, 100};
        for(;;) {
            for (int i = 0; i < data.length; i++) {
                System.out.println((i + 1) + "�ʁF" + data[i]);
            }
            System.out.print("���Ȃ��̃X�R�A����͂��Ă���������");
            int input = sc.nextInt();
            if (input < 0){
                break;
            }
            if (input < data[data.length-1]){
                continue;
            }

            for (int i = 0 ; i < data.length; i++ ){

                if ( input >= data[i]){
                    for (int j = data.length-1; j > i; j--){
                        data[j] = data[j-1];
                    }
                    data[i] = input;
                    break;
                }

            }

        }
    }
}
