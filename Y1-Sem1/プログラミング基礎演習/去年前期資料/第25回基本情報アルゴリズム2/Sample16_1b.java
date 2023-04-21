class Sample16_1b{
	public static void main(String[] args){
		String str = "あいうえお";
		String str2 = "あいうえお";
		
		str += "";
		str2 += "";
		int n = 1;	// 文字列の位置
		
		// パターン１
		// 【文字列.subString(開始位置,終了位置)】で指定した値だけ抜き出す
		System.out.println("1文字だけ抜き出す:"+str.substring(n,n+1));
		
		System.out.println("検証1:" + (str.substring(n,n+1) == "い"));
		System.out.println("検証2:" + (str == "あいうえお"));
		System.out.println("検証3:" + (str == str2));
		
		
	}
}
