package J2Kad01;
/*
    課題名：J2Kad01.J2Kad01A「2回目のおつかい」
    作成日：2022/09/26
    作成者：文家俊
 */
public class J2Kad01A {
    static int Hamburger = 200;
    static int donut = 120;
    static int coffee = 350;
    static int money = 1000;
    static String name = "のび太";
    public static void main(String[] args) {
        System.out.println("2回目のおつかい！ ");
        System.out.println(name + "がハンバーガーとドーナツとコーヒーを買いに行きます！");
        showMoney();
        gotoECCBurger();
        gotoECCDonut();
        gotoECCCoffee();
    }

    public static void showMoney(){
        System.out.println("所持金は" + money + "円です。");
    }

    public static void gotoECCBurger(){
        System.out.println("ECCバーガーに着きました");
        System.out.println("ハンバーガー" + Hamburger + "円を買いました");
        money -= Hamburger;
        showMoney();
    }

    public static void gotoECCDonut(){
        System.out.println("ECCドーナツに着きました");
        System.out.println("ドーナツ" + donut + "円を買いました");
        money -= donut;
        showMoney();
    }

    public static void gotoECCCoffee(){
        System.out.println("ECCコーヒーに着きました");
        System.out.println("コーヒー" + coffee + "円を買いました");
        money -= coffee;
        showMoney();
    }
}
