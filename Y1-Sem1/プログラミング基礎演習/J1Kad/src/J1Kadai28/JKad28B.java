package J1Kadai28;

public class JKad28B {
    public static void main(String[] args) {
        int[] array = new int[20];
        JKad28D.initArray(array);
        JKad28D.showArray(array);
        System.out.println();
        selectionSort(array); // ���ׂẴf�[�^�������ɕ��בւ���
        JKad28D.showArray(array);
    }
    public static void selectionSort(int[] array) {
        for (int start = 0; start < array.length-1; start++){
            JKad28C.selectionSort(array,start);
        }
        System.out.println();
    }
}
