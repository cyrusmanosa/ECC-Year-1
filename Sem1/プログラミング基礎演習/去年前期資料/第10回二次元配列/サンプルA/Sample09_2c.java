/*
�������z��ƌJ��Ԃ������g�p��

[���s����]
80      50      40      90
30      70      60      50
70      70      70      70
[�l����]
�_�c����̍��v�l��260
�؉�����̍��v�l��210
���򂳂�̍��v�l��280


*/

class Sample09_2c{
	public static void main(String[] args){
		/* �錾 */
		int userTotal[] = new int[3];	// 1�l�̑S���Ȃ̍��v�l�z��(3�l��)
		int kyokaTotal[] = new int[4]; 	// ���ȓx���Ƃ̍��v�l�z��(4���ȕ�)
		
		/* 3�l��4���Ȃ̓_�� */
		//				�Z��,�p��,�Љ�,�ی��̈�
		int tensu[][] = {{80,50,40,90},				//	�_�c����
						 {30,70,60,50},				//	�؉�����
						 {70,70,70,70}};			//	���򂳂�
						 			
		/* 3�l��4���Ȃ̍��v�l��\�� */
		// 3�l���v�Z���J��Ԃ����߂̃��[�v
		for(int userIndex=0; userIndex<tensu.length; userIndex++){	
			// 4���ȕ��v�Z���J��Ԃ����߂̃��[�v	
			for(int kyokaIndex=0; kyokaIndex<tensu[userIndex].length; kyokaIndex++){
				// ���Ȃ̓_����\��
				System.out.print(tensu[userIndex][kyokaIndex] + "\t");
				// ���Ȃ̓_����1�l�̍��v�l�ɉ��Z
				userTotal[userIndex] += tensu[userIndex][kyokaIndex];
			}
			System.out.println();// ���s����
		}
		System.out.println("[�l����]");
		System.out.println("�_�c����̍��v�l��" + userTotal[0] );
		System.out.println("�؉�����̍��v�l��" + userTotal[1] );
		System.out.println("���򂳂�̍��v�l��" + userTotal[2] );

	}
}