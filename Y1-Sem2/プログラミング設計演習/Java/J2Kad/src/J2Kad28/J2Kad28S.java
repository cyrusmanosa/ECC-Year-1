package J2Kad28;/*
	�ۑ薼�FJ2Kad28S�uFizzBuzz�{���I�iObserver�Łj�v
	�쐬���F2023/1/30
	�쐬�ҁF�c�����Y
*/

public class J2Kad28S {
    public static void main(String[] args) {
        FizzBuzz n = new FizzBuzz();
        n.addObserverArray(new sanbansuu());
        n.addObserverArray(new gobansuu());
        n.addObserverArray(new other());
        n.addObserverArray(new san());
        n.execute();
    }
}


