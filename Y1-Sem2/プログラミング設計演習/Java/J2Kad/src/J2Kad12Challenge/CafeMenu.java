package J2Kad12Challenge;

import java.util.ArrayList;

public class CafeMenu {
    private ArrayList<MenuItem> menu;
    public CafeMenu() {
        menu = new ArrayList<>();
        menu.add(new MenuItem("ドリップコーヒー", 390));
        menu.add(new MenuItem("アールグレイ", 430));
        menu.add(new MenuItem("オレンジジュース", 220));
    }
    public String toString() { return "ECCコーヒー"; }
    public ArrayList<MenuItem> getMenu() { return menu; }
}
