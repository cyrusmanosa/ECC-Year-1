package J1Kadai06;

import java.util.Scanner;

class JKad06X1{
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		System.out.println("����ɂ��́I");
		System.out.println("�킽���͐肢�}�V�[����ECC1000 ��I");
		System.out.println("���Ȃ��̂��Ƃ����Ă������I��낵����");
		System.out.println(" ");
		
		System.out.print("���O�͉��Ă����́H��");
		String name = in.next();
		
		System.out.println("�N��͂����H��");
		int age = in.nextInt();
		
		System.out.println(name + "����A����ɂ��́I");
		System.out.println("���Ȃ���" + age + "�΂Ȃ�ł��ˁI");
		System.out.println(" ");
		
		System.out.println(name + "����̍����̉^����");
		int c = (int)(Math.random()*99) + 1;
		int d = (int)(Math.random()*99) + 1;
		int e = (int)(Math.random()*99) + 1;
		System.out.println("���u�^" + c);
		System.out.println("���K�^" + d);
		System.out.println("�S�̉^" + e);
		System.out.println(" ");
		
		System.out.println("�܂����ĂˁI");
	}
}