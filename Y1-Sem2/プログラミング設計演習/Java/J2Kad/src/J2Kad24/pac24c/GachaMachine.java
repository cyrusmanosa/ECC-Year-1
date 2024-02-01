package J2Kad24.pac24c;

import java.util.Scanner;

public class GachaMachine{
    private GachaState state;
    public void setState(GachaState state) { this.state = state; }

    public void execute() {
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.print("�ǂ̏�Ԃ��`�F�b�N���܂����H�i0�FNoCoin�A1�FHasCoin�A-1�F�I���j��");
            int n = Integer.parseInt(in.next());
            if (n < 0) break;

            // �I��������ԃN���X�𐶐����A�ȉ��̏��Ԃŏ��������s����B
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
// GachaState�C���^�[�t�F�C�X
interface GachaState{
    void showState();
    void insertCoin(GachaMachine gm);
    void turnHandle(GachaMachine gm);
    void ejectCoin(GachaMachine gm);
}
// NoCoin�N���X
class NoCoin implements GachaState{
    @Override
    public void showState(){
        System.out.println("�R�C���F�Ȃ�");
    }
    @Override
    public void insertCoin(GachaMachine gm){
        System.out.println("�R�C�������܂����I");
        gm.setState(new HasCoin());
    }
    @Override
    public void turnHandle(GachaMachine gm){
        System.out.println("�n���h�������܂���I");
    }
    @Override
    public void ejectCoin(GachaMachine gm){
        System.out.println("�����N����܂���I");
    }
}
// HasCoin�N���X
class HasCoin implements GachaState{
    @Override
    public void showState(){
        System.out.println("�R�C���F����");
    }
    @Override
    public void insertCoin(GachaMachine gm){
        System.out.println("����ȏ�R�C��������܂���I");
    }
    @Override
    public void turnHandle(GachaMachine gm){
        System.out.println("�J�v�Z�����o�܂����I");
        gm.setState(new NoCoin());
    }
    @Override
    public void ejectCoin(GachaMachine gm){
        System.out.println("�R�C����ԋp���܂����I");
        gm.setState(new NoCoin());
    }
}

