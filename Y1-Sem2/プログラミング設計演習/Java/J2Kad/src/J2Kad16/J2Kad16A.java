package J2Kad16;
/*
	�ۑ薼�FJ2Kad16A�u�E�T�Mvs�J���v
	�쐬���F2022/11/24
	�쐬�ҁF�c�����Y
*/
public class J2Kad16A {
    public static void main(String[] args) {
        System.out.println("�E�T�M�ƃJ�����������܂��I");
        Rabbit1 R = new Rabbit1();
        Turtle1 T = new Turtle1();
        T.start();
        try {
            Thread.sleep(5000);
            R.start();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class Rabbit1 extends Thread{
    Rabbit1(){ System.out.println("�E�T�M������Ă���!"); }
    public void run(){
        System.out.println("�E�T�M������܂��I");
        for ( int i = 1000 ; i > 0 ; i -= 10 ) { System.out.println("�E�T�M�F�c��" + i + "���[�g���I"); }
        System.out.println("�E�T�M�F�S�[�����܂����I");
    }
}

class Turtle1 extends Thread{
    Turtle1(){ System.out.println("�J��������Ă����I"); }
    public void run(){
        System.out.println("�J��������܂��I");
        for ( int i = 1000 ; i > 0 ; i -= 10 ){
            System.out.println("�J���F�c��" + i + "���[�g��");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("�J���F�S�[�����܂����I");
    }
}
