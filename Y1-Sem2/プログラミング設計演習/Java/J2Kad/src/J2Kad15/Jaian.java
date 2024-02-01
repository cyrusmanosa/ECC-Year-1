package J2Kad15;

public class Jaian extends Handler {
    public Jaian() {super("ジャイアン");}
    public boolean resolve(int n){
        if ((int)(Math.random() * 4) == 0) {
            System.out.println(name + "：私が対応します！");
            return true;
        }else{
            System.out.println(name + "：専門外です・・・");
            return false;
        }
    }
}
