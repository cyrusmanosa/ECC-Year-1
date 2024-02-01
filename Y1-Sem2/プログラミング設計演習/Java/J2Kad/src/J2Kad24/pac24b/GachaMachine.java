package J2Kad24.pac24b;
import java.util.Scanner;

public class GachaMachine {
    private GachaState state = new NoCoin();
    private int count = 3;

    public void setState(GachaState newState) { state = newState; }
    public int decCount() { return --count; }
    public void execute() {
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.println("カプセルの残り：" + count);
            showState();
            System.out.println("");
            System.out.print("どうしますか？（0：コインを入れる、1：ハンドルを回す、2：返却ボタンを押す、-1：終わる）＞");
            int cmd = Integer.parseInt(in.next());
            if (cmd < 0) break;
            switch(cmd) {
                case 0: insertCoin();   break;
                case 1: turnHandle();   break;
                case 2: ejectCoin();    break;
            }
        }
    }
    private void showState() {state.showState();}
    private void insertCoin() {state.insertCoin(this);}
    private void turnHandle() {state.turnHandle(this);}
    private void ejectCoin() {state.ejectCoin(this);}
}

// GachaStateインターフェイス
interface GachaState{
    void showState();
    void insertCoin(GachaMachine gm);
    void turnHandle(GachaMachine gm);
    void ejectCoin(GachaMachine gm);
}
// NoCoinクラス
class NoCoin implements GachaState {
    @Override
    public void showState(){System.out.println("コイン：なし");}
    @Override
    public void insertCoin(GachaMachine gm){
        System.out.println("コインを入れました！");
        gm.setState(new HasCoin());
    }
    @Override
    public void turnHandle(GachaMachine gm){System.out.println("ハンドルが回りません！");}
    @Override
    public void ejectCoin(GachaMachine gm){System.out.println("何も起こりません！");}
}
// HasCoinクラス
class HasCoin implements GachaState {
    @Override
    public void showState(){System.out.println("コイン：あり");}
    @Override
    public void insertCoin(GachaMachine gm){System.out.println("これ以上コインが入りません！");}
    @Override
    public void turnHandle(GachaMachine gm){
        System.out.println("カプセルが出ました！");
        gm.decCount();
        gm.setState(new NoCoin());
    }
    @Override
    public void ejectCoin(GachaMachine gm){
        System.out.println("コインを返却しました！");
        gm.setState(new NoCoin());
    }
}
