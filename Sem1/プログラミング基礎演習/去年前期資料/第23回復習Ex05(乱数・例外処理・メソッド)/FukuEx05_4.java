/*
じゃんけんで
CPUの手をランダムに決める
プログラムを完成させよ


[実行結果]
CPUの手はパー
CPUの手はグー
CPUの手はパー
CPUの手はチョキ
CPUの手はチョキ
2回続いたので終了

*/


// Randomのimport文


class FukuEx05_4{
	public static void main(String args[]){
		// Random
		
		// CPUの出す手
		int cpuHand;
		// 前回CPUが出した手
		int beforeCpuHand = -1; // 初期値として-1を設定
		
		
		// 前回と同じ手が出るまで無限に繰り返す
		
		
			System.out.print("CPUの手は");
		
			// 乱数を生成
			
			
			// 乱数を元に処理を分岐
			
				System.out.println("グー");
				
				System.out.println("チョキ");
				
				System.out.println("パー");
			
			// もし前回と同じ手の場合
				
				// 繰り返しから抜ける
				
			
			// 前回のCPUの手を更新
			
		
		System.out.println("2回続いたので終了");
	}
}
