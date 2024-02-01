package J2Kad08;

public class OldAirconAdapter extends OldAircon implements IAircon {
    // 情報表示

    @Override
    public void showData() {
        super.showData();
    }

    // 電源ON/OFF
    public void powerOnOff(){
        if(getKnob() != 0) {
            switch (getKnob()){
                case 1:
                    turnLeft();
                    break;
                case 2:
                    turnLeft();
                    turnLeft();
                    break;
                case 3:
                    turnLeft();
                    turnLeft();
                    turnLeft();
                    break;
            }
        }else{
            turnRight();
        }
    }
    // 冷房へ切り換え
    public void toCool(){
        if( getKnob() < COOL ){
            turnRight();
        }else{
            turnLeft();
        }
    }
    // 暖房へ切り換え
    public void toHeat(){
        if( getKnob() < HEAT ){
            turnRight();
        }else{
            turnLeft();
        }
    }
    // 送風へ切り換え
    public void toBlow(){
        if ( getKnob() < BLOW){
            turnRight();
        }else if ( getKnob() == 2){
            turnLeft();
        }
    }
}
