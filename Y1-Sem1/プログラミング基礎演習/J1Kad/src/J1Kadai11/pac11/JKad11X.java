package J1Kadai11.pac11;

public class JKad11X {
    public static void main(String[] args) {
        for(int i = 1; i <= 40; i++){
            if ((i % 3 != 0 ) && (i % 5 != 0) ){
                System.out.println(i);
            }else if ((i % 3 == 0) && (i % 5 != 0)){
                System.out.println("Fizz!");
            }else if ((i % 3 != 0) && (i % 5 == 0)){
                System.out.println("Buzz!");
            }else if ((i % 3 == 0) && (i % 5 == 0)){
                System.out.println("FizzBuzz!");
            }
        }
    }
}
