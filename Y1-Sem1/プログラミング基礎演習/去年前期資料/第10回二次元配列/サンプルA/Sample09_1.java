import java.util.Scanner;

class Sample09_1{
	public static void main(String[] args){
		// �錾
		Scanner sc = new Scanner(System.in);
		String name[] = {"�c��","�R�c","�֓�"};
		String kyoka[] = {"�Z��","�p��","�Љ�","�ی��̈�"};
		int tensu[][] = {{0,0,0,0},
						 {0,0,0,0},
						 {0,0,0,0}};
		// 3�l������
		for(int i=0; i<tensu.length; i++){
			System.out.println(name[i]+"����̓_������͂��Ă�������");
			// 4���ȕ�����
			for(int j=0; j<tensu[i].length; j++){
				System.out.print(kyoka[j] + ":");
				tensu[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		
		
	}
}