class TryHensu06{
	public static void main(String[] args){
		final int COFFEE = 290;
		
		//int tax = COFFEE * 0.1;
		//型が合わないエラー
		
		int tax = (int)(COFFEE * 0.1);  
		//点数かけたら、整数になった
		
		int total = COFFEE + tax;
		System.out.println(total + "円");
	}
}
