package J2Kad02;

public class J2Kad02B {
    public static void main(String[] args) {
        int x = 10;
        addInt(x);
        System.out.println("x:" + x);
        int[] a = new int[3];
        for (int y = 0; y < a.length; y++){
            a[y] = y;
        }

        addArray(a);

        System.out.print("a:");

        for (int i : a) {
            System.out.print(i + " ");
        }

        System.out.println(" ");

        Monster pikachiu;
        pikachiu = new Monster();
        pikachiu.setData("ピカチュウ",20);

        addHp(pikachiu);
        pikachiu.showData();
    }

    public static void addInt(int x){
        x+=5;
        System.out.println("xに5を加算しました！");
    }
    public static void addArray(int[] b){
        for (int x = 0; x < b.length;x++){
            b[x] += 5;
            System.out.println("b[" + x + "]に5を加算しました！");
        }
    }
    public static void addHp(Monster m){
        m.hp+=5;
        System.out.println(m.name + "のHPに5を加算しました！");
    }
}
