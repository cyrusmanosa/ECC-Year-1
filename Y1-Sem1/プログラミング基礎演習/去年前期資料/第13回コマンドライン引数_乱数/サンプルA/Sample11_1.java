class Sample11_1{
	public static void main(String args[]){
		// args配列の要素分繰り返す
		for(int i=0; i<args.length; i++){
			System.out.println("args[" + i + "]の値：" + args[i]);
			System.out.println("args[" + i + "]の文字数：" + args[i].length());
			System.out.println("");	//改行
		}
	}
}
