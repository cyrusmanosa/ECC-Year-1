package J2Kad20;

class Outer{ // �O���N���X
    void sampleMethod(){
        class Inner{ // �����N���X(�N���X�̒��ŃN���X�̐錾)
            void intro(){
                System.out.println("�����N���X�̃��\�b�h�����s����Ă��܂��B");
            }
        }
        System.out.println("�O���N���X�̃��\�b�h�����s����Ă��܂��B");

        Inner inner = new Inner(); // �����N���X�̃C���X�^���X�𐶐�
        inner.intro();
    }
}

public class Sample{
    public static void main(String[] args) {
        Outer outer = new Outer(); // �O���N���X�̃C���X�^���X�𐶐�
        outer.sampleMethod();
    }
}
