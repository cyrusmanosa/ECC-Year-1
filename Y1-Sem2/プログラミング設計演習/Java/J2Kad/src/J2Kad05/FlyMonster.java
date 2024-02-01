package J2Kad05;

public class FlyMonster extends Monster{
    //　コンストラクタ
    FlyMonster(){ System.out.println("FlyMonster クラスのコンストラクタが呼び出されました！"); }

    //追加のメソッド
    public void fly(){
        if ( hp <= 0 ){
            System.out.println("疲れて飛べないよ?");
        }else{
            System.out.println(name + "が飛ぶよ！びゅ?ん!!");
            hp--;
        }
    }
}
