import java.util.*;

class TestMain{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		MondaiKiso mk = new MondaiKiso();
		MondaiInc mi = new MondaiInc();
		MondaiPro mp = new MondaiPro();
		
		System.out.println("\n���{����W��������I�����Ă�������");
		System.out.println("1:Java��b�m��");
		System.out.println("2:�C���N�������g�E�f�N�������g");
		System.out.println("3:�v���O����");
		
		System.out.print(" >>> ");
		try{
			int in = sc.nextInt();
			switch(in){
				case 1:	mk.startTest();	break;
				case 2: mi.startTest();	break;
				case 3: mp.startTest();	break;
				default: System.out.println("���������͂���Ȃ��������ߋ����I�����܂��B�B�B");
			}
		}catch(InputMismatchException e){
			System.out.println("���������͂���Ȃ��������ߋ����I�����܂��B�B�B");
		}
		sc.close();
	}
}