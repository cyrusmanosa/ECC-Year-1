import java.util.Scanner;
class Fuku04_2a{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int inNum1,inNum2;
		System.out.print("���l1����́F");
		inNum1 = sc.nextInt();
		System.out.print("���l2����́F");
		inNum2 = sc.nextInt();
		if(inNum1 == 0 || inNum2 >= 0){
			if(inNum2 == 1){
				System.out.println("�p�^�[��A");
			}else if(inNum2 == 2){
				System.out.println("�p�^�[��B");
			}else{
				System.out.println("�p�^�[��C");
			}
		}else{
			System.out.println("�p�^�[��D");
		}
	}
}