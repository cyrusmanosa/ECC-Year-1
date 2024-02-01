package J2Kad30;

public class exam21 {
    public static void main(String[] args) {
        int[] num = {50, 21, 87, 13, 91, 1234, 62, 74, 38, 45};
        // 最大値
        int Ans = num[0];
        for (int i = 0; i < num.length; i++){
            if (num[i] > Ans){
                Ans = num[i];
            }
        }
        System.out.println("最大値は" + Ans + "です！");

        // 3を含む数値
        System.out.println(" ");
        System.out.println("3を含む数字を表示します！");
        for (int i = 0; i < num.length; i++){
            Ans = num[i];
            while ( Ans > 0 ){
                int T = Ans % 10;
                if( T == 3){
                    System.out.println(num[i]);
                    break;
                }
                Ans /= 10;
            }
        }

        // 3の倍数
        System.out.println(" ");
        for (int i = 0; i < num.length; i++ ){
            Ans = num[i] % 3;
            switch (Ans){
                case 0:
                    System.out.println("Fizz");break;
                default:
                    System.out.println("あまりは" + Ans + "です！");break;
            }
        }


    }
}
