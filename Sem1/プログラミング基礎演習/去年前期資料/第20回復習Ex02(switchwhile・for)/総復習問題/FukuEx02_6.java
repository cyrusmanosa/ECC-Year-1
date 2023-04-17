/*
表示したい文字と表示したい回数をキーボードから入力すると
その回数分文字列が表示されるプログラムを完成させよ


[実行結果例]Testと10を入力したパターン
表示したい文字列を入力:Test
繰り返したい回数を入力：10
Test:1回目!
Test:2回目!
Test:3回目!
Test:4回目!
Test:5回目!
Test:6回目!
Test:7回目!
Test:8回目!
Test:9回目!
Test:10回目!

[実行結果例]Helloと5を入力したパターン
表示したい文字列を入力:Hello
繰り返したい回数を入力：5
Hello:1回目!
Hello:2回目!
Hello:3回目!
Hello:4回目!
Hello:5回目!

*/


import java.util.Scanner;
class FukuEx02_6{
	public static void main(String[] args){
		// 宣言部
		Scanner sc = new Scanner(System.in);
		String inStr;	// 文字列入力用
		int inNum;		// 繰り返し回数入力用
		int count = 1;	// 回数カウント用
		
		System.out.print("表示したい文字列を入力:");
		inStr = sc.next();
		
		System.out.print("繰り返したい回数を入力：");
		inNum = sc.nextInt();

		// 繰り返し処理(while文)
		
			System.out.println(inStr + ":" +   count + "回目!");
			count++;
		
	}
}
