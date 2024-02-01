package J2Kad06;

public class CompPlayer extends BasePlayer {
    CompPlayer(){
        name = "Comp";
    }

    @Override
    public void intro() {
        super.intro();
    }
    public int takeStone(int stone) {
        switch(stone) {
            case 1:
                return 1;
            case 2:
            case 3:
            case 4:
                return stone - 1;
            case 6:
            case 7:
            case 8:
                return stone - 5;
        }
        return super.takeStone(stone);
    }
    protected String myStrategy() { return "è≠Çµã≠Ç¢Ç≈Ç∑ÅB"; }
}
