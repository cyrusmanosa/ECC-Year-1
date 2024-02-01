/*
	課題名：J2Kad22B「スーパーコンピュータECC1000」
	作成日：2022/12/15
	作成者：田中太郎
*/
package J2Kad22.pac22b;

import java.util.Scanner;

public class J2Kad22B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("スーパーコンピュータECC1000を開発した！");
        System.out.println("アルゴリズムをセットすればどんな高度な計算でもできます！！");

        ECC1000 ecc1000 = new ECC1000();

        while(true) {
            System.out.print("計算アルゴリズムをセットしてください（0：Nobita、1：Suneo、2：Dekisugi、3：Sizuka、-1：終了）＞ ");
            int algNum = Integer.parseInt(in.next());
            if (algNum < 0) break;
            // アルゴリズムの選択
            SumAlg P = null;

            switch (algNum){
                case 0: P = new NobitaAlg(); break;
                case 1: P = new SuneoAlg(); break;
                case 2: P = new DekisugiAlg(); break;
                case 3: P = new SizukaAlg(); break;
            }

            // 演算
            ecc1000.setAlg(P);
            ecc1000.sum(10);
            System.out.println();
        }
    }
}
// スーパーコンピュータECC1000
class ECC1000 {
    private  SumAlg alg = null;
    public void setAlg ( SumAlg alg ) { this.alg = alg; }
    public void sum (int n) { alg.sum(n); }
}
