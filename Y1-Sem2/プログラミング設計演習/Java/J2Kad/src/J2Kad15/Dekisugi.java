package J2Kad15;

public class Dekisugi extends Handler {
    public Dekisugi() {super("出木杉");}
    public boolean resolve(int n){
        if (n % 7 != 0 ) {
            System.out.println(name + "：私が対応します！");
            return true;
        }else{
            System.out.println(name + "：専門外です・・・");
            return false;
        }
    }
}