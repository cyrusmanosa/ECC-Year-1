package J2Kad22.pac22S;

public abstract class Bird {
    public abstract void fly();
    public abstract void swim();
    public abstract void evolve();
}
class Duck extends Bird {
    public Duck() {
        System.out.println("�ڂ��A�q���I");
        System.out.println("��ׂȂ����ǉj�����I");
    }
    public void fly() { System.out.println("���`��A��ׂȂ��I�I"); }
    public void swim() { System.out.println("�X�C�X�C�I���ʂ��j���ł��܂��I�I"); }
    public void evolve() {
        System.out.println("����ׂ�悤�ɂȂ����I�I");
    }
}
class Crow extends Bird {
    public Crow() {
        System.out.println("�����܃J���X�I");
        System.out.println("��Ԃ͓̂��ӂ����ǉj���Ȃ��񂾁I�I");
    }
    public void fly() { System.out.println("�o�^�o�^�I����΂��Ĕ��ł��܂��I�I"); }
    public void swim() { System.out.println("���`��A�j���Ȃ��I�I"); }
    public void evolve() {
        System.out.println("�W�F�b�g���˂𑕔��������I�I");
    }
}
class Seagull extends Bird {
    public Seagull() {
        System.out.println("���̓J�����I");
        System.out.println("�����ׂ邵�j�������ӂ��I�I");
    }
    public void fly() { System.out.println("�o�^�o�^�I����΂��Ĕ��ł��܂��I�I"); }
    public void swim() { System.out.println("�X�C�X�C�I���ʂ��j���ł��܂��I�I"); }
    public void evolve() {
        System.out.println("�����悤�ɂȂ����I�I");
    }
}
class Chicken extends Bird {
    public Chicken() {
        System.out.println("������j���g���I�I");
        System.out.println("��Ԃ̂��j���̂���肾�Ȃ��`");
    }
    public void fly() { System.out.println("���`��A��ׂȂ��I�I"); }
    public void swim() { System.out.println("���`��A�j���Ȃ��I�I"); }
    public void evolve() {
        System.out.println("����ׂ��I�j�����ł����I�I");
    }
}
