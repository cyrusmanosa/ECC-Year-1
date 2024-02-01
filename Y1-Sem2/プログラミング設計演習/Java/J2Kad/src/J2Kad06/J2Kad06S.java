package J2Kad06;/*
	課題名：J2Kad06S「石取りゲーム完成！」
	作成日：2022/10/17
	作成者：田中太郎
*/
import java.util.Scanner;

public class J2Kad06S {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 説明の表示
        System.out.println("20個ある石を交互に取っていきます。一度に取れる石の数は1-3個です。");
        System.out.println("最後の1つを取った方が負けです。");
        System.out.println();

        // 初期設定
        int	stone = 20;			// 石の数
        BasePlayer[] P = {
            new BasePlayer(),
            new UserPlayer(),
            new CompPlayer(),
            new MasterPlayer()
        };

        System.out.print("先手を選んでください（0：Base、1：User、2：Comp、3：Master）＞ ");
        int FP = in.nextInt();
        P[FP].intro();
        System.out.print("後手を選んでください（0：Base、1：User、2：Comp、3：Master）＞ ");
        int SP = in.nextInt();
        P[SP].intro();

        System.out.println();

        int take;

        while(true) {
            // 先手の手番
            showStone(stone);
            System.out.println("先手：" + P[FP] + "の番です。");
            take = P[FP].takeStone(stone);
            System.out.println(take + "個取りました！");
            stone -= take;
            if (stone <= 0) {
                System.out.println(P[FP] + "の負けです！");
                break;
            }
            System.out.println();

            // 後手の手番
            showStone(stone);
            System.out.println("後手：" + P[SP] + "の番です。");
            take = P[SP].takeStone(stone);
            System.out.println(take + "個取りました！");
            stone -= take;
            if (stone <= 0) {
                System.out.println(P[SP] + "の負けです！");
                break;
            }
            System.out.println();
        }
    }
    public static void showStone(int stone) {
        System.out.print("残り" + stone + "個：");
        while( stone > 0 ) {
            System.out.print("●");
            stone--;
        }
        System.out.println();
    }
}
