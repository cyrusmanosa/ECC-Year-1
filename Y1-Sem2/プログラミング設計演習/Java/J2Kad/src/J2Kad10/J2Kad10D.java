package J2Kad10;

/*
	�ۑ薼�FJ2Kad10D�uECC�����A�ĂсI�v
	�쐬���F2022/10/31
	�쐬�ҁF�c�����Y
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
