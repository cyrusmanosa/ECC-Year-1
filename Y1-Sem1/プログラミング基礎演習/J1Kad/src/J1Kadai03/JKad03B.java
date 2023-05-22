public class JKad03B{
	public static void main(String[] args){
		final int COFFEE = 290;      // コーヒーの値段
		final int DONUT = 250;       // ドーナツの値段
		final int SALAD = 380;       //  サラダの値段
		final int CAKE = 420;        // ケーキの値段
		int price=0;
		int TAX = 10;
	
		System.out.println("ようこそ！ECC コーヒーへ");
		System.out.println("こちらでお召し上がりですね！");
		System.out.println("--------");
		
		price += COFFEE;
		System.out.println("コーヒー\t" + COFFEE + "円\t" + "小計：" + price + "円");
		
		price += DONUT;
		System.out.println("さくらドーナツ\t" + DONUT + "円\t" + "小計：" + price + "円");
		
		price += SALAD;
		System.out.println("チキンサラダ\t" + SALAD + "円\t" + "小計：" + price + "円");
		
		price += CAKE;
		System.out.println("チーズケーキ\t" + CAKE + "円\t" + "小計：" + price + "円");
		
		System.out.println("--------");
		
		System.out.println("消費税が" + (price/TAX) + "円で支払金額は" + (price + (price/TAX)) + "円になります！");
		System.out.println("ありがとうございました！");
		System.out.println("");
	}
}