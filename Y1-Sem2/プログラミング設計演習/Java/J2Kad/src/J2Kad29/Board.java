package J2Kad29;

public class Board {
    private final int HEIGHT = 10;          // �c
    private final int WIDTH = 20;           // ��
    private final int MINE = 25;            // �n���̐�
    public Board() {
        // �}�X�ڂ̐���
    }
    public void show() {
        System.out.println("  �`�a�b�c�d�e�f�g�h�i�j�k�l�m�n�o�p�q�r�s");
        for (int y = 0; y < HEIGHT; y++) {
            System.out.print(y + " ");
            for (int x = 0; x < WIDTH; x++) {
                // �}�X�ڂ̕\��
                System.out.print("��");
            }
            System.out.println(" " + y);
        }
        System.out.println("  �`�a�b�c�d�e�f�g�h�i�j�k�l�m�n�o�p�q�r�s");
    }
}
