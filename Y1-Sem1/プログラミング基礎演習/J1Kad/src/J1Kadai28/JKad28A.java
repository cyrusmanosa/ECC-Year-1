package J1Kadai28;

public class JKad28A {
    public static void main(String[] args) {
        int[] array = new int[20];
        JKad28D.initArray(array);
        JKad28D.showArray(array);
        System.out.println();
        selectionSort(array);
        System.out.println();
        JKad28D.showArray(array);
    }

    public static void selectionSort(int[] array){
        //�ŋA�p�̑I���\�[�g���Ăяo��
        selectionSort(array,0);
    }

    public static void selectionSort(int[] array, int start) {
        //�@�ŏ��Ƀf�[�^�̎c�萔��1�ȉ��Ȃ牽�������߂�
        if( (array.length - start) <= 1 ){
            return;// ���������߂�
        }
        int min = start; // ��ԏ������l�̃C���f�b�N�X

        // ��ԏ������l��T��
        for(int i = start; i < array.length; i++){
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

        //�������g���c��̔z�񂾂��̍ċA�ŌĂяo��
        selectionSort(array, start+1);
    }
}