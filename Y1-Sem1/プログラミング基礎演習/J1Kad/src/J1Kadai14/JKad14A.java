package J1Kadai14;

import java.util.Scanner;
public class JKad14A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("������ECC �����Z���^�[�ł��I");
        System.out.println("�D�G�ȃX�^�b�t���Ή����܂��I");
        int a = (int) (Math.random()*100);
        System.out.println("���ԍ��F" + a + "���󂯕t�����I");
        System.out.print("�ǂ����܂����H�i1�F�Ή�����A����ȊO�F�����₾�j��");
        int b = in.nextInt();
        if ( b == 1 ) {
            if ( a < 20 ){
                nobita(1);
            }
            else if ( a % 3 == 0 ){
                nobita(0);
                jaian(1);
            }
            else if ( a %5 == 0) {
                nobita(0);
                jaian(0);
                suneo(1);
            }else{
                nobita(0);
                jaian(0);
                suneo(0);
                dekisugi();
            }
        }else{
            System.out.println("�����ꂳ�܂ł����I");
        }
    }

    public static void nobita(int n){
        System.out.println("�̂ё��u�ڂ��ɂ܂����āI�v");
        if (n == 1){
            System.out.println("�̂ё����Ή����܂����I");
        }else{
            System.out.println("�̂ё��u�E�E�E�W���C�A���A���肢�I�v");
        }
    }
    public static void jaian(int n){
        System.out.println("�W���C�A���u�I�����܂ɂ܂�����I�v");
        if (n == 1){
            System.out.println("�W���C�A�����Ή����܂����I");
        }else{
            System.out.println("�W���C�A���u�E�E�E�X�l�v�A���O�ɂ䂸���Ă��I�v");
        }
    }
    public static void suneo(int n){
        System.out.println("�X�l�v�u�ڂ��̏o�Ԃ��I�v");
        if (n == 1){
            System.out.println("�X�l�v���Ή����܂����I");
        }else{
            System.out.println("�X�l�v�u�E�E�E�o�ؐ��I�܂������I�v");
        }
    }
    public static void dekisugi(){
        System.out.println("�o�ؐ��u����Ȃ̊ȒP���v");
        System.out.println("�o�ؐ����Ή����܂����I");
    }
}
