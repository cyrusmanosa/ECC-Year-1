package J2Kad10;

/*
	課題名：J2Kad10D「ECC長屋、再び！」
	作成日：2022/10/31
	作成者：田中太郎
*/
public class J2Kad10A {
    public static void main(String[] args) {
        // 住人の募集
        System.out.println("メゾンECCの住人を募集します！");
        Sheep[][] maison = new Sheep[3][];
        //0 フロアに３匹分の配列を定義
        for ( int i = 0; i < maison.length; i++) {
            maison[i] = new Sheep[maison.length - i];
            for (int j = 0; j < maison[i].length; j++){
                maison[i][j] = new Sheep();
            }
            System.out.println();
        }

        System.out.println("メゾンECC の住人に自己紹介させます！");

        for ( Sheep[] s : maison){
            for( Sheep j : s) {
                j.intro();
            }
        System.out.println();
        }
    }
}
