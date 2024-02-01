package J2Kad05;

/*
	課題名：J2Kad05B「石取りゲームの準備」
	作成日：2022/10/13
	作成者：田中太郎
*/
public class J2Kad05B {
    public static void main(String[] args) {
        System.out.println("石取りゲームの準備をします！");
        System.out.println();

        // BasePlayerの生成
        BasePlayer m = new BasePlayer();
        m.intro();
        System.out.println();
        // UserPlayerの生成
        UserPlayer n = new UserPlayer();
        n.intro();
        System.out.println();
        // BasePlayer VS UserPlayer
        System.out.println(m.toString(m.name)  + "と" + n.name + "が戦います！");

    }
}
