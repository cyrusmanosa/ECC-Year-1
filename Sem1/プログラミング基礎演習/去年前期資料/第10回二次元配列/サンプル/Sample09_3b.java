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
		for(){
			// ?�s�ڂ̍�������\��
			for(int retu=LEN-1; retu>=0; retu--){
				System.out.print(triangle[gyo][retu]);
			}
			/* ?�s�ڂ̉E������\�� */
			for(int retu=0; retu<LEN; retu++){
				System.out.print(triangle[gyo][retu]);
			}
			System.out.println();	// ���s����
	
		/* �s���� �J��Ԃ��������� �����܂� */
		}
	}
}