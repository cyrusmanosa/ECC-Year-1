package J1Kadai28;

public class JKad28D {
    public static void main(String[] args) {
        int[] array = new int [20];
        initArray(array);
        showArray(array);
        //�I�[�o�[���[�h�Ƃ����g����
        showArray(/*�z��*/array, /*�J�n�ʒu*/5, /*��l�̈ʒu*/10,/*�I���ʒu*/15);
        // 5 �Ԗڈȏ�15 �Ԗږ�����\���i10 �Ԗڂɂ́u*�v��t����j
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
    public static void showArray(int[] array, int start, int pivotNum, int end) {
        int i = 0;
        //--(�n�C�t��)�����鏈��
        for( ;i < start; i++){
            System.out.print("--\t");
        }
        //�z��̒��g��pivot�܂ŕ\�����鏈��
        for (; i < pivotNum; i++) {
            System.out.print(array[i] + "\t");
        }
        // pivot ��\�����鏈��
        System.out.print(array[i++] + "*\t");
        //�z��̒��g�𖖔��܂ŕ\������
        for(; i < end; i++) {
            System.out.print(array[i] + "\t");
        }
        //�@�c���--(�n�C�t��)�Ŗ��߂鏈��
        for (; i < array.length; i++) {
            System.out.print("--\t");
        }
        //�Ō�ɉ��s
        System.out.println();
    }
}
