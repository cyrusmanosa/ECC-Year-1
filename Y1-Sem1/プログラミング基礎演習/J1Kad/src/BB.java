import java.util.Scanner;
class BB{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("���O�����'()���Ă���������");
		int age = in.nextInt();
		double a = 1.08;
		age = (int)(age * a);
		System.out.print("sss" + age + "ss");
		in.close();
	}
}