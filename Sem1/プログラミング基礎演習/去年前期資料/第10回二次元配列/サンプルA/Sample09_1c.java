/*
�������z��ɕύX��
�������z������p����
��������Ɩ؉������\�����Ă��������B

A�N���X
�o�Ȕԍ�0 ����
�o�Ȕԍ�1 �⒆
�o�Ȕԍ�2 ��c
�o�Ȕԍ�3 �]��
�o�Ȕԍ�4 ����

B�N���X
�o�Ȕԍ�0 �_�c
�o�Ȕԍ�1 �؉�
�o�Ȕԍ�2 ����
�o�Ȕԍ�3 ����
�o�Ȕԍ�4 �É�


[���s����]
�\���������N���X�����   0:A�N���X / 1:B�N���X >0
�\���������o�Ȕԍ������ >3
�I���������k�͍]��


*/

import java.util.Scanner;
class Sample09_1c{
	public static void main(String[] args){
		// �錾 (�������z����쐬�����p�^�[��)
		String names[][] = {{ "����","�⒆","��c","�]��","����"},	// A�N���X�̖���
						    { "�_�c","�؉�","����","����","�É�"}};	// B�N���X�̖���
							
		Scanner sc = new Scanner(System.in);//Scanner
		int inClass;// �N���X���͗p
		int inNo;	// �o�Ȕԍ����͗p
		
		System.out.print("�\���������N���X�����   0:A�N���X / 1:B�N���X >");
		inClass = sc.nextInt();
		
		System.out.print("�\���������o�Ȕԍ������ >");
		inNo = sc.nextInt();
		
		System.out.println("�I���������k��"+ names[inClass][inNo]);
		
	}
}