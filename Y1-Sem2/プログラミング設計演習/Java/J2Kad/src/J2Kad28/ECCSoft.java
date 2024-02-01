package J2Kad28;

public class ECCSoft {
    public ECCSoft() {
        System.out.println("�M���Ǝ��т�ECC�\�t�g������Ђł��I");
        System.out.println("�ǂ�ȉۑ�ł����������^���ɉ������܂��I�I");
    }

    public void work() {
        SubContractor sub;
        switch( (int)(Math.random() * 3) ) {
            default:
                case 0: sub = ECCService.getInstance();
                        break;
                case 1: sub = new ECCPartners();
                        break;
                case 2: sub = new ECCSolutions();
                        break;
        }
        System.out.println(sub + " (ID:" + sub.getMyID() + ") �Ɋۓ������܂��I");
        sub.work();
    }
}

// ������
abstract class SubContractor {
    private String name;
    private static int count = 0;
    private int myID;
    public int getMyID(){ return myID; }
    public SubContractor(String name) {
        myID = count++;
        this.name = name;
    }
    public String toString() { return name; }
    public abstract void work();
}

// ECC�T�[�r�X�������
class ECCService extends SubContractor {
    private static ECCService instance = new ECCService();
    public static ECCService getInstance(){ return instance; }
    private ECCService() { super("ECC�T�[�r�X�������"); }
    public void work() { System.out.println("ECC�T�[�r�X������Ёu���Ƃ�����΂��Ă݂܂��I�v"); }
}
// ECC�p�[�g�i�[�Y�������
class ECCPartners extends SubContractor {
    public ECCPartners() { super("ECC�p�[�g�i�[�Y�������"); }
    public void work() { System.out.println("ECC�p�[�g�i�[�Y������Ёu�������͂炢�ȁ[�I�v"); }}

// ECC�\�����[�V�����Y�������
class ECCSolutions extends SubContractor {
    public ECCSolutions() { super("ECC�\�����[�V�����Y�������"); }
    public void work() { System.out.println("ECC�\�����[�V�����Y������Ёu��낱��ł������󂯂������܂��I�v"); }}

