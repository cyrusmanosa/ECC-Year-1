package J1Kadai27;

public class JKad27S {
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
        System.out.println();
    }
    public static void mergeSort(int[] array){
        int[] a1 = new int[array.length/2];
        int[] a2 = new int[array.length/2];

        System.out.println();
        System.out.println("�O������בւ��܂��I");
        for( int i = 0; i < a1.length; i++){
            a1[i] = array[i];
        }
        bubbleSort(a1);

        System.out.println();
        System.out.println("�㔼����בւ��܂��I");
        for (int i = 0; i < a2.length;i++){
            a2[i] = array[a2.length+i];
        }
        bubbleSort(a2);

        int arrayIndex = 0; //���̔z��̓Y����
        int a1Index = 0; //�O���z��̓Y����
        int a2Index = 0; //�㔼�z��̓Y����

        System.out.println();
        System.out.println("�}�[�W���܂��I");
        // �ǂ��炩�Е��̓Y�������v�f���ȏ�ɂȂ�܂ŌJ��Ԃ�
        //�@���z��̓Y�������u���z��̗v�f�������v���@�E�z��̓Y�������u�E�z��v
        while (a1Index < a1.length && a2Index < a2.length) {
            //���z��ƉE�z��Łu���g�̒l�����������v��Ώ۔z��ɑ��
            array[arrayIndex++] = (a1[a1Index] < a2[a2Index]) ? a1[a1Index++]:a2[a2Index++];
            showArray(array);
        }

        while (a1Index <a1.length) {
            array[arrayIndex++] = a1[a1Index++];
            showArray(array);
        }
        while (a2Index <a2.length) {
            array[arrayIndex++] = a2[a2Index++];
            showArray(array);
        }
    }
}
