
import java.util.Scanner;

class MondaiKiso{
	
	public void startTest(){
		Scanner sc = new Scanner(System.in);
		String[][] mtext = {
			{"��1:java��ۑ����鎞�A�t�@�C�����́Z�Z�Ɠ����ɂ���","1:�N���X���@2:�ϐ����@3:���\�b�h��"},
			{"��2:���s������v���O������main���\�b�h�́Z�ƁZ�̊ԂɋL�q����","1: ( �� ) �@2: { �� } �@3: \" �� \" "},
			{"��3:/* �� */ �ŋ��ނ𕡐��s�R�����g���ł���B�ł͐擪�� // ���L�q����ƁH","1: �s���܂ŃR�����g�ɂȂ� �@2: �ȍ~�S�Ă��R�����g�ɂȂ� �@3: �G���[�ɂȂ� "},
			{"��4:���[�U�ɓ��͂�����ɂ́Z�Z�N���X���g�p����","1: Scan �@2: Input �@3: Scanner "},
			{"��5:int�^�ɓ��͂���ۂɎg�p���郁�\�b�h�́H","1: next() �@2: nextInt() �@3: nextDouble() "},
			{"��6:���̕ϐ��^�̒��Œ��ԊO��͂ǂ�H","1: int �@2: short �@3: long �@4: double "},
			{"��7:int�^�̃r�b�g���{short�^�̃r�b�g���{double�^�̃r�b�g�����Z(�o�C�g)","1: 14 �@2: 112 �@3: 16 �@4: 96 "},
			{"��8:���̃v���O�����͉������Ă���ł��傤���H\n\tint num = 10;","1: ��� �@2: ������ "},
			{"��9:���̃v���O������2�s�ڂ�3�s�ڂ̐擪�ɋ󔒂������œ����Ă��܂��B\n���̋󔒂����ƌĂԁH\n\nclass Test{\n\tpublic static void main(String[] args){\n\t\tint num = 10;","1: �C���V�f���g �@2: �C���X�^���X �@3: �C���O���� �@4: �C���f���g"},
			{"��10:���̃v���O�������́Z�Z�ɓ�����̂́H\n\tdouble num1 = 10.2,num2 = 23.4;\n\tint num3 = (�Z�Z)(num1 + num2);","1: double �@2: nextInt �@3: int �@4: Scanner"},
			{"��11:��10��num3��println�ŕ\������Ɖ����\�������H","1: 33.6 �@2: �G���[�ɂȂ� �@3: 33 "},
			{"��12:���̃v���O������ �� �͉��ƌĂ΂�邩�H\n\tnum1 = 10;","1: ������Z�q �@2: ��r���Z�q �@3: �_�����Z�q "},
		};
		int[] ans = {1,2,1,3,2,4,1,2,4,3,3,1};
		int point = 0;
		
		for(int i = 0; i < mtext.length; i++){
			for(int j = 0; j < mtext[i].length; j++){
				System.out.println("\n" + mtext[i][j]);
			}
			System.out.print("ans >>> ");
			int uans = sc.nextInt();
			if(uans == ans[i]){
				System.out.println("\n�����I�I\n");
				point++;
			}else{
				System.out.println("\n�s�����E�E�E\n");
			}
		}
		System.out.println("\n���Ȃ��̓��_�� " + point + " / " + mtext.length + " �_");
		if(point > 9){
			System.out.println("�ǂ��o���܂����I�I");
		}else if(point > 5){
			System.out.println("�܂��܂��ł��B");
		}else{
			System.out.println("��蒼���E�E�E");
		}
	}
}