package J2Kad06;

public class MasterPlayer extends BasePlayer {
    MasterPlayer(){ name = "Master"; }
    @Override
    public void intro() {
        super.intro();
    }
    public int takeStone(int stone) {
        stone = (stone + 3) % 4;
        return (stone != 0)? stone : 1;
    }
    protected String myStrategy() { return "ç≈ã≠Ç≈Ç∑ÅIÅI"; }
}
