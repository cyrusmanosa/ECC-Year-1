package J2Kad16;
/*
	課題名：J2Kad16C「スレッド?A（Runnableインターフェイス）」
	作成日：2022/11/24
	作成者：田中太郎
*/

class SheepRunner extends Sheep implements Runnable{
    public void run(){
        for (int i = 100; i > 0; i--){ System.out.println( this + "：残り" + i + "メートル！");}
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
        System.out.println("おつかれさまでした！");
    }
}
