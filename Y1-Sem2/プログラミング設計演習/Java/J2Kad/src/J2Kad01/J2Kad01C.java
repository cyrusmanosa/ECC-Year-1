package J2Kad01;

/*
    課題名：J2Kad01.J2Kad01C「ピカチュウ現る！」
    作成日：2022/09/26
    作成者：文家俊
 */
public class J2Kad01C {
    static String name;
    static int hp;
    public static void main(String[] args) {
        name = "ピカチュウ";
        hp = 20;
        showData();
        walk();
        walk();
        walk();
        showData();
        sleep();
        sleep();
        sleep();
        showData();
    }

    public static void showData(){
        System.out.println("ぼくの名前は" + name + "！HPは" + hp + "だよ！");
    }

    public static void walk(){
        System.out.println("てくてく・・・");
        hp--;
    }
    public static void sleep(){
        System.out.println("ぐうぐう・・・");
        hp++;
    }
}
