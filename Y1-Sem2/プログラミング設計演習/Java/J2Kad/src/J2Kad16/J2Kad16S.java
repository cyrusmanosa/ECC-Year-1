package J2Kad16;
class Animal extends Thread{
    protected String name;
    protected int wait;

    public Animal(String name) { this.name = name; }

    public void run() {
        System.out.println(name + "が走ります！");
        for (int i = 1000; i > 0; i--){
            try{ Thread.sleep(wait); }
            catch ( InterruptedException e ){ System.out.println(e); }
            System.out.println(name + "：残り" + i + "メートル！");
        }
        System.out.println(name + ":ゴールしました！");
    }
}

class Rabbit2 extends Animal implements Runnable {
    public Rabbit2() {
        super("ウサギ");
        wait = 0;
    }
}
class Turtle2 extends Animal implements Runnable {
    public Turtle2() {
        super("カメ");
        wait = 10;
    }
}

class Sleepy extends Animal implements Runnable {
    private String msg = "眠りウサギは昼寝した！！";
    private String msg2 = "眠りウサギは目を覚ました！！";

    public Sleepy() {
        super("眠りウサギ");
        wait = 500;
    }

    public void run() {
        System.out.println(name + "が走ります！");
        for (int i = 1000; i > 0; i--) {

            int SC = (int) (Math.random() * 100);

            if (SC == 0) {
                try {
                    System.out.println(msg);
                    Thread.sleep(wait);
                    System.out.println(msg2);
                } catch (InterruptedException e) { System.out.println(e); }
            }
            System.out.println(name + "：残り" + i + " メートル");
        }
        System.out.println(name + "：ゴールしました！");
    }
}

public class J2Kad16S {
    public static void main(String[] args) {
        System.out.println("ウサギとカメと眠りウサギが競争します！");
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