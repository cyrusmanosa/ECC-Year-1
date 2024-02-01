package J2Kad15;

public class Sizuka extends Handler {
    public Sizuka() {super("しずか");}
    public boolean resolve(int n){
        if (n % 2 == 0 ) {
            System.out.println(name + "：私が対応します！");
            return true;
        }else{
            System.out.println(name + "：専門外です・・・");
            return false;
        }
    }
}