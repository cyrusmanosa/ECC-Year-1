package J2Kad25;

public class CafeMenu implements Menu{
    private MenuItem[] menu = new MenuItem[100];
    public CafeMenu() {
        menu[0] = new MenuItem("ドリップコーヒー", 390);
        menu[1] = new MenuItem("アールグレイ", 430);
        menu[2] = new MenuItem("オレンジジュース", 220);
        menu[3] = null;         // 終了コード
    }
    public MenuItem[] getMenu() { return menu; }
    public MenuIterator iterator() { return new CafeIterator( menu ); }
}

class CafeIterator implements MenuIterator{
    private MenuItem[] menu;
    private int i = 0;
    public CafeIterator(MenuItem[] menu){ this.menu = menu; }
    public boolean hasNext() { return menu[i] != null; }
    public MenuItem next() { return menu[i++]; }
}
