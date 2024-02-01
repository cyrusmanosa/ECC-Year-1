package J2Kad03;

/*
    課題名：J2Kad03B「アクセサ」
    作成日：2022/10/03
    作成者：文家俊
 */

public class J2Kad03B {
    public static void main(String[] args) {
        Profile Doraemon;
        Doraemon = new Profile("ドラえもん",123.9,123.9);

        Profile Doramichan;
        Doramichan = new Profile("ドラミちゃん",100.0,91.0);

        System.out.println();
        System.out.println( Doraemon.getName() + "のプロフィールです!");
        System.out.println("身長:" + Doraemon.getHeight());
        System.out.println("体重:" + Doraemon.getWeight());

        System.out.println();
        System.out.println( Doramichan.getName() + "のプロフィールです!");
        System.out.println("身長:" + Doramichan.getHeight());
        System.out.println("体重:" + Doramichan.getWeight());

    }
}
