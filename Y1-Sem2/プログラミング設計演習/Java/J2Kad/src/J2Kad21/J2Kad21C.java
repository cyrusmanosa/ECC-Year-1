package J2Kad21;

/*
	�ۑ薼�FJ2Kad21C�u�K�[�x�b�W�R���N�V�����v
	�쐬���F2022/12/12
	�쐬�ҁF�c�����Y
*/
public class J2Kad21C {
    public static void main(String[] args) {
        class DataSet { int[] data = new int[1000];}
        System.out.println("���݂̃������̋󂫃T�C�Y�F" + Runtime.getRuntime().freeMemory());
        DataSet[] dataSet = new DataSet[10001];

        for ( int i = 0; i < dataSet.length; i++){
            dataSet[ i ] = new DataSet();
            if ( i % 100 == 0 && i != 0 ) { System.out.println("�����ς݃C���X�^���X���F" + i + "���݂̃������̋󂫃T�C�Y�F" + Runtime.getRuntime().freeMemory()); }
        }
    }
}