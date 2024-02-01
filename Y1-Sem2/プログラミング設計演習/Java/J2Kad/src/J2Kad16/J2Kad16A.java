package J2Kad16;
/*
	課題名：J2Kad16A「ウサギvsカメ」
	作成日：2022/11/24
	作成者：田中太郎
*/
public class J2Kad16A {
    public static void main(String[] args) {
        System.out.println("ウサギとカメが競争します！");
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
    Rabbit1(){ System.out.println("ウサギがやってきた!"); }
    public void run(){
        System.out.println("ウサギが走ります！");
        for ( int i = 1000 ; i > 0 ; i -= 10 ) { System.out.println("ウサギ：残り" + i + "メートル！"); }
        System.out.println("ウサギ：ゴールしました！");
    }
}

class Turtle1 extends Thread{
    Turtle1(){ System.out.println("カメがやってきた！"); }
    public void run(){
        System.out.println("カメが走ります！");
        for ( int i = 1000 ; i > 0 ; i -= 10 ){
            System.out.println("カメ：残り" + i + "メートル");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("カメ：ゴールしました！");
    }
}
