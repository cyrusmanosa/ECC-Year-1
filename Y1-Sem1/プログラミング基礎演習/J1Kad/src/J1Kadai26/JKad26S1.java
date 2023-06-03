package J1Kadai26;

import java.util.Scanner;

public class JKad26S1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //�f���̔���
        boolean isPrime[] = new boolean[101];
        //������false�Ȃ̂őS��true�ɂ���
        for (int i = 0; i< isPrime.length;i++){
            isPrime[i] = true;
        }

        int inNum;

        //�}�C�i�X�̒l�����͂����܂Ŗ������[�v
        while (true){
            System.out.println("���݁A�c���Ă��鐔�F");
            for (int i = 2; i < isPrime.length; i++){
                if ( isPrime[i] ){
                    System.out.print( i + " ");
                }
            }

            System.out.println();
            System.out.print("���̔{�����Ȃ��܂����H");
            inNum = in.nextInt();
            if( inNum <= 0 ){
                break;
            }

            //���͂����i��f������O���ifalse�ɂ���j
            for (int i = 2 ; i < isPrime.length ; i++){
                if( i != inNum && i % inNum == 0 ){
                    isPrime[i] = false;
                }
            }
        }

        System.out.println("�f���͈ȉ��̒ʂ�ł��I");
        for (int i =2; i< isPrime.length;i++){
            if (isPrime[i]){
                System.out.print(i + " ");
            }
        }

    }
}
