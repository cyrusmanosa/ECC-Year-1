/*
�������z��ƌJ��Ԃ������g�p��


[���s����]
80      50      40      90
�_�c����̍��v�l��260


*/


class Sample09_2a{
	public static void main(String[] args){
		// �錾 (�������z����쐬�����p�^�[��)
		int userTotal[] = new int[3];	// 1�l�̑S���Ȃ̍��v�l(3�l��)
		int kyokaTotal[] = new int[4]; 	// ���ȓx���Ƃ̍��v�l(4���ȕ�)
		
		/* 3�l��4���Ȃ̓_�� */
		//				�Z��,�p��,�Љ�,�ی��̈�
		int tensu[][] = {{80,50,40,90},				//	�_�c����
						 {30,70,60,50},				//	�؉�����
						 {70,70,70,70}};			//	���򂳂�
						 			
		/* �_�c�����4���Ȃ̍��v�l��\�� */
		for(int kyokaIndex=0; kyokaIndex<tensu[0].length; kyokaIndex++){
			// ���Ȃ̓_����\��
			System.out.print(tensu[0][kyokaIndex] + "\t");
			// ���Ȃ̓_����1�l�̍��v�l�ɉ��Z
			userTotal[0] += tensu[0][kyokaIndex];
		}
		System.out.println();// ���s����
		System.out.println("�_�c����̍��v�l��" + userTotal[0] );
	}
}