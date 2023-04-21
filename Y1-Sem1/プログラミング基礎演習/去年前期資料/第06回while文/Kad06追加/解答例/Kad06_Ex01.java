import java.util.Scanner;

public class Kad06_Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("新聞を何回折りたためるか挑戦します！");
		System.out.print("あなたのパワーを入力してください＞");
		int power = sc.nextInt();
		
		int thickness = 1;				// 新聞の「厚み」
		int count = 0;					// 折りたたんだ回数
		while (power >= thickness) {
			thickness *= 2;
			count++;
			System.out.println("新聞を折りたたんだ！厚さは" + thickness);
		}
		
		System.out.println(count + "回折りたためた！");
	}
}
