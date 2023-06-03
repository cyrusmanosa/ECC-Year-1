package Other;

import java.util.Scanner;
class quention35{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("�����ԍ�����͂��Ă���������");
		int num = in.nextInt();
		int a = num/1000;
		int b = (num%1000)/100;
		System.out.print(num + "������" + a + "���ق�" + b + "�K�ɂ���܂�");
	}
}