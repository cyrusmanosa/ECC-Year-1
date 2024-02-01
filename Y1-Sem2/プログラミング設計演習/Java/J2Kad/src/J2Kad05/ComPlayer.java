package J2Kad05;

public class ComPlayer extends BasePlayer{
    ComPlayer(){ name = "HAL"; }
    public void intro(){ System.out.println("名前：" + name + "・・・少し強いです。"); }
    public int takeStone(int stone){
        int x = (int)( Math.random() * 3 + 1 );
        switch (stone){
            case 1, 2, 3, 4 -> {return 1; }
            case 6,7,8 -> { return 5; }
            default -> { return x; }
        }
    }
}
