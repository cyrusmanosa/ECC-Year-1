package J2Kad02;

public class J2Kad02D2 {
    public static void main(String[] args) {
        Pika yadon;
        yadon = new Pika();
        yadon.name = "ヤドン"; // 名前を設定
        yadon.hp = 30; // 攻撃力を設定

        System.out.println(" ");
        System.out.println(yadon.name + "が現れた！");

        yadon.showInfo();// 基本情報を表示
        System.out.println(yadon.name + "を散歩させます！");
        yadon.walk();
        yadon.walk();
        yadon.walk();
        yadon.showInfo();
        System.out.println(yadon.name + "を眠らせます！");
        yadon.sleep();
        yadon.sleep();
        yadon.sleep();
        yadon.showInfo();
    }
}

