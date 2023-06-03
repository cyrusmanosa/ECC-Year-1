package J1Kadai23;

import java.util.*;
public class JKad23A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("�u���v����͂��Ă���������");
        int month = sc.nextInt();
        if (month > 12){
            sc.close();
        }
        System.out.print("�u���v����͂��Ă���������");
        int day = sc.nextInt();

        if (month == 2 && day > 28){
            sc.close();
        }
        int all = day;
        for ( int i = 1; i <month; i++){
            switch (i) {
                case 1, 3, 5, 7, 8, 10, 12 -> all += 31;
                case 2 -> all += 28;
                case 4, 6, 9, 11 -> all += 30;
            }
        }

        System.out.println(all);
        switch (all % 7) {
            case 1 -> System.out.println(month + "��" + day + "���͓y�j���ł��I");
            case 2 -> System.out.println(month + "��" + day + "���͓��j���ł��I");
            case 3 -> System.out.println(month + "��" + day + "���͌��j���ł��I");
            case 4 -> System.out.println(month + "��" + day + "���͉Ηj���ł��I");
            case 5 -> System.out.println(month + "��" + day + "���͐��j���ł��I");
            case 6 -> System.out.println(month + "��" + day + "���͖ؗj���ł��I");
            case 0 -> System.out.println(month + "��" + day + "���͋��j���ł��I");
        }
    }
}