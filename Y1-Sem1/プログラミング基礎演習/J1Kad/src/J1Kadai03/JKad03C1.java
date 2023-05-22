/*
	課題名：JKad03C1
	作成日：2022/04/18
	作成者：文家俊
*/
public class JKad03C1 {
	public static void main(String[] args) {
		int x = 5;
		System.out.println("変数xの値を表示します！");
		System.out.println(x);
		
		// たし算
		System.out.println("変数xに14を足します！");
		x += 14;
		System.out.println(x);
		
		// ひき算
		System.out.println("変数xから3を引きます！");
		x -= 3;
		System.out.println(x);
		
		// かけ算
		System.out.println("変数xに7をかけます！");
		x *= 7;
		System.out.println(x);
		
		// 割り算
		System.out.println("変数xを10で割ります！");
		x /= 10;
		System.out.println(x);
		
		// 余り
		System.out.println("変数xを4で割った余りを求めます！");
		x %= 4;
		System.out.println(x);
	}
}
