package J2Kad02;

import java.util.*;
public class J2Kad02S {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Account Nobita;
        Nobita = new Account();
        Nobita.setData("のび太",8905678,100000,1234);
        Account Suneotto;
        Suneotto = new Account();
        Suneotto.setData("スネ夫",8901234,999999,5678);
        System.out.println("そうだ！銀行へ行こう！！");

        while (true) {
            System.out.print("誰が行きますか？（1：のび太、2：スネ夫、-1：誰もいかない）＞ ");
            int People = in.nextInt();
            System.out.println("信頼と実績のECC 銀行へようこそ！");

            if (People == 1) {
                gotoECCBank(Nobita);
            } else if (People == 2) {
                gotoECCBank(Suneotto);
            }else{
                break;
            }

        }
        in.close();
    }

    public static void gotoECCBank(Account account){
        account.showData();
        System.out.print("どうしますか？（1：預ける、2：引き出す、-1：帰る）＞ ");
        int FC = in.nextInt();
        if (FC == 1){
            deposit(account);
        }else if ( FC == 2){
            withdraw(account);
        }else{
            System.out.println("ありがとうございました！");
            System.out.println(" ");
        }

    }
    public static void deposit(Account account){
        System.out.print("いくら預けますか？＞ ");
        int SM = in.nextInt();
        account.money += SM;
        account.showData();
    }
    public static void withdraw(Account account){
        System.out.print("暗証番号を入力してください＞ ");
        int password = in.nextInt();
        if (password != account.secretNumber){
            System.out.println("番号が違います！");
        }else{
            System.out.print("いくら引き出しますか？＞ ");
            int TM = in.nextInt();
            if ( TM > account.money){
                System.out.println("残高不足です！");
            }else{
                account.money -= TM;
                gotoECCBank(account);
            }
        }
    }
}
