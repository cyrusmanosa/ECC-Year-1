package J2Kad16;
/*
	�ۑ薼�FJ2Kad16B�u�������I��s�֍s�����I�I�i�X���b�h�Łj�v
	�쐬���F2022/11/24
	�쐬�ҁF�c�����Y
*/
public class J2Kad16B {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("������a����̂Ȃ�M�p�ƐM����ECC��s�ցI");
        // �a���҂̕�W
        Customer[] C = new Customer[100];
        for ( int i = 0 ; i < C.length; i ++) { C[i] = new Customer(); }
        // �a���X�^�[�g
        for ( var t : C) { t.start(); }
        // �X���b�h�����̏I���҂�
        for (var t : C) {
            try {
                t.join();
            } catch(InterruptedException e) {
                System.out.println(e);
            }
        }
        // �a���z�̕\��
        System.out.println("�a���z��" + Bank.getMoney() + "�~�ł��I");
    }
}
class Bank{
    private static int money = 0;
    public static int getMoney(){ return money; }
    public static synchronized void addOneYen(){ money++; }
}

class Customer extends Thread {
    Customer() { System.out.println("�a���҂�����Ă����I�u����΂��Ă�����a���邼�I�v"); }
    public void run(){
        for (int i = 0 ; i < 10000 ; i++ ) { Bank.addOneYen(); }
    }
}