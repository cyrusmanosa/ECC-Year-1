package J2Kad02;

public class Account {
    public String name;
    public int accountNumber;
    public int money;
    public int secretNumber;

    public void setData(String n,int a, int m, int s){
        name = n;
        accountNumber = a;
        money = m;
        secretNumber = s;
    }

    public void showData(){
        System.out.println(" ");
        System.out.println("ŒûÀ–¼‹`: " + name);
        System.out.println("ŒûÀ”Ô†: " + accountNumber);
        System.out.println("—a‹àc‚: " + money + "‰~");
    }
}
