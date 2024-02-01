package J2Kad28;

import java.util.ArrayList;

public class FizzBuzz {
    private ArrayList<ObserverArray> observers = new ArrayList<>();
    public void addObserverArray(ObserverArray o){ observers.add(o); }
    public void notifyObserver(int i){for(ObserverArray o : observers){o.update(i);}}
    public void execute() {
        for ( int i = 1; i < 40; i++){
            notifyObserver(i);
            System.out.println();
        }
    }
}

interface ObserverArray{ void update(int i); }

class sanbansuu implements ObserverArray{
    public void update(int i){
        if (i % 3 == 0){System.out.print("Fizz");}
    }
}

class gobansuu implements ObserverArray{
    public void update(int i){
        if (i % 5 == 0){System.out.print("Buzz");}
    }
}

class other implements ObserverArray{
    public void update(int i){
        if (i % 3 != 0 && i % 5 != 0){System.out.print(i);}
    }
}

class san implements ObserverArray{
    public void update(int i){
        while(i > 0){
            if (i % 10 == 3 || i % 3 == 0){ System.out.print(" ÇÌÇÒÅI");break; }
            i /= 10;
        }
    }
}