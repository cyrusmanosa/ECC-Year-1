package J2Kad15;

public class Dekisugi extends Handler {
    public Dekisugi() {super("�o�ؐ�");}
    public boolean resolve(int n){
        if (n % 7 != 0 ) {
            System.out.println(name + "�F�����Ή����܂��I");
            return true;
        }else{
            System.out.println(name + "�F���O�ł��E�E�E");
            return false;
        }
    }
}