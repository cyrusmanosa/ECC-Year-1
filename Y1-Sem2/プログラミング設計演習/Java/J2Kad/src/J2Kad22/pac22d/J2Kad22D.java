/*
	課題名：J2Kad22D「ECCソフト株式会社?@（委譲）」
	作成日：2022/12/15
	作成者：田中太郎
*/
package J2Kad22.pac22d;
import java.util.Scanner;
public class J2Kad22D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ECCSoft eccSoft = new ECCSoft();
        while(true) {
            System.out.print("どうしますか？（0：下請けAを使う、1：下請けBを使う、-1：もういい）＞");
            int n = Integer.parseInt(in.next());
            if (n < 0) break;
            eccSoft.setSubNum(n);             // 下請けの設定
            eccSoft.work();                   // 元請けへ発注
            System.out.println();
            if ( n > 1) break;
        }
    }
}

// 元請け
class ECCSoft {
    private int subNum = 0;         // 下請け番号
    public ECCSoft() {
        System.out.println("信頼と実績のECCソフト株式会社です！");
        System.out.println("どんな課題でも私たちが真摯に解決します！！");
    }
    public void setSubNum(int subNum) { this.subNum = subNum; }
    public void work() {
        SubContractor ans = null;
        if ( subNum == 0 ){
            ans = new SubA();
        }else if ( subNum == 1) {
            ans = new SubB();
        }

        try{
            ans.work();
        } catch (NullPointerException e) {
            System.out.println("あれ？下請けがいないよ?");
        }

    }
}
// 下請け
abstract class SubContractor { public abstract void work();}
class SubA extends SubContractor { public void work() {
        System.out.println("下請けA：何とかがんばってみます・・・");
    }}
class SubB extends SubContractor { public void work() { System.out.println("下請けB：下請けはつらいなー！"); }}
