package J2Kad16;
/*
	�ۑ薼�FJ2Kad16D�u�X���b�h?@�iThread�N���X�j�v
	�쐬���F2022/11/24
	�쐬�ҁF�c�����Y
*/
class MyThread extends Thread{
    public void run() {
        for (int i = 0; i < 100; i++) { System.out.println("run: " + i); }
        System.out.println("run: �I�����܂����I");
    }
}

public class J2Kad16D {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        for ( int i = 0; i < 100; i++){ System.out.println("main: " + i); }
        System.out.println("main: �I�����܂����I");
    }
}