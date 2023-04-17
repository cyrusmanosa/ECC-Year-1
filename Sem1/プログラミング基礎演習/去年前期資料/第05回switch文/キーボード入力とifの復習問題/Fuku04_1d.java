import java.util.Scanner;
class Fuku04_1d{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int inNum1,inNum2;
		System.out.print("数値1を入力：");
		inNum1 = sc.nextInt();
		System.out.print("数値2を入力：");
		inNum2 = sc.nextInt();
		if(inNum1 % 2 == 0 || inNum2 % 2 == 0){
			System.out.println("両方とも偶数！");
		}
	}
}