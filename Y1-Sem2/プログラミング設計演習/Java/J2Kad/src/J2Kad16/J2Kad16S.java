package J2Kad16;
class Animal extends Thread{
    protected String name;
    protected int wait;

    public Animal(String name) { this.name = name; }

    public void run() {
        System.out.println(name + "������܂��I");
        for (int i = 1000; i > 0; i--){
            try{ Thread.sleep(wait); }
            catch ( InterruptedException e ){ System.out.println(e); }
            System.out.println(name + "�F�c��" + i + "���[�g���I");
        }
        System.out.println(name + ":�S�[�����܂����I");
    }
}

class Rabbit2 extends Animal implements Runnable {
    public Rabbit2() {
        super("�E�T�M");
        wait = 0;
    }
}
class Turtle2 extends Animal implements Runnable {
    public Turtle2() {
        super("�J��");
        wait = 10;
    }
}

class Sleepy extends Animal implements Runnable {
    private String msg = "����E�T�M�͒��Q�����I�I";
    private String msg2 = "����E�T�M�͖ڂ��o�܂����I�I";

    public Sleepy() {
        super("����E�T�M");
        wait = 500;
    }

    public void run() {
        System.out.println(name + "������܂��I");
        for (int i = 1000; i > 0; i--) {

            int SC = (int) (Math.random() * 100);

            if (SC == 0) {
                try {
                    System.out.println(msg);
                    Thread.sleep(wait);
                    System.out.println(msg2);
                } catch (InterruptedException e) { System.out.println(e); }
            }
            System.out.println(name + "�F�c��" + i + " ���[�g��");
        }
        System.out.println(name + "�F�S�[�����܂����I");
    }
}

public class J2Kad16S {
    public static void main(String[] args) {
        System.out.println("�E�T�M�ƃJ���Ɩ���E�T�M���������܂��I");
        Animal T2 = new Turtle2();
        Animal R2 = new Rabbit2();
        Animal S = new Sleepy();

        T2.start();

        try{ Thread.sleep(5000); }
        catch ( InterruptedException e ) { System.out.println(e); }

        R2.start();
        S.start();
    }
}