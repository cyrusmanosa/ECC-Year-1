package J1Kadai16;

import java.util.*;
public class JKad16B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] people = {"�s�^�S���X" , "�A���L���f�X" , "���[�N���b�h" , "�G���g�X�e�l�X" , "�t�B�{�i�b�`"};
        int i;
        while(true) {
            System.out.print("�����������܂����H");
             i = in.nextInt();
             if ( i >= 0 && i < 5 ) {
                 System.out.println(people[i] + "���Z��ł��܂��I");
             }else{
                 System.out.println("����ȕ����ԍ��͂���܂���I");
             }
        }
    }
}
