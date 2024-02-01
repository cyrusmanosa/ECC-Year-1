package J2Kad10;

public class CompPlayer extends BasePlayer {
    public CompPlayer() { super("コンピュータ"); }
    public int selectHand() {
        // 実装すること
        int R = (int)(Math.random()*3);
        return R;          // ダミー
    }
}
