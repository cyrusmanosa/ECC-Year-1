package J1Kadai27;

public class JKad27A {
    public static void main(String[] args) {
        int[] array = new int [20];
        initArray(array);
        showArray(array);
        System.out.println();
        System.out.println("���בւ��܂��I");
        mergeSort(array);
        System.out.println();
        System.out.println("���בւ��܂��I");
        showArray(array);
    }

    public static void initArray(int[] array){
        for(int i = 0; i < array.length; i++){
            int random = (int)(Math.random()*100);
            array[i] = random;
        }
    }

    public static void showArray(int[] array){
        //for �i���g������ϐ��F���̔z��j{}
        for (int j : array) {
            System.out.print(j + "\t");
        }
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
        System.out.println();
    }
    public static void mergeSort(int[] array){
        int[] array1 = new int[array.length/2];
        int[] array2 = new int[array.length/2];

        System.out.println();
        System.out.println("�O������בւ��܂��I");
        for( int i = 0; i < array1.length; i++){
            array1[i] = array[i];
        }
        bubbleSort(array1);

        System.out.println();
        System.out.println("�㔼����בւ��܂��I");
        for (int i = 0; i < array2.length;i++){
            array2[i] = array[array2.length+i];
        }
        bubbleSort(array2);

    }
}
