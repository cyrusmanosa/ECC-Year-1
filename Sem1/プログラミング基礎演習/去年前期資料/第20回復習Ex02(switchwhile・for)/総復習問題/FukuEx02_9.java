/*
�����RPG�̃v���O������
while�ł͂Ȃ�
do while����if�������p���ύX����
�v���O�������̏璷�������ȗ����܂��傤�I


RPG���邠��
�Ӗ��̂Ȃ��I������I�΂�����v���O����������������

[���s����]
���l�F�E�҂�A������|���Ă��Ă͂���񂩁H
�͂�:0  /  ������:����ȊO>1
���l�F�悭�������񂩂����̂��E�E�E
���l�F�E�҂�A������|���Ă��Ă͂���񂩁H
�͂�:0  /  ������:����ȊO>2
���l�F�悭�������񂩂����̂��E�E�E
���l�F�E�҂�A������|���Ă��Ă͂���񂩁H
�͂�:0  /  ������:����ȊO>0
���l�F�悭���������I���񂾂�

*/


import java.util.Scanner;
class FukuEx02_9{
	public static void main(String[] args){
		// �錾��
		Scanner sc = new Scanner(System.in);
		int inNum;		// �I�������͗p
		
		/*** �������� 
		System.out.println("���l�F�E�҂�A������|���Ă��Ă͂���񂩁H");
		
		System.out.print("�͂�:0  /  ������:����ȊO>");
		inNum = sc.nextInt();
		*** �����܂ł̏�����2��L�q����Ă���璷�ƂȂ��Ă��� ***/
		
		// �͂��ȊO���I�΂�Ă���ԌJ��Ԃ�(do while�ō쐬���邱��)
		while(inNum != 0 ){
			System.out.println("���l�F�悭�������񂩂����̂��E�E�E");
			System.out.println("���l�F�E�҂�A������|���Ă��Ă͂���񂩁H");
		
			System.out.print("�͂�:0  /  ������:����ȊO>");
			inNum = sc.nextInt();
		}
		
		System.out.println("���l�F�悭���������I���񂾂�");
		
	}
}
