package J1Kadai27;

public class JKad27D {
    public static void main(String[] args) {
        int[] array = new int [20];
        initArray(array);
        showArray(array);
    }

    public static void initArray(int[] array){
        for(int i = 0; i < array.length; i++){
            int random = (int)(Math.random()*100);
            array[i] = random;
        }
        return;
    }

    public static void showArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + "\t");
        }
    }
}
