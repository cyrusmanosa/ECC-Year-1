package J2Kad21;

/*
	課題名：J2Kad21C「ガーベッジコレクション」
	作成日：2022/12/12
	作成者：田中太郎
*/
public class J2Kad21C {
    public static void main(String[] args) {
        class DataSet { int[] data = new int[1000];}
        System.out.println("現在のメモリの空きサイズ：" + Runtime.getRuntime().freeMemory());
        DataSet[] dataSet = new DataSet[10001];

        for ( int i = 0; i < dataSet.length; i++){
            dataSet[ i ] = new DataSet();
            if ( i % 100 == 0 && i != 0 ) { System.out.println("生成済みインスタンス数：" + i + "現在のメモリの空きサイズ：" + Runtime.getRuntime().freeMemory()); }
        }
    }
}