package J1Kadai27;

public class JKad27X {
    public static void main(String[] args) {
        int[] array = new int [20];
        JKad27B.initArray(array);
        JKad27B.showArray(array);
        System.out.println("���בւ��܂��I");
        System.out.println();
        mergeSort(array);
        System.out.println();
        System.out.println("���בւ��܂��I");
        JKad27B.showArray(array);
    }

    public static void mergeSort(int[] array){
        // �����v�f����1�ȉ��Ȃ�߂�
        if(array.length <= 1) return;
        int[] a1 = new int[array.length/2];
        int[] a2 = new int[array.length/2];

        for( int i = 0; i < a1.length; i++){
            a1[i] = array[i];
        }
        mergeSort(a1);
        for (int i = 0; i < a2.length;i++){
            a2[i] = array[a2.length+i];
        }
        mergeSort(a2);
        int arrayIndex = 0; //���̔z��̓Y����
        int a1Index = 0; //�O���z��̓Y����
        int a2Index = 0; //�㔼�z��̓Y����
        

        // �ǂ��炩�Е��̓Y�������v�f���ȏ�ɂȂ�܂ŌJ��Ԃ�
        //�@���z��̓Y�������u���z��̗v�f�������v���@�E�z��̓Y�������u�E�z��v
        while (a1Index < a1.length && a2Index < a2.length) {
            //���z��ƉE�z��Łu���g�̒l�����������v��Ώ۔z��ɑ��
            array[arrayIndex++] = (a1[a1Index] < a2[a2Index]) ? a1[a1Index++]:a2[a2Index++];
            JKad27B.showArray(array);
        }
        //�@�c��������z��̗v�f�����ɑ��
        while (a1Index <a1.length) {
            array[arrayIndex++] = a1[a1Index++];
            JKad27B.showArray(array);
        }
        //�@�c�����E�z��̗v�f�����ɑ��
        while (a2Index <a2.length) {
            array[arrayIndex++] = a2[a2Index++];
            JKad27B.showArray(array);
        }
    }
}
