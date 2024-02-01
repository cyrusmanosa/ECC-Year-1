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
            System.out.println("�J�v�Z���̎c��F" + count);
            showState();
            System.out.println("");
            System.out.print("�ǂ����܂����H�i0�F�R�C��������A1�F�n���h�����񂷁A2�F�ԋp�{�^���������A-1�F�I���j��");
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

// GachaState�C���^�[�t�F�C�X
interface GachaState{
    void showState();
    void insertCoin(GachaMachine gm);
    void turnHandle(GachaMachine gm);
    void ejectCoin(GachaMachine gm);
}
// NoCoin�N���X
class NoCoin implements GachaState {
    @Override
    public void showState(){System.out.println("�R�C���F�Ȃ�");}
    @Override
    public void insertCoin(GachaMachine gm){
        System.out.println("�R�C�������܂����I");
        gm.setState(new HasCoin());
    }
    @Override
    public void turnHandle(GachaMachine gm){System.out.println("�n���h�������܂���I");}
    @Override
    public void ejectCoin(GachaMachine gm){System.out.println("�����N����܂���I");}
}
// HasCoin�N���X
class HasCoin implements GachaState {
    @Override
    public void showState(){System.out.println("�R�C���F����");}
    @Override
    public void insertCoin(GachaMachine gm){System.out.println("����ȏ�R�C��������܂���I");}
    @Override
    public void turnHandle(GachaMachine gm){
        System.out.println("�J�v�Z�����o�܂����I");
        gm.decCount();
        gm.setState(new NoCoin());
    }
    @Override
    public void ejectCoin(GachaMachine gm){
        System.out.println("�R�C����ԋp���܂����I");
        gm.setState(new NoCoin());
    }
}
