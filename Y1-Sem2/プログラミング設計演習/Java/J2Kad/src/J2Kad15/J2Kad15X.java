package J2Kad15;

/*
	課題名：J2Kad15X「ECC苦情処理センター（Chain of Responsibility）」
	作成日：2022/11/21
	作成者：田中太郎
*/
import java.util.Scanner;

public class J2Kad15X {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ここはECC 苦情処理センターです！");
        System.out.println("優秀なスタッフが対応します！");
        Nobita nobita = new Nobita();
        Jaian jaian = new Jaian();
        Suneo suneo = new Suneo();
        Sizuka sizuka = null; // まだいない
        Dekisugi dekisugi = null; // まだいない
        boolean helper = false; // false：応援なし、true：応援あり
        while(true) {
            System.out.println();
            System.out.print("どうしますか？（0：苦情を受け取る、1：応援を頼む、-1：もうやだ）＞");
            int cmd = in.nextInt();
            if (cmd < 0) break;
// 応援を頼む
            if (cmd == 1) {
                sizuka = new Sizuka();
                dekisugi = new Dekisugi();
                helper = true;
                continue;
            }
// 苦情処理
            int n = (int)(Math.random() * 100);
            System.out.println("苦情番号：" + n + "を受け付けた！");
//            if ( cmd == 0) {
//                nobita.setNext(jaian).setNext(suneo);
//            }else if ( cmd == 1){
//                nobita.setNext(jaian).setNext(suneo).setNext(sizuka).setNext(dekisugi);
//            }
            if (!nobita.handle(n)) {
                if (!jaian.handle(n)) {
                    if (!suneo.handle(n)) {
                        if (helper) {
                            if (!sizuka.handle(n)) {
                                dekisugi.handle(n);
                            }
                        }
                    }
                }
            }
        }
        System.out.println("おつかれさまでした！");
    }
}