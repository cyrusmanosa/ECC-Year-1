
// �g��for�����p���đS�v�f���g���ꍇ
class Sample12_1c{
	
	// enum�Œ�`
	enum Material{
		�ɂ񂶂�,
		���܂˂�,
		���Ⴊ����
	}
	
	// main���\�b�h
	public static void main(String args[]){
		int count = 1;// �g��for���ł̓J�E���g�p�̕ϐ��������̂ŗp��
		System.out.println("�J���[�̍ޗ�");
		
		// enum�Œ�`�����ޗ���S�v�f�\�������邽�߂̃��[�v
		for(Material zairyou: Material.values()){
			// �J�E���g���ƒ�`�����ޗ���\��
			System.out.println(count +"�ڂ�"+zairyou + "�ł�");
			// �J�E���g�A�b�v
			count++;
		}
	}
}
