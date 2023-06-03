package J1Kadai23;

import java.util.Scanner;

public class TrySwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inCommand;
        System.out.print("�s������́@�U���F1/�h��:2/����:3/������:����ȊO>");
        inCommand = in.nextInt();
        switch (inCommand){
            case 1:
                System.out.println("�U������");
                break; //switch ���甲����
            case 2:
                System.out.println("�h�䂵��");
                break; //switch ���甲����
            case 3:
                System.out.println("������g�p����");
            default:
                System.out.println("�����o����");
        }
    }
}
