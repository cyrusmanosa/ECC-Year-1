package J2Kad30;

import java.util.Scanner;

public class ECCCinema {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Window[] w = { new Window(), new Window(), new Window()};
        while(true) {
            System.out.print("何番の窓口で購入しますか？＞");
            int n = Integer.parseInt(in.next());
            if (n < 0) break;
            w[n].issueTicket();
        }
    }
}

// 発券機
class TicketMaker {
    private int ticket = 0;
    private TicketMaker(){ getInstance(); }
    private static TicketMaker instance = new TicketMaker();
    public static TicketMaker getInstance(){ return  instance; }
    public int next() { return ++ticket; }
}
// 窓口
class Window {
    public void issueTicket() {
        System.out.println("あなたの座席番号は" + TicketMaker.getInstance().next() + "番です。");
    }
}