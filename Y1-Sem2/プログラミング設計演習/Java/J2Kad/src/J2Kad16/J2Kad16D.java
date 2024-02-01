package J2Kad16;
/*
	課題名：J2Kad16D「スレッド?@（Threadクラス）」
	作成日：2022/11/24
	作成者：田中太郎
*/
class MyThread extends Thread{
    public void run() {
        for (int i = 0; i < 100; i++) { System.out.println("run: " + i); }
        System.out.println("run: 終了しました！");
    }
}

public class J2Kad16D {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        for ( int i = 0; i < 100; i++){ System.out.println("main: " + i); }
        System.out.println("main: 終了しました！");
    }
}