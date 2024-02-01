package J2Kad21;

public class Point implements Comparable<Point> {
    public int x, y;

    public Point() {
        this.x = (int)(Math.random() * 50);
        this.y = (int)(Math.random() * 50);
    }
    public void printInfo() {
        System.out.printf("(%2d, %2d)\tx + y = %d\n", x, y, (x + y));
    }
    @Override
    public int compareTo(Point other){
        return (this.x + this.y) - (other.x + other.y);
    }
}