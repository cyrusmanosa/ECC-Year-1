import java.util.Scanner;

class Sample14_1d{
	
	// �w�肵��2�̕������3��\�����郁�\�b�h
	public static void show(String str1,String str2){
		for(int i=0; i<3; i++){
			System.out.println(str1 + str2);
		}
	}
	
	// ���C�����\�b�h
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String inStr1;
		String inStr2;
		
		System.out.print("�\������������������ str1:");
		inStr1 = sc.next();
		System.out.print("�\������������������ str2:");
		inStr2 = sc.next();
		
		show(inStr1,inStr2);
	}
}
