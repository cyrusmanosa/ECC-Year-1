import java.util.Scanner;

class JKad09A{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("�̂ё��̓_������͂��Ă���������");
		int a = in.nextInt();
		System.out.print("�����������̓_������͂��Ă���������");
		int b = in.nextInt();
		System.out.print("�W���C�A���̓_������͂��Ă���������");
		int c = in.nextInt();
		System.out.print("�X�l�v�̓_������͂��Ă���������");
		int d = in.nextInt();
		System.out.print("�o�ؐ�����̓_������͂��Ă���������");
		int e = in.nextInt();
		int max = a;
		
		if (max < b){
			max = b;
		}
		if (max < c){
			max = b;
		}
		if (max < d){
			max = d;
		}
		if (max < e){
			max = e;
		}
		System.out.println("��ԍ����_����" + max + "�_�ł��I");
	}
}