/*
enum�̉��p

�@enum���ȉ��̂悤�ɉ�������B

enum Month {
    JANUARY, FEBRUARY, MARCH,
    APRIL, MAY, JUNE,
    JUKY, AUGUST, SEPTEMBER,
    OCTOBER, NOVEMBER, DECEMBER
}

	��

enum Month {
    JANUARY(1), FEBRUARY(2), MARCH(3),
    APRIL(4), MAY(5), JUNE(6),
    JUKY(7), AUGUST(8), SEPTEMBER(9),
    OCTOBER(10), NOVEMBER(11), DECEMBER(12);
		
    public int month;		// enum�̊e�v�f��month�Ƃ����f�[�^����������
		
    private Month(int month) {
        this.month = month;	// �e�v�f��month�ithis.month�̂��Ɓj�ɒl��ݒ肷��iJANUARY(1)�ł���΃J�b�R����1��JANUARY��month�ɐݒ肳���j
    }
}

�A�v���O�����R�[�h���ȉ��̂悤�ɉ�������B

int month = 1;	//��
for(Month m : �`�ȗ��`){
    System.out.println (month + "�� = " + �`�ȗ��`);
    month++;	//���C���N�������g
}

	��

for(Month m : �`�ȗ��`){
    System.out.println (m.month + "�� = " + �`�ȗ��`);		// m.month��m�̎���month�̒l�̂���
}

�BKad12_1�Ɠ������ʂɂȂ邩�m�F���邱�ƁB


*/


public class Ex12_1 {
	enum Month {
	    JANUARY, FEBRUARY, MARCH,
	    APRIL, MAY, JUNE,
	    JUKY, AUGUST, SEPTEMBER,
	    OCTOBER, NOVEMBER, DECEMBER
	}

	public static void main(String[] args) {
		
		System.out.println("*** �񋓌^�萔���g��for���ŕ\���I ***");
		int month = 1;	//��
		for (Month m : Month.values()) {
			System.out.println(month + "�� = " + m);
			month++;	//���C���N�������g
		}
	}
}
