class Sample12_1a{
	
	// enum�Œ�`
	enum AgeType{
		�q��,
		��l,
		�V�j�A
	}
	
	// main���\�b�h
	public static void main(String args[]){
		// AgeType�̑�l�I�u�W�F�N�g����
		AgeType type = AgeType.��l;
		
		// ����type��AgeType.�q���Ɠ����Ȃ�
		if(type == AgeType.�q��){
			System.out.println("���܂ł�"+ type +"�ł�");
			
		// ����type��AgeType.��l�Ɠ����Ȃ�
		}else if(type == AgeType.��l){
			System.out.println("������"+ type +"�ł�");
			
		// ����type��AgeType.�V�j�A�Ɠ����Ȃ�
		}else if(type == AgeType.�V�j�A){
			System.out.println("����"+ type +"�ł�");
		}
	}
}
