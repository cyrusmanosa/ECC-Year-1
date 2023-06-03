package Other;

import java.util.*;

class TryMethod04{
	//���͂����������w��񐔕\�����郁�\�b�h
	public static void show(String msg, int count){
		int i = 0;
		while(i < count){
			System.out.println(msg);
			i++;
		}
	}
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			String inStr; // �\���������͗p
			System.out.println("�\�����������������");
			inStr = in.next();
			
			int inNum; // �\���������񐔂����
			System.out.println("�\���������񐔂����");
			inNum = in.nextInt();
			show(inStr,inNum); //show ���\�b�h�̌Ăт���
	
		}
}