package J1Kadai27;

public class JKad27B {
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
        System.out.println();
    }

    public static void bubbleSort(int[] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length - 1; j++) {
                if (array[i] < array[j]) {
                    int w = array[j];
                    array[j] = array[i];
                    array[i] = w;
                }
            }
            System.out.println();
            showArray(array);
        }
    }
}
