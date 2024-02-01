//import java.util.Scanner;
//
//public class J2Test13_7 {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        while(true) {
//            System.out.println("何に格納しますか？");
//            System.out.print("（0：スタック、1：キュー、-1：終了）＞");
//            int n = in.nextInt();
//            if (n < 0) break;
//
//            IContainer c = (n == 0)? new Stack(): new Queue();
//            System.out.println("データを格納します！");
//            for (int i = 0; i < 3; i++) {
//                int data = (int)(Math.random() * 100);
//                c.push(data);
//                System.out.println("push：" + data);
//            }
//
//            System.out.println("データを取り出します！");
//            while(!c.empty()) {
//                int data = c.pop();
//                System.out.println("pop：" + data);
//            }
//            System.out.println();
//        }
//    }
