package J2Kad28;
import java.util.ArrayList;import java.util.Scanner;


public class NumberGenerator {
    private ArrayList<Observer> observers = new ArrayList<>();
    public void addObserver(Observer o){ observers.add(o); }
    public void notifyObserver(int i){ for(Observer o : observers){ o.update(i); } }

    public void execute() {
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.print("�ǂ����܂����H�i0�Fgenerate�A-1�F��߂�j��");
            int cmd = Integer.parseInt(in.next());
            if (cmd < 0) break;
            int n = (int)(Math.random() * 100);
            System.out.println(n + "���o�܂����I");
            notifyObserver(n);            // �I�u�U�[�o�[�ւ̒ʒm
            System.out.println();
        }
    }
}// Observer�C���^�[�t�F�C�X

interface Observer{ void update(int n); }

class MaxObserver implements Observer{
    int max = 0;
    @Override
    public void update(int n) {
        if (n > max){
            max = n;
            System.out.println("MaxObserver�F����܂ł̍ő�l�ł��I");
        }
    }
}

class MinObserver implements Observer{
    int min = 100;
    @Override
    public void update(int n) {
        if (n < min){
            min = n;
            System.out.println("MinObserver�F����܂ł̍ŏ��l�ł��I");
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
        System.out.println("AvrObserver�F����܂ł̕��ϒl��" + (double)(sum/count) + "�ł�");
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
        if (judge){ System.out.println("PrimeObserver�F����͑f���ł��I"); }
    }
}