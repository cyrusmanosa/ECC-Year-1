package J2Kad02;

public class J2Kad02D1 {
    public static void main(String[] args) {
        Pika pikachiu;
        pikachiu = new Pika();
        pikachiu.name = "ピカチュウ"; // 名前を設定
        pikachiu.hp = 20; // 攻撃力を設定

        System.out.println(" ");
        System.out.println(pikachiu.name + "が現れた！");

        pikachiu.showInfo();// 基本情報を表示
        System.out.println(pikachiu.name + "を散歩させます！");
        pikachiu.walk();
        pikachiu.walk();
        pikachiu.walk();
        pikachiu.showInfo();
        System.out.println(pikachiu.name + "を眠らせます！");
        pikachiu.sleep();
        pikachiu.sleep();
        pikachiu.sleep();
        pikachiu.showInfo();
    }
}
