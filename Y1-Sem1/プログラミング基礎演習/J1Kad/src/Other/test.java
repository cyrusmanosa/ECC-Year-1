package Other;

class test {
	public static void main(String[] args){
		for (int i = 2;i<= 100;i++){		//1���s�����ɖ�s���a�ɁC���Ȝn2�J�n
		boolean k = true; //���О���
			for (int n = 2; n < i; n++) {
				if (i % n == 0) {
					k = false;  //�񎿝əBfalse
					break;
				}
			}
				if(k){
				System.out.println(i + " ");
				}
		}
	}
}