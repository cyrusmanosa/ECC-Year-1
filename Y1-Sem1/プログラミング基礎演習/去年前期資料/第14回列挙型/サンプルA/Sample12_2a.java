
// �g��for�����p���đS�v�f���g���ꍇ
class Sample12_2a{
	
	// enum�Œ�`
	enum Dog{
		�`����,
		�Č�,
		�S�[���f�����g���o�[
	}
	
	public static void main(String args[]){
		System.out.println("����̓���");
		
		// ��`��������S�ĂŌJ��Ԃ�
		for(Dog dog : Dog.values()){
			switch(dog){
				// �ϐ��̒l���`�����Ȃ�
				case �`����:
					System.out.println("�������Ⴍ�Ă��킢��");
					break;
				// �ϐ��̒l���Č��Ȃ�
				case �Č�:
					System.out.println("�����΂����ɂ��킢��");
					break;
				// �ϐ��̒l���S�[���f�����g���o�[�Ȃ�
				case �S�[���f�����g���o�[:
					System.out.println("�����S�Ă����킢��");
					break;
			}
		}
	}
}
