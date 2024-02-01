package J2Kad24.pac24s;

import java.util.Scanner;

public class StopWatch {
    private StopW state = new Stop();
    private void showState() {state.showState();}
    public void setState(StopW newState) { state = newState; }
    public void execute() {
        Scanner in = new Scanner(System.in);
        while(true) {
            // 状態の表示
            showState();
            System.out.print("どうしますか？（0：START、1：CLEAR、-1：終了）＞");
            int cmd = Integer.parseInt(in.next());
            if (cmd < 0) break;
            switch (cmd) {
                case 0: start(); break;
                case 1: clear(); break;
                default: noAction(); break;
            }
        }
    }
    private void start(){ state.start(this); }
    private void clear(){ state.clear(this); }
    private void noAction(){ state.noAction(this); }
}

interface StopW {
    void showState();
    void start(StopWatch sw);
    void clear(StopWatch sw);
    void noAction(StopWatch sw);
}
class Stop implements StopW {
    public void showState(){ System.out.println("状態：停止中"); }
    public void start(StopWatch sw){
        System.out.println("計測を始めます！");
        sw.setState(new Test());
    }
    public void clear(StopWatch sw){System.out.println("何も起こりません！");}
    public void noAction(StopWatch sw){System.out.println("止まっています・・・");}
}
class Test implements StopW {
    public void showState(){ System.out.println("状態：計測中"); }
    public void start(StopWatch sw){
        System.out.println("一時停止します！");
        sw.setState(new Pause());
    }
    public void clear(StopWatch sw){System.out.println("何も起こりません！");}
    public void noAction(StopWatch sw){System.out.println("計測中です・・・");}
}
class Pause implements StopW {
    public void showState(){ System.out.println("状態：一時停止中"); }
    public void start(StopWatch sw){
        System.out.println("計測を再開します！");
        sw.setState(new Test());
    }
    public void clear(StopWatch sw){
        System.out.println("タイムをリセットして停止します！");
        sw.setState(new Stop());
    }
    public void noAction(StopWatch sw){System.out.println("一時停止中です・・・");}
}

