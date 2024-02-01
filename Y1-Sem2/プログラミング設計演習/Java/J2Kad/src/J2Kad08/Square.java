package J2Kad08;

public class Square extends Rectangle{
    private int[] x = new int[4];
    private int[] y = new int[4];

    public Square(int left, int top, int height){
        super(left,top,height,height);
        x[0] = left;			y[0] = top;
        x[1] = left + height;   y[1] = top;
        x[2] = left + height;	y[2] = top + height;
        x[3] = left;			y[3] = top + height;
    }

    public void draw(Canvas c) {
        for (int i = 0; i < 4; i++) {
            c.drawLine(x[i], y[i], x[(i + 1) % 4], y[(i + 1) % 4]);
        }
    }
}
