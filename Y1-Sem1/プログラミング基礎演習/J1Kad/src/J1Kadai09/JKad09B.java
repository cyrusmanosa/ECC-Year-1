import java.util.Scanner;
class JKad09B{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("�ЂƂ߂̐�������͂��Ă���������");
		int a = in.nextInt();
		System.out.print("�ӂ��߂̐�������͂��Ă���������");
		int b = in.nextInt();
		System.out.print("�N���v�Z���܂����H�i1�F�̂ё��A1 �ȊO�F�o�ؐ��j��");
		int c = in.nextInt();
		int an = a / b;
		double bn = (double)a / (double)b;
		if (c == 1){
			System.out.println("�̂ё����v�Z���܂��I");
			System.out.println("�u" + a + "��" + b + "��" + an + "�ł��I�v");
		}else if (c != 1){
			System.out.println("�o�ؐ����v�Z���܂��I");
			System.out.println("�u" + a + "��" + b + "��" + bn + "�ł��I�v");
		}
	}
}