package J1Kadai28;

public class JKad28S {
    public static void main(String[] args) {
        int[] array = new int[20];
        JKad28D.initArray(array);
        JKad28D.showArray(array);
        // 2�������\�b�h�̌Ăяo��()
        partition(array, 0, array.length);

    }
    public static int partition(int[] array, int start, int end) {
        int pivotNum = start; // �s�{�b�g�̃C���f�b�N�X
        int pivotVal = array[pivotNum]; // �s�{�b�g�̒l
        for (int target = start + 1; target < end; target++){
            // ��r�l����l�ȉ��Ȃ�
            if (array[pivotNum] > array[target]){
                // �u��r�Ώۈʒu�̒l�v���u��l�̈ʒu�v�ɏ㏑������
                array[pivotNum++] = array[target];
                /* pivotNum++; */  // ��l�̈ʒu�����߂�
                // �u��r�Ώۈʒu�̒l�v���u��l�̈ʒu�v�ɏ㏑������
                array[target] = array[pivotNum++];
            }
        }
        // �u��r�Ώۈʒu�̒l�v���u��l�̈ʒu�v�ɏ㏑������
        array[pivotNum] = pivotVal;

        //�@��l�̕\��
        JKad28D.showArray(array,start,pivotNum,array.length);

        // �߂�l�͊�l�̈ʒu
        return pivotNum;
    }
}