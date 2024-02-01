package J2Kad10;

/*
	課題名：J2Kad10D「ECC長屋、再び！」
	作成日：2022/10/31
	作成者：田中太郎
*/
public class J2Kad10D {
    public static void main(String[] args) {
        int a = 12;
		int b = 8;
		if(a >= 10 || b >= 10) {
				a /= 2;
				b += a;
			} else
				a /= 2;
		b += a;
		System.out.println(a + ":" + b);

    }
}
