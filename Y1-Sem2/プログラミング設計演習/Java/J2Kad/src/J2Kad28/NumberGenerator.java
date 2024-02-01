package J2Kad28;
import java.util.ArrayList;import java.util.Scanner;


public class NumberGenerator {
    private ArrayList<Observer> observers = new ArrayList<>();
    public void addObserver(Observer o){ observers.add(o); }
    public void notifyObserver(int i){ for(Observer o : observers){ o.update(i); } }

    public void execute() {
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.print("どうしますか？（0：generate、-1：やめる）＞");
            int cmd = Integer.parseInt(in.next());
            if (cmd < 0) break;
            int n = (int)(Math.random() * 100);
            System.out.println(n + "が出ました！");
            notifyObserver(n);            // オブザーバーへの通知
            System.out.println();
        }
    }
}// Observerインターフェイス

interface Observer{ void update(int n); }

class MaxObserver implements Observer{
    int max = 0;
    @Override
    public void update(int n) {
        if (n > max){
            max = n;
            System.out.println("MaxObserver：これまでの最大値です！");
        }
    }
}

class MinObserver implements Observer{
    int min = 100;
    @Override
    public void update(int n) {
        if (n < min){
            min = n;
            System.out.println("MinObserver：これまでの最小値です！");
        }
    }
}

class AvrObserver implements Observer{
    int count =0;
    int sum = 0;
    @Override
    public void update(int n) {
        ++count;
        sum = n + sum;
        System.out.println("AvrObserver：これまでの平均値は" + (double)(sum/count) + "です");
    }
}

class PrimeObserver implements Observer{
    boolean judge = true;
    @Override
    public void update(int n) {
        for(int i = 2; i < n; i++) {
            if (n % i == 0) {
                judge = false;
                break;
            }else{
                judge = true;
            }
        }
        if (judge){ System.out.println("PrimeObserver：これは素数です！"); }
    }
}