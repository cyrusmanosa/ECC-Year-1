package J1Kadai22;

import java.util.*;
public class JKad22X {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("�g�ݍ��킹�����߂���z����͂��Ă��������� ");
        int money = sc.nextInt();
        int round = 0;
        int c;

        for (int i = 0; i <= money/100; i++){
            int moneyA = money;
            moneyA -= 100*i;

            for ( int j = 0; j <= moneyA/50; j++){
                int moneyB = moneyA;
                moneyB -= 50*j;
                c = moneyB/10;
                System.out.println("100�~�d�݁F" + i + "���A50�~�d�݁F" + j + "���A10�~�d�݁F" + c + "��");
                round++;
            }
        }
        System.out.println(money + "�~�ɂȂ�g�ݍ��킹�͑S����" + round + "�ʂ�ł��I");
    }
}
