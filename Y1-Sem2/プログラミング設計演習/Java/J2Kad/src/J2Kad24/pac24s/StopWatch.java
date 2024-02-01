package J2Kad24.pac24s;

import java.util.Scanner;

public class StopWatch {
    private StopW state = new Stop();
    private void showState() {state.showState();}
    public void setState(StopW newState) { state = newState; }
    public void execute() {
        Scanner in = new Scanner(System.in);
        while(true) {
            // ��Ԃ̕\��
            showState();
            System.out.print("�ǂ����܂����H�i0�FSTART�A1�FCLEAR�A-1�F�I���j��");
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
    public void showState(){ System.out.println("��ԁF��~��"); }
    public void start(StopWatch sw){
        System.out.println("�v�����n�߂܂��I");
        sw.setState(new Test());
    }
    public void clear(StopWatch sw){System.out.println("�����N����܂���I");}
    public void noAction(StopWatch sw){System.out.println("�~�܂��Ă��܂��E�E�E");}
}
class Test implements StopW {
    public void showState(){ System.out.println("��ԁF�v����"); }
    public void start(StopWatch sw){
        System.out.println("�ꎞ��~���܂��I");
        sw.setState(new Pause());
    }
    public void clear(StopWatch sw){System.out.println("�����N����܂���I");}
    public void noAction(StopWatch sw){System.out.println("�v�����ł��E�E�E");}
}
class Pause implements StopW {
    public void showState(){ System.out.println("��ԁF�ꎞ��~��"); }
    public void start(StopWatch sw){
        System.out.println("�v�����ĊJ���܂��I");
        sw.setState(new Test());
    }
    public void clear(StopWatch sw){
        System.out.println("�^�C�������Z�b�g���Ē�~���܂��I");
        sw.setState(new Stop());
    }
    public void noAction(StopWatch sw){System.out.println("�ꎞ��~���ł��E�E�E");}
}

