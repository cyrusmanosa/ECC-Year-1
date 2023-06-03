package J1Kadai14;

public class JKad14C1 {
    public static void main(String[] args) {
        System.out.println("�͂��߂Ă̂������I");
        System.out.println("�̂ё����P�[�L�𔃂��ɍs���܂��I");
        gotoPark(1);
        gotoPostOffice(1);
        gotoBank(1);
        gotoCakeShop();
        gotoBank(0);
        gotoPostOffice(0);
        gotoPark(0);
        System.out.println("�����߂��Ă��܂����I");
    }
    public static void gotoPark(int x){
         String a = "�����ɒ����܂����I";
         String b = "�����ɖ߂��Ă��܂����I";
         if (x == 1){
             System.out.println(a);
         }else{
             System.out.println(b);
         }
    }
    public static void gotoPostOffice(int x) {
        String a = "�X�֋ǂɒ����܂����I";
        String b = "�X�֋ǂɖ߂��Ă��܂����I";
        if (x == 1){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
    public static void gotoBank(int x){
        String a = "��s�ɒ����܂����I";
        String b = "��s�ɖ߂��Ă��܂����I";
        if (x == 1){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
    public static void gotoCakeShop(){
        System.out.println("�P�[�L���ɒ����܂����I");
        System.out.println("*** �P�[�L�𔃂��܂����I ***");
        System.out.println("�߂�܂��I");
    }
}
