package J2Kad16;

public class Car {
    private static String[] nameData = {
            "���[�~�[",
            "�����X",
            "�A�N�A",
            "�p�b�\",
            "�V�G���^",
            "�m�A",
            "���H�N�V�[",
            "�J���[��",
            "�J����",
            "�v���E�X",
            "�n���A�[",
            "���C�Y",
            "RAV4",
            "�N���E��",
            "�X�[�v��",

            "N-VAN",
            "N-BOX",
            "N-WGN",
            "�A�R�[�h",
            "�C���T�C�g",
            "�V�r�b�N",
            "�t�B�b�g",
            "�X�e�b�v���S��",

            "���[�t",
            "�m�[�g",
            "�}�[�`",
            "���[�N�X",
            "�f�C�Y",
            "�G���O�����h",
            "�Z���i",
            "�G�N�X�g���C��",
            "GT-R",
            "�t�F�A���f�BZ",
            "�X�J�C���C��",

            "�A�E�g�����_�[",
            "�G�N���v�X",
            "�f���J",
            "�~���[�W��",

            "�A���g",
            "�n�X���[",
            "�X�y�[�V�A",
            "�X�C�t�g",
            "�\���I",

            "���[�u",
            "�^���g",
    };
    private static int rest = nameData.length;
    private String name;

    public Car() {
        int n = (int)(Math.random() * rest);
        name = nameData[n];
        rest--;
        nameData[n] = nameData[rest];
        nameData[rest] = name;
        if (rest == 0) rest = nameData.length;
    }
    public String toString() { return name; }
}
