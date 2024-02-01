package J2Kad01;/*
    課題名：J2Kad01.J2Kad01X「スタック！」
    作成日：2022/09/26
    作成者：文家俊
 */
import java.util.*;
public class J2Kad01X {
    static Scanner sc = new Scanner(System.in);
    static int size;
    static int[] stack = new int[10];
    public static void main(String[] args) {
        System.out.println("スタック操作をします！");
        int choose = 0;
        while (choose != -1) {
            System.out.print("どうしますか？（1：push、2：pop、-1：終了）＞ ");
            choose = sc.nextInt();
            if (choose == 1) {
                push();
            }else if (choose == 2){
                pop();
            } else {
                sc.close();
            }
        }
    }

    public static void push() {
        pushData();
    }

    public static void pop() {
        popData();
        size--;
        showData();
    }

    public static void showData(){
        System.out.print("stack：");
        for (int x = 0; x < size; x++){
            System.out.print(stack[x] + " ");
        }
        System.out.println(" ");
    }

    public static void pushData(){
        int newsize = size + 3;
        for (; size < newsize; size++){
            int date = (int)(Math.random()*100);
            stack[size] = date;
        }
        showData();
    }

    public static void popData(){
        System.out.println(stack[size - 1] + "を取り出しました！");
    }
}
