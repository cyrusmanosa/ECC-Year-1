/**
 * for���ō쐬���Ă���v���O�����ł���
 * ���������ƂȂ�悤��
 * �g��for���ł̏�����ǉ����Ă��������I
 * 
 */
 
/*
  [���s����]
	 *** �ʏ��for���ŕ\�����܂��I ***
	11, 12, 13,
	21, 22, 23,
	31, 32, 33,
	*** �g��for���ŕ\�����܂��I ***
	11, 12, 13,
	21, 22, 23,
	31, 32, 33,
 */

public class FukuEx04_12 {
	public static void main(String[] args) {
		int[][] numbers = {
			{11, 12, 13},
			{21, 22, 23},
			{31, 32, 33},
		};
		
		// �ʏ��for��
		System.out.println("*** �ʏ��for���ŕ\�����܂��I ***");
		for (int row = 0; row < numbers.length; row++) {
			int[] rows = numbers[row];
			for (int col = 0; col < rows.length; col++) {
				int val = numbers[row][col];
				System.out.print(val + ", ");
			}
			System.out.println();
		}
		
		// �g��for��
		System.out.println("*** �g��for���ŕ\�����܂��I ***");
		
		
		
	}
}
