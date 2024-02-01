package J2Kad15;
public class Nobita extends Handler {
    public Nobita() {super("のび太");}
    public boolean resolve(int n){
        if ( n > 20) {
            System.out.println(name + "：専門外です・・・");
            return false;
        }else{
            System.out.println(name + "：私が対応します！");
            return true;
        }
    }
}
