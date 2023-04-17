//Arraysクラスをインポート


class Sample15_2a{
	public static void main(String[] args){
		int n = 100+1; // 対象としたい値の最大値
		boolean[] flag = new boolean[n];
		
		// Arrays.fill(対象の配列名, 開始番号, 終了番号, 格納したい値);
		
		
		for(int i=0; i<n; i++){
			System.out.println("flag[" + i + "]=" + flag[i]);
		}
	}
}
