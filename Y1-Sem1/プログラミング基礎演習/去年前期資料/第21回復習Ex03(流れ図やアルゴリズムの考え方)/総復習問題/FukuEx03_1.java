import java.util.Scanner;

class FukuEx03_1{
	public static void main(String[] args){
		/* �錾 */
		Scanner sc = new Scanner(System.in);
		int inNum;
		
		System.out.println("�_������͂��Ă�������:");
		// ���l�����
		inNum = sc.nextInt();
		
		// �_���ɂ�蕪��
		if(inNum >= 60){
			System.out.println("���i�ł�");
		}else{
			System.out.println("�s���i�ł�");
		}
	}
}
