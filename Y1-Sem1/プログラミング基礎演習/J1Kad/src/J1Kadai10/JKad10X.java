import java.util.Scanner;

class JKad10X{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("����񂯂�����܂��I");
		System.out.print("���̎���o���܂����H�i0�F�O�[�A1�F�`���L�A2�F�p�[��");
		int num = in.nextInt();
		String C;
		
		if (num == 0){
			C = "�O�[";
			System.out.println("���Ȃ���" + C + "���o�����I");
		}else if (num == 1){
			C = "�`���L";
			System.out.println("���Ȃ���" + C + "���o�����I");
		}else if (num == 2){
			C = "�p�[";
			System.out.println("���Ȃ���" + C + "���o�����I");
		}
		
		String[] janken = {"�O�[" , "�`���L" , "�p�["};
		int i = (int)(Math.random()*3);
		System.out.println("�R���s���[�^��" + janken[i] + "���o�����I");
		
		if (num == i){
			System.out.println("��������!");
		}
		else if (num > i  || num == 0 && i == 2){
			System.out.println("���Ȃ��̕����I");
		}
		else if (num < i || num == 2 && i == 0){
			System.out.println("���Ȃ��̏����I");
		}
	}
}