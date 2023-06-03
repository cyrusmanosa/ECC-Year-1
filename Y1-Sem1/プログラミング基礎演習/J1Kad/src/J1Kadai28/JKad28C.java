package J1Kadai28;

public class JKad28C {
    public static void main(String[] args) {
        int[] array = new int[20];
        JKad28D.initArray(array);
        JKad28D.showArray(array);
        System.out.println();
        selectionSort(array, 0); // �I���\�[�g�i0 �Ԗڂ���Ō���܂Łj
        selectionSort(array, 1); // �I���\�[�g�i1 �Ԗڂ���Ō���܂Łj
        selectionSort(array, 2); // �I���\�[�g�i2 �Ԗڂ���Ō���܂Łj
        System.out.println();
        JKad28D.showArray(array);
    }

    /**
     * �I���\�[�g
     * @param array�@���ёւ���z��
     * @param start�@�T������z��̊J�n�ʒu
     */

    public static void selectionSort(int[] array, int start) {
        int min = start; // ��ԏ������l�̃C���f�b�N�X
        // ��ԏ������l��T��
        int i = 0;
        for(i = start; i < array.length; i++){
            //�����菬�����l���������ꍇ
            if( array[i] < array[min] ) {
                // �ŏ��l�́m�ʒu�n���X�V
                min = i;
            }
        }

        JKad28D.showArray(array, start, min, array.length);
        // start �Ԗڂ���Ō���܂ŕ\��
        int tmp = array[start];
        array[start] = array[min];
        array[min] = tmp;

    }

}
