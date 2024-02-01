package J2Kad05;

public class SwimMonster extends Monster {

    SwimMonster(){ System.out.println("SwimMonster クラスのコンストラクタが呼び出されました！」"); }

    public void swim(){
        if (hp <= 0){
            System.out.println("疲れて泳げないよ?");
        }else{
            System.out.println(name + "が泳ぐよ！ぶくぶく･･･");
            hp--;
        }
    }

    public void walk(){
        System.out.println("尾びれだと歩けないよ?");
    }

    public void intro(){
        // スーパークラスであるMonsterクラスのintro()を呼ぶ
        super.intro();
        System.out.println("泳ぎも得意さ！");
    }
}
