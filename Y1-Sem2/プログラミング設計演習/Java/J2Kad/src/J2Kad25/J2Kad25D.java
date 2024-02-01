package J2Kad25;
/*
	課題名：J2Kad25D「ECCフーズ（ループの復習）」
	作成日：2023/1/19
	作成者：田中太郎
*/
import java.util.Scanner;
public class J2Kad25D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("世界にはばたくECCフーズ！");
        System.out.println("ただいまM&Aで拡大中！！");
        while (true) {
            System.out.print("どのメニューを表示しますか？（0：ECCコーヒー、1：ECCドーナツ、-1：終了）＞");
            int shop = Integer.parseInt(in.next());
            if (shop < 0) break;
            switch(shop) {
                default:
                case 0:     // ECCコーヒー
                    CafeMenu CM = new CafeMenu();
                    MenuItem[] c = CM.getMenu();
                    for ( int i = 0; c[i] != null ; i++){
                        c[i].print();
                    }
                    break;
                case 1:     // ECCドーナツ
                    DonutMenu DM = new DonutMenu();
                    String[] n = DM.getNames();
                    int[] p = DM.getPrices();
                    for(int i = 0; n[i] != null; i++){
                        MenuItem item = new MenuItem(n[i],p[i]);
                        item.print();
                    }
                    break;
            }
            System.out.println();
        }
    }
}
