package J2Kad15;

public class Sizuka extends Handler {
    public Sizuka() {super("������");}
    public boolean resolve(int n){
        if (n % 2 == 0 ) {
            System.out.println(name + "�F�����Ή����܂��I");
            return true;
        }else{
            System.out.println(name + "�F���O�ł��E�E�E");
            return false;
        }
    }
}