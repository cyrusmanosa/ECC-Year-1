package J2Kad16;
/*
	�ۑ薼�FJ2Kad16C�u�X���b�h?A�iRunnable�C���^�[�t�F�C�X�j�v
	�쐬���F2022/11/24
	�쐬�ҁF�c�����Y
*/

class SheepRunner extends Sheep implements Runnable{
    public void run(){
        for (int i = 100; i > 0; i--){ System.out.println( this + "�F�c��" + i + "���[�g���I");}
    }
}

public class J2Kad16C {
    public static void main(String[] args) {
        SheepRunner S = new SheepRunner();
        Thread T = new Thread(S);
        T.start();
        try{
            T.join();
        } catch ( InterruptedException e ) {
            System.out.println(e);
        }
        System.out.println("�����ꂳ�܂ł����I");
    }
}
