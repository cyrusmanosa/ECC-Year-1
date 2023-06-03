package J1Kadai27;

public class JKad27C {
    public static void main(String[] args) {
        int[] array = new int [20];
        initArray(array);
        showArray(array);
        System.out.println();
        System.out.println("���בւ��܂��I");
        bubbleSort(array);
    }

    public static void initArray(int[] array){
        for(int i = 0; i < array.length; i++){
            int random = (int)(Math.random()*100);
            array[i] = random;
        }
    }

    public static void showArray(int[] array){
        for (int j : array) {
            System.out.print(j + "\t");
        }
    }

    public static void bubbleSort(int[] array){
        for (int i = 0; i < array.length - 1; i++){
            if ( array[i] > array[i+1]){
                int w = array[i+1];
                array[i+1] = array[i];
                array[i] = w;
            }
            System.out.println();
            showArray(array);
        }
    }
}
