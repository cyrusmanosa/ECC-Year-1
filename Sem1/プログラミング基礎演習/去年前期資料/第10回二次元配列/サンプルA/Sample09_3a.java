/*
���s����
��������������������

*/

class Sample09_3a{
	public static void main(String[] args){
		final int LEN = 5;	//��ӂ̒���
		char[][] triangle = {{'��','��','��','��','��'},
							 {'��','��','��','��','��'},
							 {'��','��','��','��','��'},
							 {'��','��','��','��','��'},
							 {'��','��','��','��','��'}};
		

		// 0�s�ڂ̍�������\��
		for(int retu=LEN-1; retu>=0; retu--){
			System.out.print(triangle[0][retu]);
		}
		// 0�s�ڂ̉E������\��
		for(int retu=0; retu<LEN; retu++){
			System.out.print(triangle[0][retu]);
		}
		System.out.println();	// ���s����
		
		
	}
}