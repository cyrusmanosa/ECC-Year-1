//Arrays�N���X���C���|�[�g


class Sample15_2a{
	public static void main(String[] args){
		int n = 100+1; // �ΏۂƂ������l�̍ő�l
		boolean[] flag = new boolean[n];
		
		// Arrays.fill(�Ώۂ̔z��, �J�n�ԍ�, �I���ԍ�, �i�[�������l);
		
		
		for(int i=0; i<n; i++){
			System.out.println("flag[" + i + "]=" + flag[i]);
		}
	}
}
