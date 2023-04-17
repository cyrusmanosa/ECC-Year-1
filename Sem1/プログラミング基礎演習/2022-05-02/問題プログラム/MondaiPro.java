
import java.util.Scanner;

class MondaiPro{
	
	public void startTest(){
		Scanner sc = new Scanner(System.in);
		String[][] btext = {
			{"このジャンルの問題はすべて以下のプログラム内に記載されているものとする。\n"},
			{"注意：計算式はスペースを空けずに入力する( a + b → a+b )\n"},
			{"import java.util.Scanner;"},
			{"class Mondai{"},
			{"\tpublic static void main(String[] args){"},
			{"\t\tScanner sc = new Scanner(System.in);"},
			{"\t\t｜￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣｜"},
			{"\t\t｜　　　　　　　　　　　　　　　　　　　　　　　　｜"},
			{"\t\t｜　　　　　　　　ここに　　　　　　　　　　　　　｜"},
			{"\t\t｜　　　　　　　　　　記述します　　　　　　　　　｜"},
			{"\t\t｜　　　　　　　　　　　　　　　　　　　　　　　　｜"},
			{"\t\t｜＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿｜"},
			{"\t}"},
			{"}"},
		};
		
		for(int i = 0; i < btext.length; i++){
			for(int j = 0; j < btext[i].length; j++){
				System.out.println(btext[i][j]);
			}
		}
		//問1
		String[][] mtext01 = {
			{
				"問1:以下のプログラムは小数点第2位で四捨五入するプログラムです。空欄に適当な物を入力しよう。\n　(例：3.14→3.1　3.18→3.2)",
				"\tint num1;",
				"\tdouble num2;",
				"\tSystem.out.print(\"実数の入力 >> \");",
				"\tnum2 = sc.[　　①　　]();",
				"\tnum1 = ( [　②　] )(num2 * [　③　] + [　④　]);",
				"\tSystem.out.println(\"小数点第2位で四捨五入しました >> \" + num2);",
			},
			{
				"①：",
				"②：",
				"③：",
				"④：",
			}
		};
		//問2
		String[][] mtext02 = {
			{
				"問2:以下のプログラムは学籍番号の下3桁を取得するプログラムです。空欄に適当な物を入力しよう。\n　(例：学籍番号を入力してください >> 123456\n　　学籍番号：123456\n　　学籍番号(下3桁)：456)",
				"\tint no;",
				"\tString simo3 =\"\";",
				"\tSystem.out.println(\"学籍番号を入力してください >> \");",
				"\tno = sc.[　　①　　]();",
				"\tSystem.out.println(\"学籍番号：\" + no);",
				"\tsimo3 += String.valueOf(no / [　②　] % 10);	//下3桁目取得",
				"\tsimo3 += String.valueOf(no / [　③　] % 10);	//下2桁目取得",
				"\tsimo3 += String.valueOf([　④　]);		//下1桁目取得",
				"\tSystem.out.println(\"学籍番号(下3桁)：\" + simo3);",
			},
			{
				"①：",
				"②：",
				"③：",
				"④：",
			}
		};
		//問3
		String[][] mtext03 = {
			{
				"問3:以下のプログラムは税込購入金額(10%)と付与ポイント(5%)を計算するプログラムです。空欄に適当な物を入力しよう。\n　(例：購入金額に10%の消費税と5%のポイント付与を行います。\n　　購入金額 >>> 1000\n　　購入金額(税込)：1100\n　　ポイント付与：50pt)",
				"\tint money = 0,point = 0;",
				"\tSystem.out.println(\"購入金額に10%の消費税と5%のポイント付与を行います。\");",
				"\tSystem.out.print(\"購入金額 >>> \");",
				"\tmoney = sc.[　　①　　]();",
				"\tpoint = [　　②　　];  //ポイント付与の計算式",
				"\tmoney = [　　③　　];  //税込み金額の計算式",
				"\tSystem.out.println(\"購入金額(税込)：\" + money);",
				"\tSystem.out.println(\"ポイント付与：\" + point + \"pt\");",
			},
			{
				"①：",
				"②：",
				"③：",
			}
		};

		String[] ans01 = {"nextDouble","int","10","0.5"};
		String[] ans02 = {"nextInt","100","10","no%10"};
		String[] ans03 = {"nextInt","(int)(money*0.05)","(int)(money*1.1)"};
		int point = 0;
		
		//問1
		for(int i = 0; i < mtext01.length; i++){
			for(int j = 0; j < mtext01[i].length; j++){
				if(i == 0){
					System.out.println("\n" + mtext01[i][j]);
				}else{
					System.out.print("\n" + mtext01[i][j]);
					String ans = sc.next();
					if(ans.equals(ans01[j])){
						System.out.println("正解！！");
						point++;
					}else{
						System.out.println("不正解・・・");
					}
				}
			}
		}
		
		//問2
		for(int i = 0; i < mtext02.length; i++){
			for(int j = 0; j < mtext02[i].length; j++){
				if(i == 0){
					System.out.println("\n" + mtext02[i][j]);
				}else{
					System.out.print("\n" + mtext02[i][j]);
					String ans = sc.next();
					if(ans.equals(ans02[j])){
						System.out.println("正解！！");
						point++;
					}else{
						System.out.println("不正解・・・");
					}
				}
			}
		}
		//問3
		for(int i = 0; i < mtext03.length; i++){
			for(int j = 0; j < mtext03[i].length; j++){
				if(i == 0){
					System.out.println("\n" + mtext03[i][j]);
				}else{
					System.out.print("\n" + mtext03[i][j]);
					String ans = sc.next();
					if(ans.equals(ans03[j])){
						System.out.println("正解！！");
						point++;
					}else{
						System.out.println("不正解・・・");
					}
				}
			}
		}
		
		System.out.println("\nあなたの得点は " + point + " / " + (ans01.length + ans02.length + ans03.length) + " 点");
		if(point > 9){
			System.out.println("良く出来ました！！");
		}else if(point > 5){
			System.out.println("まぁまぁです。");
		}else{
			System.out.println("やり直し・・・");
		}
		
	}
	
}