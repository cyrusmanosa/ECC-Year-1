import java.util.Scanner;

public class Kad16_2{
	
	//�͂܂����@(�T������:0�ȏ�, �T�����s:-1)
	public static �߂�l�̌^ ���\�b�h��(�����̌^ ������){
		
		int dc = 0;	//(�T���Ώە�����)�̈ʒu
		int sc = 0;	//(����������)�̈ʒu
		
		//���ʒu�����ꂼ��̕�����̖����ɒH����܂Ń��[�v
		
			//�T���Ώە�����ƌ��������񂩂甲���o����1��������v���Ă���ꍇ
			
				//�Ώە��������̕�����
				
				// �������������̕�����
				
			//�s��v�̏ꍇ
			
				//�T���ςݕ�����̎��̕�����
				
				//����������̐擪�̕����֏�����
				
			
		
		
		//����������J�[�\���ʒu�������������Ɠ����i���S��v�����j�ꍇ
		
			// �y�T�������z�����������������ʒu��Ԃ�
			
		
		// �y�T�����s�z������Ȃ������Ӗ���-1��Ԃ�
		
	}
	
	public static void main(String[] args){
		
		final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int result; // ���ʊi�[�p
		
		System.out.println("�f�[�^�F" + ALPHABET);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("����������");
		String inStr = sc.next();
		
		//�͂܂����T�����s���A���ʂ��i�[����
		result = �͂܂����@�̃��\�b�h���Ă�;
		// ���ʂ�-1�̏ꍇ
		
			// �y�T�����s�z
			System.out.println(inStr + "�͌�����܂���ł����B");
		// ����ȊO
			
			// �y�T�������z
			System.out.println(inStr + "��" + ���ʂ̕ϐ� + "�����ڂɌ�����܂����B");
		
	}
}