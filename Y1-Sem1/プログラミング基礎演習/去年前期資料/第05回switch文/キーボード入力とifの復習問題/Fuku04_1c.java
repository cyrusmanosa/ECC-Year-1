import java.util.Scanner;
class Fuku04_1c{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int inNum1,inNum2;
		System.out.print("���l1����́F");
		inNum1 = sc.next();
		System.out.print("���l2����́F");
		inNum2 = sc.next();
		if(inNum1 % 2 == 0 && inNum2 % 2 == 0){
			System.out.println("�����Ƃ������I");
		}
	}
}