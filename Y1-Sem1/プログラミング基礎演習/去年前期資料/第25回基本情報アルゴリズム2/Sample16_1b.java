class Sample16_1b{
	public static void main(String[] args){
		String str = "����������";
		String str2 = "����������";
		
		str += "";
		str2 += "";
		int n = 1;	// ������̈ʒu
		
		// �p�^�[���P
		// �y������.subString(�J�n�ʒu,�I���ʒu)�z�Ŏw�肵���l���������o��
		System.out.println("1�������������o��:"+str.substring(n,n+1));
		
		System.out.println("����1:" + (str.substring(n,n+1) == "��"));
		System.out.println("����2:" + (str == "����������"));
		System.out.println("����3:" + (str == str2));
		
		
	}
}
