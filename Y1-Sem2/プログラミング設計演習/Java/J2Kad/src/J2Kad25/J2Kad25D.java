package J2Kad25;
/*
	�ۑ薼�FJ2Kad25D�uECC�t�[�Y�i���[�v�̕��K�j�v
	�쐬���F2023/1/19
	�쐬�ҁF�c�����Y
*/
import java.util.Scanner;
public class J2Kad25D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("���E�ɂ͂΂���ECC�t�[�Y�I");
        System.out.println("��������M&A�Ŋg�咆�I�I");
        while (true) {
            System.out.print("�ǂ̃��j���[��\�����܂����H�i0�FECC�R�[�q�[�A1�FECC�h�[�i�c�A-1�F�I���j��");
            int shop = Integer.parseInt(in.next());
            if (shop < 0) break;
            switch(shop) {
                default:
                case 0:     // ECC�R�[�q�[
                    CafeMenu CM = new CafeMenu();
                    MenuItem[] c = CM.getMenu();
                    for ( int i = 0; c[i] != null ; i++){
                        c[i].print();
                    }
                    break;
                case 1:     // ECC�h�[�i�c
                    DonutMenu DM = new DonutMenu();
                    String[] n = DM.getNames();
                    int[] p = DM.getPrices();
                    for(int i = 0; n[i] != null; i++){
                        MenuItem item = new MenuItem(n[i],p[i]);
                        item.print();
                    }
                    break;
            }
            System.out.println();
        }
    }
}
