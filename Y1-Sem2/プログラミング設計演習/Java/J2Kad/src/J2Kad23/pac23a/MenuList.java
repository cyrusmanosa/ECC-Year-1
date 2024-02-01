package J2Kad23.pac23a;

import java.util.ArrayList;
import java.util.List;

class MenuItem implements Component{
    private String name;
    private int price;
    public MenuItem(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public void print() { System.out.println(name + "：" + price); }
}
public class MenuList implements Component{
    protected String title;
    protected List<Component> menuList = new ArrayList<>();

    public MenuList(String title) { this.title = title; }
    public void add(Component item) { menuList.add(item); }
    public void print() {
        System.out.println();
        System.out.println(title);
        for (Component item : menuList) {
            item.print();
        }
    }
}

interface Component{ void print();}

// サブメニュー
class DrinkMenu extends MenuList {
    public DrinkMenu() {
        super("＊ ドリンクメニュー ＊");
        add(new MenuItem("コーヒー", 220));
        add(new MenuItem("紅茶", 220));
    }
}
class DessertMenu extends MenuList {
    public DessertMenu() {
        super("＊ デザートメニュー ＊");
        add(new MenuItem("チーズケーキ", 350));
        add(new MenuItem("アイスクリーム", 150));
    }
}
// メインメニュー
class MorningMenu extends MenuList {
    public MorningMenu() {
        super("★ モーニングメニュー ★");
        add(new MenuItem("モーニングセット", 400));
        add(new MenuItem("焼き魚定食", 600));
    }
}
class LunchMenu extends MenuList {
    public LunchMenu() {
        super("★ ランチメニュー ★");
        add(new MenuItem("日替わりランチ", 680));
        add(new MenuItem("シェフのおすすめランチ", 890));
        // サブメニューの追加
        add(new DrinkMenu());
    }
}
class DinnerMenu extends MenuList {
    public DinnerMenu() {
        super("★ ディナーメニュー ★");
        add(new MenuItem("和風ハンバーグ", 680));
        add(new MenuItem("サーロインステーキ", 1180));
        // サブメニューの追加
        add(new DrinkMenu());
        add(new DessertMenu());

    }
}

class AllMenu extends MenuList{
    public AllMenu(){
        super("★★★ すべてのメニュー ★★★");
        add(new MorningMenu());
        add(new LunchMenu());
        add(new DinnerMenu());
    }
}
