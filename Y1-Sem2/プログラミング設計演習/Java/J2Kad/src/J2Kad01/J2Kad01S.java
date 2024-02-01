package J2Kad01;/*
    課題名：J2Kad01.J2Kad01S「そうだ！ECC銀行へ行こう！！」
    作成日：2022/09/26
    作成者：田中太郎
 */
import java.util.*;
public class J2Kad01S {
    static int money = 0;
    static Scanner sc = new Scanner(System.in);
    static final int Mypassword = 1234;
    public static void main(String[] args) {
        System.out.println("そうだ！銀行へ行こう！！");
        System.out.println("信頼と実績のECC 銀行へようこそ！");
        gotoECCBank();
    }

    public static void gotoECCBank() {
        showAccount();
        System.out.print("どうしますか（1：預ける、2：引き出す、-1：帰る）＞ ");
        int input = sc.nextInt();
        if (input == 1) {
            deposit();
        }else if (input == 2){
            withdraw();
        }else if (input <= -1 || input > 2){
            System.out.println("ありがとうございました！");
        }
    }

    public static void showAccount() {
        System.out.println(" ");
        System.out.println("口座名義：のび太");
        System.out.println("口座番号：1234567");
        System.out.println("預金残高：" + money);
    }

    public static void deposit()  {
        System.out.print("いくら預けますか？＞");
        int income = sc.nextInt();
        money += income;
        gotoECCBank();
    }

    public static void withdraw()  {
        System.out.print("暗証番号を入力してください＞");
        int password = sc.nextInt();
        if (password != Mypassword){
            System.out.println("番号が違います！");
            gotoECCBank();
        }
        System.out.print("いくらひきだしますか？　");
        int output = sc.nextInt();
        if (output > money){
            System.out.println("残高不足です！");
        }else{
            money -=output;
        }
        gotoECCBank();
    }
}
