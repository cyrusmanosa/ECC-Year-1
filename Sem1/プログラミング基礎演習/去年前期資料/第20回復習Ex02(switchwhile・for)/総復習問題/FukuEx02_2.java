import java.util.Scanner;

class FukuEx02_2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int inNum;
		
		/*** if�����g��������񂯂�ver ***/
		System.out.println("**** if���Ńv���O���� *****");
		System.out.print("������ �O�[:1  /  �`���L:2  /  �p�[:3 >");
		inNum = sc.nextInt();
		
		System.out.print("���Ȃ��̎��");
		
		if(inNum == 1){
			System.out.println("�O�[");
		}else if(inNum == 2){
			System.out.println("�`���L");
		}else if(inNum == 3){
			System.out.println("�p�[");
		}else{
			System.out.println("���͒l���s���ł�");
		}
		
		
		/*** switch�����g��������񂯂�ver ***/
		System.out.println("**** switch���Ńv���O���� *****");
		System.out.print("������ �O�[:1  /  �`���L:2  /  �p�[:3 >");
		inNum = sc.nextInt();
		
		System.out.print("���Ȃ��̎��");
		
			
			System.out.println("�O�[");
			
			
			
			System.out.println("�`���L");
			
			
			
			System.out.println("�p�[");
			
			
			
			System.out.println("���͒l���s���ł�");
		}
	}
}