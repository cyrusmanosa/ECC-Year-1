/*
���s����
��������������������
��������������������
��������������������
��������������������
��������������������

*/

class Sample09_3b{
	public static void main(String[] args){
		final int LEN = 5;	//��ӂ̒���
		char[][] triangle = {{'��','��','��','��','��'},
							 {'��','��','��','��','��'},
							 {'��','��','��','��','��'},
							 {'��','��','��','��','��'},
							 {'��','��','��','��','��'}};
		
		/* �s���� �J��Ԃ��������� �������� */
		for(int gyo=0; gyo<LEN; gyo++){
			
			/* 0�s�ڂ̍�������\�� */
			// triangle��0�s�ڂ̒l�𖖔�����擪�̏��Ԃɕ\��
			for(int retu=LEN-1; retu>=0; retu--){
				System.out.print(triangle[gyo][retu]);
			}
			// 0�s�ڂ̉E������\��
			for(int retu=0; retu<LEN; retu++){
				System.out.print(triangle[gyo][retu]);
			}
			System.out.println();	// ���s����
	
		/* �s���� �J��Ԃ��������� �����܂� */
		}
	}
}