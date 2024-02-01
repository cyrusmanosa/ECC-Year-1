package J2Kad05;

import java.util.Scanner;

public class UserPlayer extends BasePlayer{
    private Scanner in = new Scanner(System.in);
    private int UPstone;

    UserPlayer(){
        System.out.print("あなたの名前を入力してください＞ ");
        name = in.next();
        System.out.println();
    }
    public void intro(){
        System.out.println("名前：" + name + "・・・あなたが操作するプレイヤーです。");
    }
    public int takeStone(int stone){
        UPstone = in.nextInt();
        return UPstone;
    }
}
