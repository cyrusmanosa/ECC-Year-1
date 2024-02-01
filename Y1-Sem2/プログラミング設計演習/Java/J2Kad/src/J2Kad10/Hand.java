package J2Kad10;

public abstract class Hand {
    private String name;
    public Hand(String name) { this.name = name; }
    public String toString() { return name; }

    // vsHand‚ð’Ç‰Á
    protected abstract void vsHand();
}
