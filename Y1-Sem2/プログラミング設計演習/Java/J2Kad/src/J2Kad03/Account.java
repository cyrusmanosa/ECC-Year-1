package J2Kad03;

public class Account {
    private String name;
    private int accountNumber;
    private int money;
    private int secretNumber;

    public Account(String name, int accountNumber, int money, int secretNumber){
        this.name = name;
        this.accountNumber = accountNumber;
        this.money = money;
        this.secretNumber = secretNumber;
    }

    public String getName(){
        return name;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public int money(){
        return money;
    }
    public void addMoney(int money){
        this.money += money;
    }
    public boolean subMoney(int money){
        if ( this.money < money ){
            return false;
        }else {
            this.money -= money;
            return true;
        }
    }
    public boolean checkSecretNumber(int secretNumber){
        if ( secretNumber != this.secretNumber ) {
            return false;
        }else{
            return true;
        }
    }
}
