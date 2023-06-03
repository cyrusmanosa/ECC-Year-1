package pac17;

import java.util.*;
public class Jkad17A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("わしはこの世界の王、ECC キングじゃ");
        System.out.println("冒険に出たいという若者はお前か？");
        System.out.print("名は何という？＞");
        String N = in.next();
        System.out.println(N + "は弱そうじゃ");
        String[] RN = {"ボロンゴ" , "プックル" , "チロル" , "ゲレゲレ"};
        int j;
        while (true){
            int i = (int)(Math.random()*4);
            System.out.print(RN[i] + "ルはどうじゃ？");
            int c = in.nextInt();
            j = i;
            if (c == 2) {
                break;
            }
        }

        System.out.println("そうか！" + RN[j] + "を気に入ってもらえたか！");
        System.out.println("行け！ゲレゲレ！！世界の平和を取り戻すのじゃ！");
    }
}
