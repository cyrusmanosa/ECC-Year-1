class Sample03_2{
	public static void main(String args[]){
		/* �ϐ��̐錾 */
		// ���iA�̒P��
		int priceA = 2000;
		// ���iA�̌�
		int numA = 11;
		// �����
		double tax;
		// ���v
		int subtotal;
		// ���v
		double total;
		
		// ���v�̌v�Z(���iA�̒P�� x ���iA�̌�)
		subtotal = priceA * numA;
		// ����ł̌v�Z(���v x 0.1)
		tax = subtotal * 0.1;
		// ���v���z�̌v�Z(���v + �����)
		total = subtotal +  tax;
		
		// ��ʂɕ\��
		System.out.println("���iA " + priceA + " * " + numA + " = " + priceA * numA);
		System.out.println("--------------------------");
		System.out.println("���v             " + subtotal);
		System.out.println("�����           " + (int)tax);
		System.out.println("���v             " + (int)total);
	}
}
