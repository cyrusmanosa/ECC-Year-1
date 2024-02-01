package J2Kad06;

/*
	課題名：J2Kad06X「直線描画のアルゴリズム」
	作成日：2022/10/17
	作成者：田中太郎
*/
public class J2Kad06X {
    public static void main(String[] args) {
        Canvas c = new Canvas(40, 20);
        // 三角形の描画
        c.reset(20,2);
        c.set(20,2);
        c.drawLine(10,17,30,17);
        // 表示
        c.show();
    }
}
