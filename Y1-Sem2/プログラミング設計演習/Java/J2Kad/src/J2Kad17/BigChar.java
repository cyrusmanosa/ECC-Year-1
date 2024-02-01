package J2Kad17;

public class BigChar {
    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;
    private boolean[][] fontdata;
    public void draw(Canvas c){
        c.drawFont(fontdata);
    }

    public BigChar(char charname){
        fontdata = new boolean[WIDTH][HEIGHT];
        String letter = String.valueOf(charname).toUpperCase();

        System.out.println( letter + "Çì«Ç›çûÇ›Ç‹ÇµÇΩÅI");
    }
}

