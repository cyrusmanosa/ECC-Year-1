/*
	課題名：J2Kad22C「ECCソフト株式会社?A（下請けの追加）」
	作成日：2022/12/15
	作成者：田中太郎
*/
package J2Kad22.pac22c;

import java.util.Scanner;
public class J2Kad22C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ECCSoft eccSoft = new ECCSoft();
        while(true) {
            System.out.print("どうしますか？（0：下請けAを使う、1：下請けBを使う、2：下請けCを使う、-1：もういい）＞");
            int n = Integer.parseInt(in.next());
            if (n < 0) break;

            SubContractor ans = null;
            if ( n == 0 ) { ans = new SubA(); }
            else if ( n == 1 ) { ans = new SubB(); }
            else if ( n == 2 ) { ans = new SubC(); }

            eccSoft.setSub(ans);             // 下請けの設定
            eccSoft.work();                   // 元請けへ発注
            System.out.println();
        }
    }
}
// 元請け
class ECCSoft {
    private SubContractor Nsub = null;
    public ECCSoft() {
        System.out.println("信頼と実績のECCソフト株式会社です！");
        System.out.println("どんな課題でも私たちが真摯に解決します！！");
    }
    public void setSub(SubContractor Nsub) { this.Nsub = Nsub; }
    public void work() { Nsub.work();}
}
// 下請け
abstract class SubContractor { public abstract void work();}
// 下請けA
class SubA extends SubContractor { public void work() { System.out.println("下請けA：何とかがんばってみます・・・");}}
// 下請けB
class SubB extends SubContractor { public void work() { System.out.println("下請けB：下請けはつらいなー！"); }}
// 下請けC
class SubC extends SubContractor { public void work() { System.out.println("下請けC：よろこんでお引き受けいたします！"); }}
