package J2Kad15;
public class Nobita extends Handler {
    public Nobita() {super("�̂ё�");}
    public boolean resolve(int n){
        if ( n > 20) {
            System.out.println(name + "�F���O�ł��E�E�E");
            return false;
        }else{
            System.out.println(name + "�F�����Ή����܂��I");
            return true;
        }
    }
}
