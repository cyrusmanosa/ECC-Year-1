import java.util.*;

class TestMain{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		MondaiKiso mk = new MondaiKiso();
		MondaiInc mi = new MondaiInc();
		MondaiPro mp = new MondaiPro();
		
		System.out.println("\n実施するジャンルを選択してください");
		System.out.println("1:Java基礎知識");
		System.out.println("2:インクリメント・デクリメント");
		System.out.println("3:プログラム");
		
		System.out.print(" >>> ");
		try{
			int in = sc.nextInt();
			switch(in){
				case 1:	mk.startTest();	break;
				case 2: mi.startTest();	break;
				case 3: mp.startTest();	break;
				default: System.out.println("正しく入力されなかったため強制終了します。。。");
			}
		}catch(InputMismatchException e){
			System.out.println("正しく入力されなかったため強制終了します。。。");
		}
		sc.close();
	}
}