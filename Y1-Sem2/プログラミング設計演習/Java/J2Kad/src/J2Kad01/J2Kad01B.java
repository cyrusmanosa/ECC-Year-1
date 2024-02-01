package J2Kad01;/*
    課題名：J2Kad01.J2Kad01B「ライチュウ現る！」
    作成日：2022/09/26
    作成者：文家俊
 */
import java.util.*;
public class J2Kad01B {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        J2Kad01C.name ="ピカチュウ";
        J2Kad01C.hp = 20;
        J2Kad01C.showData();
        System.out.println(J2Kad01C.name + "が進化した！！");
        J2Kad01C.name ="ライチュウ";
        J2Kad01C.hp = 40;
        J2Kad01C.showData();

        System.out.print("どうしますか？（1：散歩する、2：眠る、-1：終了）＞ ");
        int x = in.nextInt();

        while(x != -1){
            if ( x == 1){
                J2Kad01C.walk();
            }else if (x == 2){
                J2Kad01C.sleep();
            }
            J2Kad01C.showData();
            System.out.print("どうしますか？（1：散歩する、2：眠る、-1：終了）＞ ");
            x = in.nextInt();

        }
    }
}
