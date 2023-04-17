import java.util.*;

class JankenGAMESample{
	public static void main(String args[]){
		/* �錾�� */
		
		// �Q�[�����[�h
		final int NOMAL = 0;
		final int HARD = 1;
		int mode = NOMAL;	// nomal:0  / hard:1
		
		// �\������
		final String WIN = "���Ȃ��̏���";
		final String DROW = "������";
		final String LOSE = "���Ȃ��̕���";
		final String HANDS[] = {"�O�[","�`���L","�p�["};
		final String RESULTS_MSG[][] = {  {DROW,WIN,LOSE},
									{LOSE,DROW,WIN},
									{WIN,LOSE,DROW}};
		// �R�C���ϓ��l							
		final int resultCoin[][] = {  {1,2,0},
								{0,1,2},
								{2,0,1} };
		// ��̎��ʕϐ�
		final int GU = 0;
		final int CHOKI = 1;
		final int PA = 2;
		
		// cpu�̎��ݒ�(�n�[�h���[�h�p)
		final int cpuAI[][] = {{PA,GU,CHOKI},{GU,CHOKI,PA},{CHOKI,PA,GU}};
		final int CPU_WIN = 0;
		final int CPU_DROW = 1;
		final int CPU_LOSE = 2;
		
		// �R�C�������l
		int myCoin = 10;
		
		// �p���m�F�p�̔��蕶����
		final String YES01 = "yes";
		final String YES02 = "y";
		
		// player��cpu�̎�̕ϐ���`(-1�̓G���[�m�F�p)
		int inPlayerHand = -1;
		int cpuHand = -1;
		// ���͗p
		Scanner in = new Scanner(System.in);
		
		/* ������ */
		System.out.println("����񂯂�Q�[�����J�n���܂��I");
		System.out.println("���Ȃ��̎����R�C����" + myCoin + "�ł�");
		
		System.out.print("1���g���Ă���񂯂񂵂܂����H yes/no  >");
		String inPlay = in.next();
		
		// yes����͂��Ă���Ԃ͂���񂯂�GAME���J��Ԃ�
		while((inPlay.equals(YES01)) || (inPlay.equals(YES02))){
			myCoin--;	// 1������
			// �I�����̐ݒ�
			do{
				System.out.println("����ł͂����܂��I����񂯂�E�E�E");
				System.out.print("�O�[:0 / �`���L:1 �p�[:2 >");
				inPlayerHand = in.nextInt();
				if(inPlayerHand < 0 || 2 < inPlayerHand){
					System.out.println("�I�����̐�����I��łˁI");
				}				
			}while(inPlayerHand < 0 || 2 < inPlayerHand);
			
			System.out.println("���Ȃ��̎��"+HANDS[inPlayerHand]);
			
			// �v���C���[�h�ɂ�蕪��
			if(mode == HARD){
				// �n�[�h���[�h(���X���ĂȂ�)
				// CPU�̎�𐶐�
				cpuHand = (int)(Math.random() * 15);
				System.out.println("cpu�̗���:" + cpuHand);
				switch(cpuHand){
					case 0:
						cpuHand = cpuAI[CPU_LOSE][inPlayerHand];
						break;
					case 1,2,3:
						cpuHand = cpuAI[CPU_DROW][inPlayerHand];
						break;
					default:
						cpuHand = cpuAI[CPU_WIN][inPlayerHand];
				}
				System.out.println("cpu�̎��"+HANDS[cpuHand]);
			}else{
				// �m�[�}�����[�h(�����͔���)
				// CPU�̎�𐶐�
				cpuHand = (int)(Math.random() * 3);
				System.out.println("cpu�̎��"+HANDS[cpuHand]);
			}
			// ���ʏ���
			System.out.println(RESULTS_MSG[inPlayerHand][cpuHand]);
			myCoin += resultCoin[inPlayerHand][cpuHand];
			
			// �p���m�F
			System.out.println("\n���Ȃ��̎����R�C����" + myCoin + "�ł�");
			System.out.print("�����Ă���񂯂񂵂܂����H yes/no  >");
			inPlay = in.next();
		}
		
		// GAME�I��
		System.out.println("�o�C�o�[�C�I");
	}
}