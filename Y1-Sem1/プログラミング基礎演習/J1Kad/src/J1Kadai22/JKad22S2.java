package J1Kadai22;

public class JKad22S2 {
    public static void main(String[] args) {
        String [][][] arrange =
        {
        {
                {"�s�^�S���X", "�A���L���f�X", "���[�N���b�h", "�G���g�X�e�l�X", "�t�B�{�i�b�`"},
                {"�f�J���g", "�t�F���}�[", "�p�X�J��", "�I�C���[", "���v���X"},
                {"�t�[���G", "�K�E�X"}
        },
        {
                {"�h�E�����K��", "�u�[��", "���[�}��", "�|�A���J��"},
                {"���b�Z��", "�j���[�g��", "�e�C���["},
        }
        };
        System.out.println("���]��ECC �̏Z�l�����ł��I");
        for ( int i = 0; i < arrange.length;i++){
            System.out.println(i + "����");
            for (int j = 0; j < arrange[i].length;j++){
                System.out.print(j + "�K�̏Z�l�F");
                for (int k = 0; k < arrange[i][j].length;k++){
                    System.out.print(k + ":" + arrange[i][j][k] + " ");
                }
                System.out.println(" ");
            }
        }
    }
}
