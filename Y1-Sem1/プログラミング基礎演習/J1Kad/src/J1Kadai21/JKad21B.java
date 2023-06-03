package J1Kadai21;
import java.util.*;
public class JKad21B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [][] hostel = {
                {"�s�^�S���X","�A���L���f�X","���[�N���b�h","�G���g�X�e�l�X","�t�B�{�i�b�`"},
                {"�f�J���g","�t�F���}�[","�p�X�J��","�I�C���[","���v���X"}
        };
        System.out.print("�K������͂��Ă��������i0~1�j��");
        int floor = sc.nextInt();
        System.out.print("�����ԍ�����͂��Ă��������i0~4�j��");
        int room = sc.nextInt();
        if (floor < 0 || room < 0){
            sc.close();
        }
        System.out.println(floor + "�K��" + room + "�����ɂ�" + hostel[floor][room] + "�����܂��I");
    }
}
