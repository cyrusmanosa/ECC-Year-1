package J2Kad12Challenge;

import java.util.Scanner;

public class J2Challenge12X {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Canvas	c = new Canvas(40, 25);

        while(true) {
            System.out.print("何を描画しますか？（0：消去、1：三角形、2：長方形、3：円、4:正方形、5：ペイント、-1：終了）＞");
            int	n = in.nextInt();
            if (n < 0) break;

            IShape shape;
            switch(n) {
                default:
                case 0: shape = new Eraser();                                       break;
                case 1: shape = new Triangle(1, 22, 18, 9);  break;
                case 2: shape = new Rectangle(12, 5, 20, 14);   break;
                case 3: shape = new Circle(29, 9, 8);                       break;
                case 4: shape = new Square(1, 1, 16);                  break;
                case 5: shape = new Painter(19, 11);                            break;
            }
            shape.draw(c);
            c.show();
        }
    }
}
