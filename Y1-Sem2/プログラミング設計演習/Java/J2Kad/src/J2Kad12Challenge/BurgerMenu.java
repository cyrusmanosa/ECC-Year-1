package J2Kad12Challenge;

import java.util.HashMap;

public class BurgerMenu {
    private HashMap<String, Integer> menu;
    public BurgerMenu() {
        menu = new HashMap<>() {
            {
                put("ハンバーガー", 150);
                put("チーズバーガー", 180);
                put("ビッグマック", 410);
            }
        };
    }
    public String toString() { return "ECCバーガー"; }
    public HashMap<String, Integer> getMenu() { return menu; }
}
