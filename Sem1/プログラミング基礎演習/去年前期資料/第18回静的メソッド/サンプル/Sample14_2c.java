import java.util.Scanner;
import java.util.Random;

class Sample14_2c{
	
	/**	
	*	�������Ă��邩�̃`�F�b�N���s�����\�b�h 
	*	���� int no : ���͂����ԍ�
	*	���� int ans: ���肷�铚���̒l
	*	�߂�l int ���ʂ�߂�(0:����  1:�E��  2:����)
	**/



	/* ���C�����\�b�h */
	public static void main(String args[]){
		final int MAX = 5;
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		
		int atari = rnd.nextInt(MAX);
		int inNum;	// ���͗p
		int result;	// ���ʗp
		
		while(true){
			try{
				System.out.println("�����肪�����Ă���͉̂��Ԗڂł��傤�I");
				System.out.print("���Ԗڂ�����(0�`" + (MAX-1) + ")�F");
				inNum = Integer.parseInt(sc.next());
				
				
				/****  �֐��� ��������   **/
				
				if(inNum > atari){
					// ���͂����l���������E��
					result = 0;
				}else if(inNum < atari) {
					// ���͂����l��������荶��
					result = 1;
				}else{
					// ���͂����l�������ƈ�v
					result = 2;
				}
				
				/****  �֐��� �����܂�   **/
				
				
				if(result == 0){
						System.out.println("����荶������!");
				}else if(result == 1){
						System.out.println("�����E������!");
				}else if(result == 2){
						System.out.println("�����I");
						break;
				}
			}catch(NumberFormatException e){
				System.out.println("���͒l���s���ł��B");
			}
		}
	}
}
