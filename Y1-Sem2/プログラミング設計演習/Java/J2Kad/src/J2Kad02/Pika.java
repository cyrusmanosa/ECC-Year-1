package J2Kad02;

public class Pika {
    String name = "未設定";    // キャラ名
    int hp = 1;            // 攻撃力
    // メソッド
    public void showInfo(){
        // 情報を表示
        System.out.println("ぼくの名前は" + name + "！ HPは" + hp + "だよ！");
    }
    public void walk(){
        System.out.println("てくてく・・・");
        hp--;
    }
    public void sleep(){
        System.out.println("ぐうぐう・・・");
        hp++;
    }
}
