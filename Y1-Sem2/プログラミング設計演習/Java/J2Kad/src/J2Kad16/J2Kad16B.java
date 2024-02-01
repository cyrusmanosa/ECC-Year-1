package J2Kad16;
/*
	課題名：J2Kad16B「そうだ！銀行へ行こう！！（スレッド版）」
	作成日：2022/11/24
	作成者：田中太郎
*/
public class J2Kad16B {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("お金を預けるのなら信用と信頼のECC銀行へ！");
        // 預金者の募集
        Customer[] C = new Customer[100];
        for ( int i = 0 ; i < C.length; i ++) { C[i] = new Customer(); }
        // 預金スタート
        for ( var t : C) { t.start(); }
        // スレッド処理の終了待ち
        for (var t : C) {
            try {
                t.join();
            } catch(InterruptedException e) {
                System.out.println(e);
            }
        }
        // 預金額の表示
        System.out.println("預金額は" + Bank.getMoney() + "円です！");
    }
}
class Bank{
    private static int money = 0;
    public static int getMoney(){ return money; }
    public static synchronized void addOneYen(){ money++; }
}

class Customer extends Thread {
    Customer() { System.out.println("預金者がやってきた！「がんばってお金を預けるぞ！」"); }
    public void run(){
        for (int i = 0 ; i < 10000 ; i++ ) { Bank.addOneYen(); }
    }
}