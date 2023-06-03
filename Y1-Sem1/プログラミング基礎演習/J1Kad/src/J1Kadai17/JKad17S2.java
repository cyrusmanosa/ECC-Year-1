package J1Kadai17;

public class JKad17S2 {
    public static boolean isMultiple3(int n){
        System.out.println("1 ????????????????????????"+n);
        if (n % 3 == 0 ){
            System.out.println("3 ??{??????I");
            return true;
        }else{
            System.out.println("3 ??{????????????I");
            return false;
        }
    }
    public static int sumNumber(int n){
        System.out.println("1 ????????????????????????"+n);
        int a = 0;
        int b = 0;
        while (n / 10 == 0){
            a = n % 10;
            n = n / 10;
            b = b + a;
        }
            b += n;
            if ( b % 3 == 0){
                System.out.println("3 ??{??????I");
            }else{
                System.out.println("3 ??{????????????I");
            }
            return a;
    }
    public static void main(String[] args) {
        isMultiple3(1234567890);
        sumNumber(1234567891);
    }
}
