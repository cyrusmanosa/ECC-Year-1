class Sample08_1a{
	public static void main(String[] args){
		// �錾
		String names[] = {"A","B","C"};	// �L������
		int damage[] = {10,20,30};		// �L�������̍U����
		int totalDamage = 0;			// �_���[�W���v
		
		// A�̍U��
		System.out.print(names[0] +"�̍U��:"); 
		System.out.println(damage[0] + "�_���[�W");
		// ���v�ɉ��Z
		totalDamage += damage[0];
		
		//B�̍U��
		System.out.print(names[1] +"�̍U��:"); 
		System.out.println(damage[1] + "�_���[�W");
		// ���v�ɉ��Z
		totalDamage += damage[1];
		
		//C�̍U��
		System.out.print(names[2] +"�̍U��:"); 
		System.out.println(damage[2] + "�_���[�W");
		// ���v�ɉ��Z
		totalDamage += damage[2];
		
		System.out.println("���v�F"+totalDamage+"�_���[�W");
	}
}
