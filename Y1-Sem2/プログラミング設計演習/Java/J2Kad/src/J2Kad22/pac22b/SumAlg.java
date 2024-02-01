package J2Kad22.pac22b;

// �v�Z�A���S���Y��
interface SumAlg { void sum(int n);}

class NobitaAlg implements SumAlg { public void sum(int n) {
        System.out.println("�̂ё��F���`���A�킩��Ȃ���`");
    }}

class SuneoAlg implements SumAlg {
    public void sum(int n) {
        System.out.println("�X�l�v�F����Ȃ̊ȒP���B���Ԃɑ����Ă����΂����񂾁B");
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("�X�l�v�F" + i + "�𑫂���");
            sum += i;
        }
        System.out.println("�X�l�v�F������" + sum + "����I");
    }
}

class DekisugiAlg implements SumAlg {
    public void sum(int n) {
        System.out.println("�o�ؐ��F����Ȃ̊ȒP���B�ċA�������g���΂����񂾁B");
        int sum = recursion(n);
        System.out.println("�o�ؐ��F������" + sum + "����I");
    }
    private int recursion(int n) {
        System.out.println("�o�ؐ��F�����͍ċA����" + n + "����B");
        int rval = (n <= 1)? 1: recursion(n - 1) + n;
        System.out.println("�o�ؐ��F�Ăяo�����֖߂�ˁB");
        return rval;
    }
}

class SizukaAlg implements SumAlg {
    public void sum(int n) {
        System.out.println("�������F�t���ɕ��ׂĂ݂�΂����񂾂�B");

        for (int i = 1; i <= n; i++) {
            System.out.printf("%3d", i);
        }

        System.out.println();
        for (int i = 1; i <= n; i++) {
            System.out.printf("%3d", (n - i + 1));
        }
        System.out.println();

        System.out.println("�������F��Ɖ��𑫂��ƁE�E�E");
        for (int i = 1; i <= n; i++) {
            System.out.printf("%3d", (i + (n - i + 1)));
        }
        System.out.println();
        System.out.println("�������F�������I" + (n + 1) + " * " + n + "���v�Z���Ĕ����ɂ���΂����񂾂�I");
        System.out.println("�������F������" + ((n + 1) * n / 2) + "��I");
    }
}
