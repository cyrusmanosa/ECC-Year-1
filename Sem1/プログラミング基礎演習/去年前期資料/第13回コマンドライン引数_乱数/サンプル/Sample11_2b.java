// Random��import��
import java.util.Random;

class Sample11_2b{
	public static void main(String args[]){
		// Random
		Random rnd = new Random();
		// ���������i�[
		int prize;
		
		for(int count=1; count<=3; count++){
			// �����𐶐�  
			// rnd.nextInt( �͈͒l )    -> �͈͒l��3�Ȃ�u0,1,2�v��3�̓��ǂꂩ������
			// rnd.nextInt( �͈͒l )+ 1 -> �͈͒l��3�Ȃ�u1,2,3�v��3�̓��ǂꂩ������
			
			System.out.println(count + "���:"+ prize  +"����������܂����I");
		}
	}
}
