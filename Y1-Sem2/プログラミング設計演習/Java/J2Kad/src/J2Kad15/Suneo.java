package J2Kad15;
public class Suneo extends Handler{
    public Suneo() {super("�X�l�v");}
    public boolean resolve(int n){
        if (n % 3 != 0 ) {
            System.out.println(name + "�F���O�ł��E�E�E");
            return false;
        }else{
            System.out.println(name + "�F�����Ή����܂��I");
            return true;
        }
    }
}
