class Sample10_1b{
	public static void main(String[] args){
		/** �錾 **/
		char words[] = {'��','��','��','��','��','�V','�C'};// ������\
		String showWord = "";				// �����A���p
		
		/** ���s���� **/
		System.out.println("**�擪����1���������o��**");
		// �z��̐擪����S�v�f���J��Ԃ�
		for(char c : words){
			//1������\��
			System.out.println(c);
			// �����A���p�ɕ��������Z
			showWord += c;	
		}
		System.out.println("**�A������������\��**");
		// �A�������������\��
		System.out.println(showWord);
	}
}
