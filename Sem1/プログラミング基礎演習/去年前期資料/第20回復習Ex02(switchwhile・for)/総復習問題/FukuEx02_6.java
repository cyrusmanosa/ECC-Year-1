/*
�\�������������ƕ\���������񐔂��L�[�{�[�h������͂����
���̉񐔕������񂪕\�������v���O����������������


[���s���ʗ�]Test��10����͂����p�^�[��
�\������������������:Test
�J��Ԃ������񐔂���́F10
Test:1���!
Test:2���!
Test:3���!
Test:4���!
Test:5���!
Test:6���!
Test:7���!
Test:8���!
Test:9���!
Test:10���!

[���s���ʗ�]Hello��5����͂����p�^�[��
�\������������������:Hello
�J��Ԃ������񐔂���́F5
Hello:1���!
Hello:2���!
Hello:3���!
Hello:4���!
Hello:5���!

*/


import java.util.Scanner;
class FukuEx02_6{
	public static void main(String[] args){
		// �錾��
		Scanner sc = new Scanner(System.in);
		String inStr;	// ��������͗p
		int inNum;		// �J��Ԃ��񐔓��͗p
		int count = 1;	// �񐔃J�E���g�p
		
		System.out.print("�\������������������:");
		inStr = sc.next();
		
		System.out.print("�J��Ԃ������񐔂���́F");
		inNum = sc.nextInt();

		// �J��Ԃ�����(while��)
		
			System.out.println(inStr + ":" +   count + "���!");
			count++;
		
	}
}
