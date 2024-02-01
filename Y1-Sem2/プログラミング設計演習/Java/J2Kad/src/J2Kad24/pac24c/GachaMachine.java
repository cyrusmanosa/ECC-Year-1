package J2Kad24.pac24c;

import java.util.Scanner;

public class GachaMachine{
    private GachaState state;
    public void setState(GachaState state) { this.state = state; }

    public void execute() {
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.print("どの状態をチェックしますか？（0：NoCoin、1：HasCoin、-1：終わる）＞");
            int n = Integer.parseInt(in.next());
            if (n < 0) break;

            // 選択した状態クラスを生成し、以下の順番で処理を実行する。
            switch (n) {
                case 0 -> state = new NoCoin();
                case 1 -> state = new HasCoin();
            }
            state.showState();
            state.insertCoin(this);
            state.showState();
            state.turnHandle(this);
            state.showState();
            state.ejectCoin(this);
            System.out.println();
        }
    }
}
// GachaStateインターフェイス
interface GachaState{
    void showState();
    void insertCoin(GachaMachine gm);
    void turnHandle(GachaMachine gm);
    void ejectCoin(GachaMachine gm);
}
// NoCoinクラス
class NoCoin implements GachaState{
    @Override
    public void showState(){
        System.out.println("コイン：なし");
    }
    @Override
    public void insertCoin(GachaMachine gm){
        System.out.println("コインを入れました！");
        gm.setState(new HasCoin());
    }
    @Override
    public void turnHandle(GachaMachine gm){
        System.out.println("ハンドルが回りません！");
    }
    @Override
    public void ejectCoin(GachaMachine gm){
        System.out.println("何も起こりません！");
    }
}
// HasCoinクラス
class HasCoin implements GachaState{
    @Override
    public void showState(){
        System.out.println("コイン：あり");
    }
    @Override
    public void insertCoin(GachaMachine gm){
        System.out.println("これ以上コインが入りません！");
    }
    @Override
    public void turnHandle(GachaMachine gm){
        System.out.println("カプセルが出ました！");
        gm.setState(new NoCoin());
    }
    @Override
    public void ejectCoin(GachaMachine gm){
        System.out.println("コインを返却しました！");
        gm.setState(new NoCoin());
    }
}

