package J2Kad02;

import java.util.*;
public class J2Kad02X {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int size = 10;
        Stack s = new Stack();
        s.createStack(size);
        System.out.println("スタック操作をします！");
        while (true) {
            showData(s);
            System.out.print("どうしますか？（1：push、2：pop、-1：終了）＞ ");
            int choose = in.nextInt();
            if ( choose == 1 ){
                pushData(s);
                showData(s);
            }else if ( choose == 2){
                popData(s);
                showData(s);
            }else{
                break;
            }
        }
    }

    public static void showData(Stack s){
        System.out.print("Stack: ");
        for (int x = 0; x < s.i; x++){
            System.out.println(s.getData(x) + " ");
        }
        System.out.println();
    }

    public static void pushData(Stack s){
        for ( int i = 0 ; i < 3 ; i++) {
            if (!s.isFull()) {
                int data = (int) (Math.random()*100);
            }else {
                System.out.println("スタックがいっぱいです！");
            }
        }
    }

    public static void popData(Stack s){
        if (!s.isEmpty()){
            System.out.println("データがありません！");
        }else{
            System.out.println("を取り出しました！");
        }
    }
}
