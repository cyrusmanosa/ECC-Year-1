package J1Kadai25;

public class JKad25A {
    public static void main(String[] args) {
        String str1 = new String("ECC Computer");
        String str2 = new String("ECC Computer");
        System.out.println("str1 ��\"ECC Computer\"�ł��I");
        System.out.println("str2 ��\"ECC Computer\"�ł��I");
        System.out.println("==�i��r���Z�q�j�Ŕ�r���܂����I\t" + (str1 == str2) );
        System.out.println("eauqls ���\�b�h�Ŕ�r���܂����I\t" + str1.equals(str2) );
        char ans1 = 0, ans2 = 0;
        for ( int i = 0; i < str1.length(); i++) {
            ans1 = str1.charAt(i);
            ans2 = str2.charAt(i);
        }
        System.out.println("�ꕶ��������΂��Ĕ�r���܂����I\t" + (ans1 == ans2));
    }
}
