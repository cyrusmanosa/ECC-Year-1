class Sample10_3a{
	public static void main(String[] args){
		/** �錾 **/
		int[][] table = {{50, 70, 30},
						 {80, 60, 10},
				 	 	 {40, 20, 90}};
		
		//�擪�v�f���ŏ��l�̏����l�ɂ���
		int min = table[0][0];	//�ŏ��l
		
		
		/** ���s���� **/
		//table�̍s�����J��Ԃ����[�v
		for(int[] row : table){
			//row�̗񐔕��J��Ԃ����[�v
			for(int col : row){
				//�J���}��؂�Œl�\��
				System.out.print(col + ",");
				//�����\�������l�����݂̍ŏ��l��菬�����ꍇ
				if(col < min){
					//�ŏ��l�����ݎQ�Ƃ��Ă���l�ōX�V
					min = col;	
				}
			}
			//1�s�̏I���ɉ��s
			System.out.println("");	
		}
		System.out.println("\n�ŏ��l��" + min +  "�ł��B");
	}
}