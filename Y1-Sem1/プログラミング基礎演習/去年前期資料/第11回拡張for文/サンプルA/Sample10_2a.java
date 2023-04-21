class Sample10_2a{
	public static void main(String[] args){
		/** 宣言 **/
		// 表示用文字表
		char[][] keywords = {{'あ', 'し', 'た'},
						     {'も', '晴', 'れ'},
						     {'る', 'と', 'い'},
						     {'い', 'な', '！'}};

		/** 実行処理 **/
		// keywords配列の行数分繰り返す
		for(char[] row : keywords){
			// 1行内の列数分繰り返す
			for(char col : row){
				// 配列内の1文字を表示
				System.out.print(col);
			}
			// 1行終わるごとに改行
			System.out.println();
		}
	}
}
