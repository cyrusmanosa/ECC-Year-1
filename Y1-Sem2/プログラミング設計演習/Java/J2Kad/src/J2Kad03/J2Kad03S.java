package J2Kad03;/*
    課題名：J2Kad03S「3回目のおつかい?@」
    作成日：2022/10/03
    作成者：文家俊
 */
import java.util.*;

public class J2Kad03S {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack Nobita;
        Nobita = new Stack(5);
        System.out.println("のび太がおつかいに行きます!");
        String[] store = {"ECC コーヒー" , "ECC バーガー" , "ECC ドーナツ"};

        if( Nobita.isEmpty() ){ Nobita.push("のび太の家です。"); }

        while(true){
            System.out.print(Nobita.getData(Nobita.size() - 1) + "どこへ行きますか?(0:ECC コーヒー、1:ECC バーガー、2:ECC ドーナツ、-1:戻る)> ");
            int choose = in.nextInt();
            if ( choose < 0) {
                System.out.println("もと来た道を戻ります！");
                while( !Nobita.isEmpty() ) { System.out.println(Nobita.pop() + "に戻ってきた！"); }
                break;
            } else {
                if ( Nobita.isFull()){
                    System.out.println("これ以上進むと帰れないよ?");
                } else {
                    Nobita.push( store[choose] );
                }
            }
        }
    }
}
