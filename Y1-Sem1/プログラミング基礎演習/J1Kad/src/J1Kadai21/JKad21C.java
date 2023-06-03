package J1Kadai21;

import java.util.*;
public class JKad21C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] data = {57300, 25000, 10000, 5000, 100};
        for (int i = 0; i < data.length; i++){
            System.out.println( (i + 1) + "�ʁF" + data[i]);
        }
        System.out.print("���Ȃ��̃X�R�A����͂��Ă���������");
        int input = sc.nextInt();
        for ( int i = 0; i < data.length; i++ ){
            if (data[i] >= input && input >= data[i+1]){
                System.out.println( (i+2) + "�ʂɂȂ�܂��I");
                break;
            }else if ( data[0] < input || input < data[data.length - 1] ){
                System.out.println("�����L���O�O�ł��I");
                break;
            }
        }
    }
}
