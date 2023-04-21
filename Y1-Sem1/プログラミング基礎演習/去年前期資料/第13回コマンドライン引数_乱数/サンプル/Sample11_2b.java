// Randomのimport文
import java.util.Random;

class Sample11_2b{
	public static void main(String args[]){
		// Random
		Random rnd = new Random();
		// 何等かを格納
		int prize;
		
		for(int count=1; count<=3; count++){
			// 乱数を生成  
			// rnd.nextInt( 範囲値 )    -> 範囲値が3なら「0,1,2」の3つの内どれかが入る
			// rnd.nextInt( 範囲値 )+ 1 -> 範囲値が3なら「1,2,3」の3つの内どれかが入る
			
			System.out.println(count + "回目:"+ prize  +"等が当たりました！");
		}
	}
}
