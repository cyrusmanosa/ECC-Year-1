class Sample08_1b{
	public static void main(String[] args){
		// �錾
		String names[] = {"A","B","C"};	// �L������
		int damage[] = {10,20,30};		// �L�������̍U����
		int totalDamage = 0;			// �_���[�W���v
		
		// �J��Ԃ�����
		for(int i=0; i<names.length; i++){
			// �L�����̍U��
			System.out.print(names[i]+"�̍U��:");
			System.out.println(damage[i]+"�_���[�W");
			// // ���v�ɉ��Z
			totalDamage += damage[i];
		}
		System.out.println("���v�F"+totalDamage+"�_���[�W");
	}
}
