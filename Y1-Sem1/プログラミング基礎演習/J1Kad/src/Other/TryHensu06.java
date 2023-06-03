package Other;

class TryHensu06{
	public static void main(String[] args){
		final int COFFEE = 290;
		
		//int tax = COFFEE * 0.1;
		//�^������Ȃ��G���[
		
		int tax = (int)(COFFEE * 0.1);  
		//�_����������A�����ɂȂ���
		
		int total = COFFEE + tax;
		System.out.println(total + "�~");
	}
}
