package J2Kad03;

/*
    課題名：J2Kad03C「カプセル化」
    作成日：2022/10/03
    作成者：文家俊
 */

public class J2Kad03C {
    public static void main(String[] args) {
        Monster m1 = new Monster("ピカチュウ", 20);
        m1.showData();
        m1.setName("ゲレゲレ");
        m1.setHp(-1);
        m1.showData();
    }
}