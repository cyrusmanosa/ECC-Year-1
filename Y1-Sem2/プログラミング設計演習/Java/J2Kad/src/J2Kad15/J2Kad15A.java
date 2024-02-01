package J2Kad15;
/*
	課題名：J2Kad15A「例外処理?@まとめ」
	作成日：2022/11/21
	作成者：田中太郎
*/
import java.util.Scanner;

public class J2Kad15A {
    public static void main(String[] args) {
        int [] array = new int [5];
        while (true) {
            System.out.println();
            try {
                Scanner in = new Scanner(System.in);
                System.out.print("割られる数を入力してください＞ ");
                int n = Integer.parseInt(in.next());
                int RD = (int) (Math.random() * 10);
                int ans = n / RD;
                System.out.println(RD + "で割ります！");
                System.out.println("計算結果は" + ans + "です！");
                int RDArray = (int) (Math.random() * 10);
                System.out.println("配列の" + RDArray + "番目に格納します！");
                array[RDArray] = ans;
                System.out.println("処理が正常に行われました！");
            }

            catch ( ArrayIndexOutOfBoundsException e ) {
                System.out.println("配列に格納できません！");
            }

            catch ( ArithmeticException e ) {
                System.out.println("0 で割ります！");
                System.out.println("0 除算が発生しました！");
                break;
            }

            catch ( NumberFormatException e ){
                System.out.println("int 型でない値が入力されました！");
            }

            finally {
                System.out.println("finally ブロックの処理です！");
            }
        }
        System.out.println("終了します！");
    }
}
