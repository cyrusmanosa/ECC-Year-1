import java.util.Scanner;
class JKad11D{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("�ЂƂ߂̐�������͂��Ă���������");
		int a = in.nextInt();
		System.out.print("�ӂ��߂̐�������͂��Ă���������");
		int b = in.nextInt();
		System.out.print(a + "+" + b + "�̓�������͂��Ă���������");
		int c = in.nextInt();
		boolean correct = ((a + b) == c);
		correct = true;
		System.out.println("����́E�E�E" + ((a + b) == c));
		if ((a + b) == c) {
			System.out.println("�����ł��I");
		}else{
			System.out.println("�s�����ł��I");
		}
	}
}