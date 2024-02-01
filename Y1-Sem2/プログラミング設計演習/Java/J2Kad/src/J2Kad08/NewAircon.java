package J2Kad08;

public class NewAircon implements IAircon{
    int mode;
    boolean power;
    String[] modes = {"冷房","暖房","送風"};

    NewAircon(){
        power = false;
        mode = 0;

    }

    public void showData(){
        if( power == true ){
            System.out.println("電源：ON、運転モード:" + modes[mode]);
        }else{
            System.out.println("電源：OFF");
        }
    }
    public void powerOnOff(){
        if( power == false ){
            power = true;
            System.out.println("電源を入れました！");
        }else{
            power = false;
            System.out.println("電源を切りました！");
        }
    }
    public void toCool(){
        if( power == true ){
            mode = 0;
            System.out.println("冷房に切り換えました！");
        }else{
            System.out.println("電源が入っていません！");
        }
    }
    public void toHeat(){
        if( power == true ){
            mode = 1;
            System.out.println("暖房に切り換えました！");
        }else{
            System.out.println("電源が入っていません！");
        }
    }
    public void toBlow(){
        if ( power == true ){
            mode = 2;
            System.out.println("送風に切り換えました！");
        }else{
            System.out.println("電源が入っていません！");
        }
    }
}
