package J1Kadai03;

public class JKad03B{
	public static void main(String[] args){
		final int COFFEE = 290;      // �R�[�q�[�̒l�i
		final int DONUT = 250;       // �h�[�i�c�̒l�i
		final int SALAD = 380;       //  �T���_�̒l�i
		final int CAKE = 420;        // �P�[�L�̒l�i
		int price=0;
		int TAX = 10;
	
		System.out.println("�悤�����IECC �R�[�q�[��");
		System.out.println("������ł������オ��ł��ˁI");
		System.out.println("--------");
		
		price += COFFEE;
		System.out.println("�R�[�q�[\t" + COFFEE + "�~\t" + "���v�F" + price + "�~");
		
		price += DONUT;
		System.out.println("������h�[�i�c\t" + DONUT + "�~\t" + "���v�F" + price + "�~");
		
		price += SALAD;
		System.out.println("�`�L���T���_\t" + SALAD + "�~\t" + "���v�F" + price + "�~");
		
		price += CAKE;
		System.out.println("�`�[�Y�P�[�L\t" + CAKE + "�~\t" + "���v�F" + price + "�~");
		
		System.out.println("--------");
		
		System.out.println("����ł�" + (price/TAX) + "�~�Ŏx�����z��" + (price + (price/TAX)) + "�~�ɂȂ�܂��I");
		System.out.println("���肪�Ƃ��������܂����I");
		System.out.println("");
	}
}