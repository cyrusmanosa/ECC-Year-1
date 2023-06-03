package J1Kadai09;

import java.util.Scanner;
class JKad09S{
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
		int s = a ;
		
		
		//1
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
		
		//2
		if (max > s && max != s && s < a){
			s = a;
		}
		if(max > s && max != s && s < b){
			s = b;
		}
		
		if (max > s && max != s && s < c){
			s = c;
		}
		
		if (max > s && max != s && s < d){
			s = d;
		}
		
		if (max > s && max != s && s < e){
			s = e;
		}
			
		System.out.println("��Ԗڂɍ����_��" + s + "�_�ł��I");
	}
}