package J2Kad15;

public class Jaian extends Handler {
    public Jaian() {super("�W���C�A��");}
    public boolean resolve(int n){
        if ((int)(Math.random() * 4) == 0) {
            System.out.println(name + "�F�����Ή����܂��I");
            return true;
        }else{
            System.out.println(name + "�F���O�ł��E�E�E");
            return false;
        }
    }
}
