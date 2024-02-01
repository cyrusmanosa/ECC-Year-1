/*
	課題名：J2Kad26D「TypeBエアコンの操作」
	作成日：2023/1/23
	作成者：田中太郎
*/

package J2Kad26.pac26a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Controller rc = new Controller();

        Aircon ac = new OldAirconAdapter();
        HumidifierTypeA hu = new HumidifierTypeA();
        DehumidifierTypeA de = new DehumidifierTypeA();

        rc.addCommand(new CmdSetCool(ac)).addCommand(new CmdSetWarm(ac)).
                addCommand(new CmdHmdOn(hu)).addCommand(new CmdHmdOff(hu)).
                addCommand(new CmdDeHmdOn(de)).addCommand(new CmdDeHmdOff(de));

        while(true) {
            rc.showCommand();
            System.out.print("どのボタンを押しますか？＞");
            int cmd = Integer.parseInt(in.next());
            if (cmd < 0) break;
            rc.pushButton(cmd);
            System.out.println();
        }
    }
}
