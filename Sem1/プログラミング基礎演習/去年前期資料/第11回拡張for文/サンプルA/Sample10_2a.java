class Sample10_2a{
	public static void main(String[] args){
		/** �錾 **/
		// �\���p�����\
		char[][] keywords = {{'��', '��', '��'},
						     {'��', '��', '��'},
						     {'��', '��', '��'},
						     {'��', '��', '�I'}};

		/** ���s���� **/
		// keywords�z��̍s�����J��Ԃ�
		for(char[] row : keywords){
			// 1�s���̗񐔕��J��Ԃ�
			for(char col : row){
				// �z�����1������\��
				System.out.print(col);
			}
			// 1�s�I��邲�Ƃɉ��s
			System.out.println();
		}
	}
}
