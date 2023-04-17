import java.util.Scanner;
class Fuku04_2a{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int inNum1,inNum2;
		System.out.print("数値1を入力：");
		inNum1 = sc.nextInt();
		System.out.print("数値2を入力：");
		inNum2 = sc.nextInt();
		if(inNum1 == 0 || inNum2 >= 0){
			if(inNum2 == 1){
				System.out.println("パターンA");
			}else if(inNum2 == 2){
				System.out.println("パターンB");
			}else{
				System.out.println("パターンC");
			}
		}else{
			System.out.println("パターンD");
		}
	}
}