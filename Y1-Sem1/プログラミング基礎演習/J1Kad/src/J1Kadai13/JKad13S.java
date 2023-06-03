package J1Kadai13;

import java.util.Scanner;
class JKad13S {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("�킽���͗ʎq�R���s���[�^ECC �g���s�J����I");

        while (true) {
            System.out.print("���̒i�������Ăق����́H��");
            int a = in.nextInt();

            if ((a >= 1) && (a <= 9)) {
                    for (int i = 1; i <= 9; i++) {
                        int t = a * i;
                        System.out.print(t + "\t");
                    }
                    System.out.println();

            } else if (a > 9) {
                System.out.println("����ȓ���́A�킩��Ȃ���I");
                continue;
            } else {
                System.out.println("����Ȃ�I�I");
                break;
            }
        }
    }
}