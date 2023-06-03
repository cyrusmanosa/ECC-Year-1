package Other;

class TryModoriti01{
	public static void main(String[] args){
		show();//show���\�b�h���Ăяo��
		pw();//pw���\�b�h���Ăяo������
		System.out.println("�U���͂�" + pw());//pw���\�b�h�̌��ʂ�\��
		int x = pw();//pw���\�b�h�̌��ʂ���
		System.out.println("�U����" + x + "(2���)");
	}
	
	public static void show(){
		System.out.println("player");
		//�߂�lvoid�Ȃ̂�return;���ȗ�
	}
	
	public static int pw(){
		int power = 10;
		return power;//int�^�f�[�^�Ŗ߂�
	}
}