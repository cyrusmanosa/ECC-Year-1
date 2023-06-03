package J1Kadai21;

import java.util.*;
public class JKad21X {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("�������鐮���̌�������͂��Ă��������i1~9�j��");
        int num = sc.nextInt();
        if ( num > 9){
            sc.close();
        }
        int fightrange = 1;
        while (true) {
            int [] range = {1,2,3,4,5,6,7,8,9};
            System.out.print(num + "���̐�������͂��Ă�������[" + fightrange + "]��");
            int answer = sc.nextInt();
            if (answer < 0){
                sc.close();
            }
            fightrange++;
            int randomanswer = 0;
            int randowrange = 9;
            int point = 0;
            int max = range.length-1;
            for (int i = 0; i < num; i++) {
                int random = (int) (Math.random() * randowrange);
                for (int j = 0; j < num; j++){
                    int check = (int)((answer / Math.pow(10,j)) % 10);
                    if (check == range[random]){
                        point++;
                    }
                }
                int check = (int)((answer / Math.pow(10,i) )% 10);
                if (check == range[random]){
                    point +=10;
                    point--;
                }

                int ra = (int)(range[random] * Math.pow(10,i));
                randomanswer += ra;
                range[random] = range[max];
                randowrange--;
                max--;
            }
            System.out.println(answer + "......�_����" + point);
            System.out.println(randomanswer);
            if (answer == randomanswer){
                System.out.println(answer + "......�����I");
                break;
            }
        }
        sc.close();
    }
}
