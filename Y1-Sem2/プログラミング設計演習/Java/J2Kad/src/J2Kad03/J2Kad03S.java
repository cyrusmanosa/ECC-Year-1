package J2Kad03;/*
    �ۑ薼�FJ2Kad03S�u3��ڂ̂�����?@�v
    �쐬���F2022/10/03
    �쐬�ҁF���Ər
 */
import java.util.*;

public class J2Kad03S {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack Nobita;
        Nobita = new Stack(5);
        System.out.println("�̂ё����������ɍs���܂�!");
        String[] store = {"ECC �R�[�q�[" , "ECC �o�[�K�[" , "ECC �h�[�i�c"};

        if( Nobita.isEmpty() ){ Nobita.push("�̂ё��̉Ƃł��B"); }

        while(true){
            System.out.print(Nobita.getData(Nobita.size() - 1) + "�ǂ��֍s���܂���?(0:ECC �R�[�q�[�A1:ECC �o�[�K�[�A2:ECC �h�[�i�c�A-1:�߂�)> ");
            int choose = in.nextInt();
            if ( choose < 0) {
                System.out.println("���Ɨ�������߂�܂��I");
                while( !Nobita.isEmpty() ) { System.out.println(Nobita.pop() + "�ɖ߂��Ă����I"); }
                break;
            } else {
                if ( Nobita.isFull()){
                    System.out.println("����ȏ�i�ނƋA��Ȃ���?");
                } else {
                    Nobita.push( store[choose] );
                }
            }
        }
    }
}
