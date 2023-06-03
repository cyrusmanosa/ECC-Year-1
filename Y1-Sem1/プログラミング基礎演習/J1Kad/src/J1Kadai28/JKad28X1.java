package J1Kadai28;

public class JKad28X1 {
    public static void main(String[] args) {
        int[] array = new int[20];
        JKad28D.initArray(array);
        JKad28D.showArray(array);
        System.out.println();
        quickSort(array);
        // �����̔z���\��
        JKad28D.showArray(array);
    }

    public static void quickSort(int[] array){
        quickSort(array,0, array.length);
    }

    public static void quickSort(int[] array, int start, int end){
        // �f�[�^�̐����ȉ��Ȃ牽�������߂�
        if ((end - start) <= 1){
            return;
        }
        //��l��������2������
        int pivot = JKad28S.partition(array,start,end);

        //��l���������ŃN�C�b�N�\�[�g
        quickSort(array,start,pivot);

        //��l���傫���l�����ŃN�C�b�N�\�[�g
        quickSort(array,pivot+1,end);
    }
}
