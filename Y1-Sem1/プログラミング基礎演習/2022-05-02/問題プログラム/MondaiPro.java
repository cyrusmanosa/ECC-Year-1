
import java.util.Scanner;

class MondaiPro{
	
	public void startTest(){
		Scanner sc = new Scanner(System.in);
		String[][] btext = {
			{"���̃W�������̖��͂��ׂĈȉ��̃v���O�������ɋL�ڂ���Ă�����̂Ƃ���B\n"},
			{"���ӁF�v�Z���̓X�y�[�X���󂯂��ɓ��͂���( a + b �� a+b )\n"},
			{"import java.util.Scanner;"},
			{"class Mondai{"},
			{"\tpublic static void main(String[] args){"},
			{"\t\tScanner sc = new Scanner(System.in);"},
			{"\t\t�b�P�P�P�P�P�P�P�P�P�P�P�P�P�P�P�P�P�P�P�P�P�P�P�P�b"},
			{"\t\t�b�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�b"},
			{"\t\t�b�@�@�@�@�@�@�@�@�����Ɂ@�@�@�@�@�@�@�@�@�@�@�@�@�b"},
			{"\t\t�b�@�@�@�@�@�@�@�@�@�@�L�q���܂��@�@�@�@�@�@�@�@�@�b"},
			{"\t\t�b�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�b"},
			{"\t\t�b�Q�Q�Q�Q�Q�Q�Q�Q�Q�Q�Q�Q�Q�Q�Q�Q�Q�Q�Q�Q�Q�Q�Q�Q�b"},
			{"\t}"},
			{"}"},
		};
		
		for(int i = 0; i < btext.length; i++){
			for(int j = 0; j < btext[i].length; j++){
				System.out.println(btext[i][j]);
			}
		}
		//��1
		String[][] mtext01 = {
			{
				"��1:�ȉ��̃v���O�����͏����_��2�ʂŎl�̌ܓ�����v���O�����ł��B�󗓂ɓK���ȕ�����͂��悤�B\n�@(��F3.14��3.1�@3.18��3.2)",
				"\tint num1;",
				"\tdouble num2;",
				"\tSystem.out.print(\"�����̓��� >> \");",
				"\tnum2 = sc.[�@�@�@�@�@]();",
				"\tnum1 = ( [�@�A�@] )(num2 * [�@�B�@] + [�@�C�@]);",
				"\tSystem.out.println(\"�����_��2�ʂŎl�̌ܓ����܂��� >> \" + num2);",
			},
			{
				"�@�F",
				"�A�F",
				"�B�F",
				"�C�F",
			}
		};
		//��2
		String[][] mtext02 = {
			{
				"��2:�ȉ��̃v���O�����͊w�Дԍ��̉�3�����擾����v���O�����ł��B�󗓂ɓK���ȕ�����͂��悤�B\n�@(��F�w�Дԍ�����͂��Ă������� >> 123456\n�@�@�w�Дԍ��F123456\n�@�@�w�Дԍ�(��3��)�F456)",
				"\tint no;",
				"\tString simo3 =\"\";",
				"\tSystem.out.println(\"�w�Дԍ�����͂��Ă������� >> \");",
				"\tno = sc.[�@�@�@�@�@]();",
				"\tSystem.out.println(\"�w�Дԍ��F\" + no);",
				"\tsimo3 += String.valueOf(no / [�@�A�@] % 10);	//��3���ڎ擾",
				"\tsimo3 += String.valueOf(no / [�@�B�@] % 10);	//��2���ڎ擾",
				"\tsimo3 += String.valueOf([�@�C�@]);		//��1���ڎ擾",
				"\tSystem.out.println(\"�w�Дԍ�(��3��)�F\" + simo3);",
			},
			{
				"�@�F",
				"�A�F",
				"�B�F",
				"�C�F",
			}
		};
		//��3
		String[][] mtext03 = {
			{
				"��3:�ȉ��̃v���O�����͐ō��w�����z(10%)�ƕt�^�|�C���g(5%)���v�Z����v���O�����ł��B�󗓂ɓK���ȕ�����͂��悤�B\n�@(��F�w�����z��10%�̏���ł�5%�̃|�C���g�t�^���s���܂��B\n�@�@�w�����z >>> 1000\n�@�@�w�����z(�ō�)�F1100\n�@�@�|�C���g�t�^�F50pt)",
				"\tint money = 0,point = 0;",
				"\tSystem.out.println(\"�w�����z��10%�̏���ł�5%�̃|�C���g�t�^���s���܂��B\");",
				"\tSystem.out.print(\"�w�����z >>> \");",
				"\tmoney = sc.[�@�@�@�@�@]();",
				"\tpoint = [�@�@�A�@�@];  //�|�C���g�t�^�̌v�Z��",
				"\tmoney = [�@�@�B�@�@];  //�ō��݋��z�̌v�Z��",
				"\tSystem.out.println(\"�w�����z(�ō�)�F\" + money);",
				"\tSystem.out.println(\"�|�C���g�t�^�F\" + point + \"pt\");",
			},
			{
				"�@�F",
				"�A�F",
				"�B�F",
			}
		};

		String[] ans01 = {"nextDouble","int","10","0.5"};
		String[] ans02 = {"nextInt","100","10","no%10"};
		String[] ans03 = {"nextInt","(int)(money*0.05)","(int)(money*1.1)"};
		int point = 0;
		
		//��1
		for(int i = 0; i < mtext01.length; i++){
			for(int j = 0; j < mtext01[i].length; j++){
				if(i == 0){
					System.out.println("\n" + mtext01[i][j]);
				}else{
					System.out.print("\n" + mtext01[i][j]);
					String ans = sc.next();
					if(ans.equals(ans01[j])){
						System.out.println("�����I�I");
						point++;
					}else{
						System.out.println("�s�����E�E�E");
					}
				}
			}
		}
		
		//��2
		for(int i = 0; i < mtext02.length; i++){
			for(int j = 0; j < mtext02[i].length; j++){
				if(i == 0){
					System.out.println("\n" + mtext02[i][j]);
				}else{
					System.out.print("\n" + mtext02[i][j]);
					String ans = sc.next();
					if(ans.equals(ans02[j])){
						System.out.println("�����I�I");
						point++;
					}else{
						System.out.println("�s�����E�E�E");
					}
				}
			}
		}
		//��3
		for(int i = 0; i < mtext03.length; i++){
			for(int j = 0; j < mtext03[i].length; j++){
				if(i == 0){
					System.out.println("\n" + mtext03[i][j]);
				}else{
					System.out.print("\n" + mtext03[i][j]);
					String ans = sc.next();
					if(ans.equals(ans03[j])){
						System.out.println("�����I�I");
						point++;
					}else{
						System.out.println("�s�����E�E�E");
					}
				}
			}
		}
		
		System.out.println("\n���Ȃ��̓��_�� " + point + " / " + (ans01.length + ans02.length + ans03.length) + " �_");
		if(point > 9){
			System.out.println("�ǂ��o���܂����I�I");
		}else if(point > 5){
			System.out.println("�܂��܂��ł��B");
		}else{
			System.out.println("��蒼���E�E�E");
		}
		
	}
	
}