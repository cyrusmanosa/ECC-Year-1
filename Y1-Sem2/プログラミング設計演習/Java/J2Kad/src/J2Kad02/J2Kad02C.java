package J2Kad02;

public class J2Kad02C {
    public static void main(String[] args) {
        Monster Diaruga;
        Diaruga = new Monster();
        Monster Koikingu;
        Koikingu = new Monster();

        Diaruga.setData("ディアルガ",1000);
        System.out.println(Diaruga.name + "が現れた！");
        Diaruga.showData();

        Koikingu.setData("コイキング",1);
        System.out.println(Koikingu.name + "が現れた！");
        Koikingu.showData();

        System.out.println(Diaruga.name + "を散歩させます！");
        Diaruga.walk();
        Diaruga.walk();
        Diaruga.walk();
        Diaruga.showData();

        System.out.println(Koikingu.name + "を散歩させます！");
        Koikingu.walk();
        Koikingu.walk();
        Koikingu.walk();
        Koikingu.showData();

    }
}
