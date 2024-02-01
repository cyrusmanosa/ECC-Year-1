package J2Kad23.pac23c;

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

class MenuList implements Component{
    protected String title;
    protected List<MenuItem> menuList = new ArrayList<>();
    public MenuList(String title) { this.title = title; }
    public void add(MenuItem item) { menuList.add(item); }
    public void print() {
        System.out.println();
        System.out.println(title);
        for (MenuItem item : menuList) { item.print(); }
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

interface Component{ void print(); }