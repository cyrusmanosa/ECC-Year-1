package J2Kad15;

/*
	課題名：J2Kad15D「例外処理?@（try～catch）」
	作成日：2022/11/21
	作成者：田中太郎
*/
import java.util.Scanner;
import java.util.InputMismatchException;

public class J2Kad15D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("整数1を入力してください＞");
            int n1 = in.nextInt();
            System.out.print("整数2を入力してください＞");
            int n2 = in.nextInt();
            div(n1, n2);

        } catch (InputMismatchException | ArrayIndexOutOfBoundsException | NumberFormatException e ){
            System.out.println(e);
        }
    }

    public static void div(int n1,int n2) {
        try {
            System.out.println(n1 + "÷" + n2 + "を計算します！");
            int ans = n1 / n2;
            System.out.println("計算結果は" + ans + "です！");
        } catch ( ArithmeticException c ) {
            System.out.println(c);
        } catch (Exception e){
            System.out.println(e);
        } finally {
            System.out.println("例外が発生しました！");
        }
    }
}
