// Randomのimport文
import java.util.Random;

class Sample11_2a{
	public static void main(String args[]){
		// Random
		Random rnd = new Random();
		// 乱数の格納用
		int rndNum;
		
		for(int i=0; i<5; i++){
			// 乱数を生成  
			// rnd.nextInt( 範囲値 ) 範囲値が3なら
			//「0,1,2」の3つの内どれかが入る
			rndNum = rnd.nextInt(3);
			System.out.println("乱数を表示:" + rndNum);
		}
	}
}
