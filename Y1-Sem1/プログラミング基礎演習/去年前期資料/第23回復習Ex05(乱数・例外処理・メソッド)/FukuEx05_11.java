/*
	�����Ȃ��A�߂�l����(�^�͎��R)�̃��\�b�h���D���Ɏ�����
	main���\�b�h�Ŏ��삵�����\�b�h�����p����v���O�������쐬���Ȃ���
*/


class FukuEx05_11{
	 
	/*	
		���\�b�h(�����Ȃ��A�߂�l����)
		���� :�Ȃ�
		�߂�l :
	 */
	 public static int getCoin(){
	 	return 1;
	 }

	/* ���C�����\�b�h */
	public static void main(String args[]){
		int coin = 0;
		coin += getCoin();
		coin += getCoin();
		coin += getCoin();
		coin += getCoin();
		coin += getCoin();
		coin += getCoin();
		coin += getCoin();
		coin += getCoin();
		coin += getCoin();
		coin += getCoin();
		System.out.println("�����R�C����" +coin );
	}
}
