package J2Kad01;

/*
    課題名：J2Kad01.J2Kad01D2「フィールド」
    作成日：2022/09/26
    作成者：文家俊
 */
public class J2Kad01D2 {
    static int x = 10;

    public static void main(String[] args) {
        add5();
        add5();
        add5();
        System.out.println("X:" + x);
    }

    public static void add5() {
        x +=5;
        System.out.println("xに５を足しました！");
    }
}
