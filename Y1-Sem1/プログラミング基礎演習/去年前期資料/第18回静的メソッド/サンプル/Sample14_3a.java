/**
 * 2�̊֐�(���\�b�h)���쐬���v���O�������ȗ������Ȃ���
 * 
 */

import java.util.Scanner;

class Sample14_3a{
	/**
	 * ���邤�N���胁�\�b�h
	 * ����: int year
	 * �߂�l boolean   true:���邤�N    false:���邤�N�ł͂Ȃ�
	 */
	 
	 
	 /**
	  * ���邤�N���̃��b�Z�[�W���\�b�h
	  * ���� int year
	  * ���� int month
	  * �߂�l String ���b�Z�[�W
	  */
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int inYear;
		int inMonth;
		boolean isUrudoshi;
		String message;

		
		System.out.println("���邤�N���̔�������܂��B");
		
		try{
			System.out.print("���");
			inYear = Integer.parseInt(sc.next());
			System.out.print("����");
			inMonth = Integer.parseInt(sc.next());
			
			/****  �֐�������1 ��������   **/
			// ���邤�N����
			if((inYear % 4 == 0 && inYear % 100 != 0) || inYear % 400 == 0){
				isUrudoshi = true;
			}else{
					isUrudoshi = false;
			}
			/****  �֐�������1 �����܂�   **/
			
			
			/****  �֐�������2 ��������   **/
			message = inYear + "�N" + inMonth + "����";
			if(isUrudoshi && inMonth == 2){
				message += "���邤�N�ł��B";
			}else{
				message += "���邤�N�ł͂���܂���B";
			}
			/****  �֐�������2 �����܂�   **/
			
			System.out.println(message);
			
		}catch(NumberFormatException nfe){
			System.out.println("���͒l���s���ł��B");
		}catch(ArrayIndexOutOfBoundsException aiobe){
			System.out.println("���̌��͑��݂��܂���B");
		}
		
	}
}