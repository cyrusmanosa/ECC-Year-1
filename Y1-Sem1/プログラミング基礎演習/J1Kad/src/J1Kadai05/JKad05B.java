class JKad05B{
	public static void main(String[] args){
		final int COFFEE = 290;
		int tax; 		//消費税（8%）
		int total; 
		
		System.out.println("ようこそ！ECC コーヒーへ");
		System.out.println("お持ち帰りですね！");
		
		tax = (int)(COFFEE * 0.08);
		total = COFFEE + tax;
		
		System.out.println("コーヒー" + COFFEE + "円、消費税が" + tax + "円で合計" + total + "円になります！");
		System.out.println("ありがとうございました！");
	}
}