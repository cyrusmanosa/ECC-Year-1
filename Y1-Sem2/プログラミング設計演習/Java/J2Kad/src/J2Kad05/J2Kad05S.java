package J2Kad05;/*
	課題名：J2Kad05S「最強！MasterPLayer！！」
	作成日：2022/10/13
	作成者：田中太郎
*/
import java.util.Scanner;

public class J2Kad05S {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 説明の表示
        System.out.println("20個ある石を交互に取っていきます。一度に取れる石の数は1-3個です。");
        System.out.println("最後の1つを取った方が負けです。");
        System.out.println();

        // 初期設定
        int	stone = 20;			// 石の数
        // user create
        UserPlayer Uplayer = new UserPlayer();
        Uplayer.intro();

//        BasePlayer Bplayer = new BasePlayer();
//        Bplayer.intro();

        ComPlayer Cplayer = new ComPlayer();
        Cplayer.intro();

        int take;				// 取る石の数
        while(true) {
            // あなたの手番
            showStone(stone);
            System.out.println(Uplayer.name + "の番です。");
            System.out.print("何個取りますか？（1-3）＞");
            take = in.nextInt();
            System.out.println(take + "個取りました！");
            stone -= take;
            if (stone <= 0) {
                System.out.println(Cplayer.name + "の負けです！");
                break;								// while文を抜ける
            }
            System.out.println();

            // CPUの手番
            showStone(stone);
            System.out.println(Cplayer.name + "の番です。");
            take = (int)(Math.random() * 3) + 1;
            System.out.println(take + "個取りました！");
            stone -= take;
            if (stone <= 0) {
                System.out.println(Cplayer.name + "の負けです！");
                break;								// while文を抜ける
            }
            System.out.println();
        }
        in.close();
    }
    public static void showStone(int stone) {
        System.out.print("残り" + stone + "個：");
        while(stone > 0) {
            System.out.print("●");
            stone--;
        }
        System.out.println();
    }
}
