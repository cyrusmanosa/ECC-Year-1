package J2Kad02;

import java.util.*;
public class J2Kad02A {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Monster pikachiu;
        pikachiu = new Monster();

        Monster Iwanko;
        Iwanko = new Monster();

        pikachiu.setData("ピカチュウ", (int)(Math.random()*20 + 10));
        System.out.println(pikachiu.name + "が現れた！");
        pikachiu.showData();

        Iwanko.setData("イワンコ", (int)(Math.random()*20 + 10));
        System.out.println(Iwanko.name + "が現れた！");
        Iwanko.showData();

        while(true) {
            System.out.print("どのモンスターを使いますか？（1：ピカチュウ、2：イワンコ、-1：やめる）＞ ");
            int FC = in.nextInt();

            if (FC == 1) {
                useMonster(pikachiu);
            } else if (FC == 2) {
                useMonster(Iwanko);
            } else {
                break;
            }
        }
    }
    public static void useMonster(Monster m){
        m.showData();
        while(true) {
            System.out.print("1：散歩する、2：眠る、-1：やめる> ");
            int SC = in.nextInt();
            if (SC == 1) {
                m.walk();
                m.showData();
            } else if (SC == 2) {
                m.sleep();
                m.showData();
            }else{
                break;
            }
        }
    }
}
