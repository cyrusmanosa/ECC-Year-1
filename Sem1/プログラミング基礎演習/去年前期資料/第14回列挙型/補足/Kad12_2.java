public class Kad12_2{
	
	// enum ���t�^���`
	enum BloodType{A, B, O, AB}
	
	public static void main(String[] args){
		
		System.out.println("*** ���t�^�ʂ̓��� ***");
		
		// ��`�������t�^�̗񋓌^��S�ĕ\�����邽�߂̃��[�v(�g��for��)
		for(BloodType bt : BloodType.values()){
			// ��`�������t�^��"�^"�Ƃ����������\��
			System.out.print(bt + "�^�F");
			
			// ���t�^�����ɏ�������(switct��)
			switch(){
			// A�^�Ȃ�
			case A:
				System.out.println("�{����");
				// switch�����甲����
				break;
			// B�^�Ȃ�
			case B:
				System.out.println("���I");
				// switch�����甲����
				break;
			// O�^�Ȃ�
			case O:
				System.out.println("��炩");
				// switch�����甲����
				break;
			// AB�^�Ȃ�
			case AB:
				System.out.println("�V�˔�");
				// switch�����甲����
				break;
			}
		}
	}
}
