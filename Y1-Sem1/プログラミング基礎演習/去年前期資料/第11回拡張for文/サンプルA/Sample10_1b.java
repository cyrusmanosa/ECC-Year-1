class Sample10_1b{
	public static void main(String[] args){
		/** 宣言 **/
		char words[] = {'今','日','は','良','い','天','気'};// 文字列表
		String showWord = "";				// 文字連結用
		
		/** 実行処理 **/
		System.out.println("**先頭から1文字ずつ取り出す**");
		// 配列の先頭から全要素分繰り返す
		for(char c : words){
			//1文字を表示
			System.out.println(c);
			// 文字連結用に文字を加算
			showWord += c;	
		}
		System.out.println("**連結した文字を表示**");
		// 連結した文字列を表示
		System.out.println(showWord);
	}
}
