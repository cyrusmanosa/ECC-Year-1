package J2Kad15;
public class Suneo extends Handler{
    public Suneo() {super("スネ夫");}
    public boolean resolve(int n){
        if (n % 3 != 0 ) {
            System.out.println(name + "：専門外です・・・");
            return false;
        }else{
            System.out.println(name + "：私が対応します！");
            return true;
        }
    }
}
