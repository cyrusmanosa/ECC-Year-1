/*
�����s���ʁ�
���邤�N����(1000~3000)
���1000
1000�N�͂��邤�N�ł͂���܂���B
1001�N�͂��邤�N�ł͂���܂���B
1002�N�͂��邤�N�ł͂���܂���B
1003�N�͂��邤�N�ł͂���܂���B
1004�N�͂��邤�N�ł��B



*** ���̃v���O���� ***

import java.util.    �A    ;

public class FukuEx04_13{
	public static void main(String[] args){
		
		final int MIN = 1000;	//�ŏ��N��
		final int MAX = 3000;	//�ő�N��
		
		System.out.println("���邤�N����(" + MIN + "~" + MAX + ")");
		System.out.print("���");
		    �A     sc = new     �A    (System.in);
		int year =      �C     ;
		
		//���͒l����
		if(year        �E        year){
			//�������[�v
			while(  �G  ){
				if(year    �I    && year %     �J     || year     �L    ){
					System.out.println(year + "�N�͂��邤�N�ł��B");
					  �N  ;
				}else{
					System.out.println(year + "�N�͂��邤�N�ł͂���܂���B");
				}
				  �P  ;		//���N��
			}
		}else{
			System.out.println(          �R          );
		}
	}
}
*/


import java.util.    �A    ;

public class FukuEx04_13{
	public static void main(String[] args){
		
		final int MIN = 1000;	//�ŏ��N��
		final int MAX = 3000;	//�ő�N��
		
		System.out.println("���邤�N����(" + MIN + "~" + MAX + ")");
		System.out.print("���");
		    �A     sc = new     �A    (System.in);
		int year =      �C     ;
		
		//���͒l����
		if(year        �E        year){
			//�������[�v
			while(  �G  ){
				if(year    �I    && year %     �J     || year     �L    ){
					System.out.println(year + "�N�͂��邤�N�ł��B");
					  �N  ;
				}else{
					System.out.println(year + "�N�͂��邤�N�ł͂���܂���B");
				}
				  �P  ;		//���N��
			}
		}else{
			System.out.println(          �R          );
		}
	}
}
