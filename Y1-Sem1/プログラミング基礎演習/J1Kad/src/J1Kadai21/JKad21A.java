package J1Kadai21;

import java.util.*;
public class JKad21A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("�������鐮���̌�������͂��Ă��������i1~9�j��");
        int num = sc.nextInt();
        int [] range = {1,2,3,4,5,6,7,8,9};
        int r = 9;
        int max = range.length-1;
        for (int i = 0; i < num; i++){
            int random = (int)(Math.random()*r);
            System.out.print(range[random]);
            range[random] = range[max];
            r--;
            max--;
        }
    }
}
