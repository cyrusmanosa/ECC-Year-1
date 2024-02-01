package J2Kad08;/*
	課題名：J2Kad08A「図形を描画しよう！」
	作成日：2022/10/24
	作成者：田中太郎
*/
import java.util.Scanner;

public class J2Kad08A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Canvas	c = new Canvas(40, 25);

        while(true) {
            System.out.print("何を描画しますか？（0：三角形、1：長方形、2：円、3：消去、4:正方形、-1：終了）＞");
            int	n = in.nextInt();
            if (n < 0) break;
            IShape shape;
            // ↓簡略化すること
            switch(n) {
                default:
                case 0:
                    shape = new Triangle(1, 22, 18, 9);break;
                case 1:
                    shape = new Rectangle(12, 3, 20, 14);break;
                case 2:
                    shape = new Circle(29, 9, 8);break;
                case 3:
                    shape = new Eraser();break;
                case 4:
                    shape = new Square(1,1,16);break;
            }
            shape.draw(c);

            c.show();
        }
    }
}
