import java.util.Scanner;
class JKad11C2{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("�������I�������֍s�����I�I");
		System.out.print("���Ȃ��̔N�����͂��Ă���������");
		int a = in.nextInt();
		if (a >= 15){
			System.out.println("��l�����F500 �~�ɂȂ�܂��I");
		}else if (a<15 && a>=6){
			System.out.println("�q�������F200 �~�ɂȂ�܂�!");
		}else {
			System.out.println("�����ł��I");
		}
	}
}