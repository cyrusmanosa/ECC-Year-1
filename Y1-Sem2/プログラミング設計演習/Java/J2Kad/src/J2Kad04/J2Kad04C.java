package J2Kad04;

/*
    課題名：J2Kad04C
    作成日：2022/10/06
    作成者：田中太郎
 */
public class J2Kad04C {
    public static void main(String[] args) {
        System.out.println("1");
        Sheep.countSheep();

        System.out.println("2");
        System.out.println("羊を2 匹連れてきます！");
        Sheep.countSheep();

        System.out.println("3");
        Sheep.countSheep();

        System.out.println("4");
        System.out.println("羊を3 匹（配列で）連れてきます！");
        Sheep[] sheeps = new Sheep[3];

        Sheep.countSheep();

        System.out.println("5");
        sheeps[0] = new Sheep();
        sheeps[1] = new Sheep();
        sheeps[2] = new Sheep();
        Sheep.countSheep();

    }
}
