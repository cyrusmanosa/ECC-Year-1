/*

�����s���ʁ�
  |  ��  |  ��  |  ��  |  ��  |  ��  |
--------------------------------------
1 | ���� | ���w | ���� | �Љ� | ���� |
2 | ���w | ���� | �Љ� | ���� | ���w |
3 | �Љ� | ���� | ���� | ���� | ���w |
4 | �p�� | �Љ� | �p�� | �p�� | �p�� |




���̃v���O����

public class FukuEx04_14{
	public static void main(String[] args){
	
		//�j��
		 final char[] DAYS = {'��', '��', '��', '��', '��'};
		 //����
		 final String[] SUBS = {"����", "���w",   �T  ,   �V  ,   �X  };
		 //���Ԋ�
		 int[][] timeTable = {{0, 1, 0, 3, 2},
							 	  {     �Z     },
								  {3, 2, 2, 0, 1},
								  {     �\     }};
        
		//�j���\��
		 System.out.print("  |  ");
		 for( �^  day :   �`  ){
		     System.out.print(day + "  |  ");
		 }
		 //�r���\��
		 System.out.print("\n--------------------------------------");
		
		 //���ȕ\��
		 for(int i = 0; i < timeTable.length; i++){
		     System.out.print("\n" +    �c    + " | ");
		     for(int j = 0; j < timeTable    �e    ; j++){
			      System.out.print(          �g           + " | ");
		     }
		 }
	}
}
*/


public class FukuEx04_14{
	public static void main(String[] args){
	
		//�j��
		final char[] DAYS = {'��', '��', '��', '��', '��'};
		//����
		final String[] SUBS = {"����", "���w",   �T  ,   �V  ,   �X  };
		//���Ԋ�
		int[][] timeTable = {{0, 1, 0, 3, 2},
							 	  {     �Z     },
								  {3, 2, 2, 0, 1},
								  {     �\     }};
        
		//�j���\��
		 System.out.print("  |  ");
		 for( �^  day :   �`  ){
		     System.out.print(day + "  |  ");
		 }
		 //�r���\��
		 System.out.print("\n--------------------------------------");
		
		 //���ȕ\��
		 for(int i = 0; i < timeTable.length; i++){
		     System.out.print("\n" +    �c    + " | ");
		     for(int j = 0; j < timeTable    �e    ; j++){
			      System.out.print(          �g           + " | ");
		     }
		 }
	}
}
