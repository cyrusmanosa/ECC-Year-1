// Random��import��
import java.util.Random;

class Sample11_2a{
	public static void main(String args[]){
		// Random
		Random rnd = new Random();
		// �����̊i�[�p
		int rndNum;
		
		for(int i=0; i<5; i++){
			// �����𐶐�  
			// rnd.nextInt( �͈͒l ) �͈͒l��3�Ȃ�
			//�u0,1,2�v��3�̓��ǂꂩ������
			rndNum = rnd.nextInt(3);
			System.out.println("������\��:" + rndNum);
		}
	}
}
