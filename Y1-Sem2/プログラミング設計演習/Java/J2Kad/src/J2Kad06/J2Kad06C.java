package J2Kad06;

/*
	課題名：J2Kad?06D「スーパークラスの参照」
	作成日：2022/10/17
	作成者：田中太郎
*/
public class J2Kad06C {
    public static void main(String[] args) {
        Monster[] m = new Monster[3];
        m[0] = new Monster("ピカチュウ");
        m[1] = new FireMonster("ヒトカゲ");
        m[2] = new RockMonster("カブト");
        for(int x = 0; x < 3; x++){
            m[x].intro();
            System.out.println();
        }
    }
}
