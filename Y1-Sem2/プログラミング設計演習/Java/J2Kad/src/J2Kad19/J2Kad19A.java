package J2Kad19;
/*
	�ۑ薼�FJ2Kad19A�uECC�싅���I�v
	�쐬���F2022/12/5
	�쐬�ҁF�c�����Y
*/
import java.util.Scanner;
public class J2Kad19A {
    enum BALL {STRAIGHT, CURVE, FORKBALL}
    public static void main(String[] args) {
        System.out.println("���Ȃ���ECC�싅���̖��L���b�`���[�ł��I");
        System.out.println("�T�C�����o���ăs�b�`���[�̋����L���b�`���Ă��������I");
        Scanner in = new Scanner(System.in);
        BALL[] balls = BALL.values();
        while (true) {
            try {
                System.out.print("���̃T�C�����o���܂����H�i0�F�����A1�F�J�[�u�A2�F�t�H�[�N�A-1�F�I���j�� ");
                int num = Integer.parseInt(in.next());
                if (num < 0) break;
                throwBall(balls[num]);
            } catch (Straigt  e) {
                System.out.println("Straight: �X�g���[�g�𓊂����I");
                System.out.println("�L���b�`���܂����I");
            } catch (Curve e) {
                System.out.println("Curve: �J�[�u�𓊂����I");
                System.out.println("�L���b�`���܂����I");
            } catch (Forkball e) {
                System.out.println("ForkBall: �t�H�[�N�{�[���𓊂����I");
                System.out.println("�L���b�`���܂����I");
            } catch (Exception z) {System.out.println("����ȋ���͂���܂���I");}
            System.out.println();
        }
    }
    public static void throwBall(BALL ball) throws Straigt, Curve, Forkball{
        switch(ball) {
            case STRAIGHT -> throw new Straigt();
            case CURVE -> throw new Curve();
            case FORKBALL -> throw new Forkball();
        }
    }
    private static class Straigt extends Exception { }
    private static class Curve extends Exception { }
    private static class Forkball extends Exception { }
}

