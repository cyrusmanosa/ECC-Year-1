package J2Kad28;/*
	課題名：J2Kad28S「FizzBuzz＋わん！（Observer版）」
	作成日：2023/1/30
	作成者：田中太郎
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


