package J1Kadai05;

class JKad05B{
	public static void main(String[] args){
		final int COFFEE = 290;
		int tax; 		//����Łi8%�j
		int total; 
		
		System.out.println("�悤�����IECC �R�[�q�[��");
		System.out.println("�������A��ł��ˁI");
		
		tax = (int)(COFFEE * 0.08);
		total = COFFEE + tax;
		
		System.out.println("�R�[�q�[" + COFFEE + "�~�A����ł�" + tax + "�~�ō��v" + total + "�~�ɂȂ�܂��I");
		System.out.println("���肪�Ƃ��������܂����I");
	}
}