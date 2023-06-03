package J1Kadai22;

public class JKad22C {
    public static void main(String[] args) {
        String [][] arrange = {
                {"�s�^�S���X","�A���L���f�X","���[�N���b�h","�G���g�X�e�l�X","�t�B�{�i�b�`"} ,
                {"�f�J���g","�t�F���}�[","�p�X�J��","�I�C���[","���v���X"} ,
                {"�t�[���G","�K�E�X"}
        };
        System.out.println("���]��ECC �̏Z�l�����ł��I");
        for (int i = 0; i < arrange.length;i++){
            System.out.print(i + "�K�̏Z�l�F");
            for (int j = 0 ; j < arrange[i].length;j++){
                System.out.print(j + ":" + arrange[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
