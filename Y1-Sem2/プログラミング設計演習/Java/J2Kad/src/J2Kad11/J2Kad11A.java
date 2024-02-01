package J2Kad11;

public class J2Kad11A {
    public static void main(String[] args) {

        MyArray list = new MyArray();

        System.out.println("データを格納します！");
        for (int i = 0; i < list.size(); i ++){
            list.add(new Monster());
            System.out.println("add : " + list.get(i) );
        }

        System.out.println();

        System.out.println("データを格納します！");
        for (int i = 0; i < list.size(); i ++){
            System.out.println("get : " + list.get(i) );
        }
    }
}
