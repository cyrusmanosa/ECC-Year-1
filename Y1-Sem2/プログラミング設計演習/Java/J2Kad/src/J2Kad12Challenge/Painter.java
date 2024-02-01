package J2Kad12Challenge;

public class Painter implements IShape {
    private int x;
    private int y;
    public Painter(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void draw(Canvas c) { c.paint(x, y); }
}
