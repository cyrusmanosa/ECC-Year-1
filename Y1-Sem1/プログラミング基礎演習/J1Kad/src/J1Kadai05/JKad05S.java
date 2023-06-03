package J1Kadai05;

class JKad05S{
	public static void main(String[] args){
		double a = Math.random();
		System.out.println("�擾��������" + a);
		
		double b = ((double)Math.round(a * 10))/10;
		System.out.println("������1 �ʂŎl�̌ܓ�" + b);
		
		double c = ((double)Math.round(a * 100))/100;
		System.out.println("������2 �ʂŎl�̌ܓ�" + c);
		

		double d = ((double)Math.round(a * 1000))/1000;
		System.out.println("������3 �ʂŎl�̌ܓ�" + d);
	}
}