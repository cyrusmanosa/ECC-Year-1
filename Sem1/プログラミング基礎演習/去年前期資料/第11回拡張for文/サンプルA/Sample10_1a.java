class Sample10_1a{
	public static void main(String[] args){
		/** �錾 **/
		int tensu[] = {40,80,55};	// ���_�\
		int total = 0;				// ���v�l
		
		/** ���s���� **/
		// �z��̐擪����S�v�f���J��Ԃ�
		for(int num : tensu){
			//���_��\��
			System.out.println(num + "�_");
			// ���v�l�ɓ��_�����Z
			total += num;	
		}
		// ���v�l��\��
		System.out.println("���v:" + total +"�_");
	}
}
