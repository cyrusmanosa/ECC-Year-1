package J2Kad01;

/*
    課題名：J2Kad01.J2Kad01D1「ローカル変数」
    作成日：2022/09/26
    作成者：文家俊
 */
public class J2Kad01D1 {
    public static void main(String[] args) {
        int x = 10;
        add5(x);
        add5(x);
        add5(x);
        System.out.println("X:" + x);
    }

    public static void add5(int x) {
            System.out.println("xに5を足しました!");
            x +=5;
    }
}
