package J2Kad15;

/*
	課題名：J2Kad15S「ECC苦情処理センター（開設準備室）」
	作成日：2022/11/21
	作成者：田中太郎
*/
import java.util.Scanner;

public class J2Kad15S {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ECC苦情処理センター開設準備室です！");
        System.out.println("苦情処理のシミュレーションを行います！");

        Nobita nobita = new Nobita();
        Jaian jaian = new Jaian();
        Suneo suneo = new Suneo();

        int nobitaOK = 0;
        int jaianOK = 0;
        int suneoOK = 0;

        for (int i = 0; i < 100; i++) {
            System.out.println("苦情番号：" + i + "を受け付けた！");
            if (nobita.handle(i)) nobitaOK++;
            if (jaian.handle(i)) jaianOK++;
            if (suneo.handle(i)) suneoOK++;
            System.out.println();
        }

        System.out.println("それぞれが対応した回数は");
        System.out.println(nobita + "：" + nobitaOK + "回");
        System.out.println(jaian + "：" + jaianOK + "回");
        System.out.println(suneo + "：" + suneoOK + "回");
    }
}
