package J2Kad07;/*
	課題名：J2Kad07D「RPGキャラクター」
	作成日：2022/10/20
	作成者：田中太郎
*/
import java.util.Scanner;

public class J2Kad07B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(true) {
            System.out.print("ジョブを選んでください（0：戦士、1：魔法使い、2：モンク、3：盗賊、-1：終了）＞ ");
            int job = in.nextInt();
            if (job < 0) break;

            switch(job) {
                default:
                case 0: // Fighter
                    Fighter f = new Fighter();
                    f.attack();
                    f.defend();
                    f.useItem();
                    break;
                case 1: // Mage
                    Mage m = new Mage();
                    m.attack();
                    m.defend();
                    m.useItem();
                    break;
                case 2:
                    Monk n = new Monk();
                    n.attack();
                    n.defend();
                    n.useItem();
                    break;
                case 3:
                    Thief T = new Thief();
                    T.callAllMethod();
                    T.steal();
            }

            System.out.println();
        }
    }
}
